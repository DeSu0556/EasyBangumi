plugins {
    id("java-library")
    alias(build.plugins.kotlin.jvm)
}
kotlin {
    jvmToolchain(11)

}
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}