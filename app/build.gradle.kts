plugins {
    id("com.android.application")
}

android {
    namespace = "fpt.edu.fumic"
    compileSdk = 34

    defaultConfig {
        applicationId = "fpt.edu.fumic"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("com.squareup.picasso:picasso:2.71828")
    //noinspection GradleCompatible
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.gridlayout:gridlayout:1.0.0")
    annotationProcessor("androidx.room:room-compiler:2.6.1")
    androidTestImplementation("androidx.room:room-testing:2.6.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation ("io.github.shashank02051997:FancyToast:2.0.2")
    implementation("com.airbnb.android:lottie:6.3.0")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    implementation ("com.github.bumptech.glide:glide:4.16.0")
}