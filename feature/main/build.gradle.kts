plugins {
    id("convention.android.library")
    id("convention.android.feature")
}

android {
    namespace = "dgsw.proj.main"
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}