package com.example.faked_kmp.domain

import kotlinx.coroutines.delay
import kotlin.random.Random

class GetUseCase {

    private var isStateCalledBefore = false

    suspend fun get(action: Action): UseCaseResult {
        return when (action) {
            Action.State -> {
                delay(2000)
                if (!isStateCalledBefore) {
                    isStateCalledBefore = true
                    UseCaseResult.Error(ErrorModel(description = "FAKED ERROR", buttonTitle = "повторить"))
                } else {
                    UseCaseResult.Loaded(LoadedModel(title = "FAKED", buttonTitle = "сменить цвет"))
                }
            }
            Action.Color -> {
                UseCaseResult.ColorChanged(
                    CustomColor(
                        red = Random.nextInt(256),
                        green = Random.nextInt(256),
                        blue = Random.nextInt(256)
                    )
                )
            }
        }
    }
}
