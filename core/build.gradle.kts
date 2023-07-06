plugins {
}

dependencies {
    compileOnly(project(":api"))
    implementation("com.github.luben:zstd-jni:1.5.2-2")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
