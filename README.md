# AOSP-template-host

使用的AOSP开源的Template代码 https://android.googlesource.com/platform/packages/apps/Car/Templates/

## guide

https://source.android.com/devices/automotive/start/whats_new

https://source.android.com/devices/automotive/hmi/aosp_host

https://developer.android.google.cn/jetpack/androidx/releases/car-app

当前版本只适配到1.2.0-rc01
dependencies {
    implementation "androidx.car.app:app:1.2.0-rc01"

    // For Android Auto specific functionality
    implementation "androidx.car.app:app-projected:1.2.0-rc01"

    // For Android Automotive specific functionality
    implementation "androidx.car.app:app-automotive:1.1.0"

    // For testing
    testImplementation "androidx.car.app:app-testing:1.2.0-rc01"
}