plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.ksp)
}

android {
    namespace = "yegor.cheprasov.data.database"
}

dependencies {
    implementation(libs.room.runtime)
    ksp(libs.room.compiler)
}