package com.example.faked_kmp.domain

sealed class UseCaseResult {
    data class Loaded(val model: LoadedModel) : UseCaseResult()
    data class Error(val model: ErrorModel) : UseCaseResult()
    data class ColorChanged(val color: CustomColor) : UseCaseResult()
}
