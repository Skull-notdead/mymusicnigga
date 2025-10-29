/*
This file tells Android Studio how to build your app and
what libraries it needs (dependencies).
*/
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.musicapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.musicapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    
    buildFeatures {
        viewBinding = true
    }
}

// These are the new libraries we need for the UI
dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    
    // NEW: For CoordinatorLayout, CardView, etc.
    implementation("com.google.android.material:material:1.11.0") 
    
    // NEW: For NestedScrollView
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") 
}

