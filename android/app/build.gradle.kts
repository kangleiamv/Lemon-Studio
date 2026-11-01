plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "org.lemonstudio.android"
    compileSdk = 35

    defaultConfig {
        applicationId = "org.lemonstudio.android"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }

    sourceSets["main"].jniLibs.srcDirs("src/main/jniLibs")
}
