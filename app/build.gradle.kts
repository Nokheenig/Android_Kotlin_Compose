plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.compose"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.compose"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }
    kotlinOptions {
        jvmTarget = "19"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.2"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    //////////////////////////////////////////////////////
    //Dependencies added at project creation:
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    testImplementation("junit:junit:4.13.2")

    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")


    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    //implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    //implementation("androidx.compose.material3:material3")




    
    //////////////////////////////////////////////////////////////
    //New and latest dependencies for compose :
    implementation ("androidx.compose.animation:animation:1.6.6")
    implementation ("androidx.compose.foundation:foundation:1.6.6")
    implementation ("androidx.compose.material:material:1.6.6")
    implementation ("androidx.compose.material3:material3:1.2.1")
    implementation ("androidx.compose.runtime:runtime:1.6.6")
    implementation ("androidx.compose.ui:ui:1.6.6")

    // glance
    // For AppWidgets support
    //implementation ("androidx.glance:glance-appwidget:1.0.0")

    // For Wear-Tiles support
    //implementation ("androidx.glance:glance-wear-tiles:1.3.0")

    // wear
    //implementation ("androidx.wear.compose:compose-foundation:1.3.1")
    //implementation ("androidx.wear.compose:compose-material:1.3.1")
    //implementation ("androidx.wear.compose:compose-navigation:1.3.1")
    // NOTE: DO NOT INCLUDE androidx.compose.material:material


    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
    val nav_version = "2.6.0"
    implementation("androidx.navigation:navigation-compose:$nav_version")
}