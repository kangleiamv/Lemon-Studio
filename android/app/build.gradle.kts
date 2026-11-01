plugins {
    id("com.android.application")
}

android {
    namespace = "org.lemonstudio.android"
    compileSdk = 35

    defaultConfig {
        applicationId = "org.lemonstudio.android"
        minSdk = 29
        targetSdk = 35
        versionCode = 2
        versionName = "0.2.0"

        ndk {
            abiFilters += listOf("arm64-v8a", "x86_64")
        }
    }

    sourceSets["main"].jniLibs.srcDirs("src/main/jniLibs")
}
