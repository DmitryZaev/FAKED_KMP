// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "FAKEDShared",
    platforms: [
        .iOS(.v16)
    ],
    products: [
        .library(
            name: "FAKEDShared",
            targets: ["Shared"]
        )
    ],
    targets: [
        .binaryTarget(
            name: "Shared",
            url: "https://github.com/DmitryZaev/FAKED_KMP/releases/download/1.0.0/Shared.xcframework.zip",
            checksum: "d22f7ec7696212c05e3fbf159c4499f22f9eeae201e25b79b89e42cfed61e3da"
        )
    ]
)
