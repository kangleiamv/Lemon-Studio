plugins {
    id("com.android.application")
}

android {
    namespace = "org.lemonstudio.android"
    compileSdk = 35

    defaultConfig {
        applicationId = "org.lemonstudio.android"
        minSdk = 26
        targetSdk = 35
        versionCode = 2
        versionName = "0.2.0"

        ndk {
            abiFilters += "arm64-v8a"
        }
    }

    sourceSets["main"].jniLibs.srcDirs("src/main/jniLibs")
}
