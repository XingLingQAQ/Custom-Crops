repositories {
    mavenCentral()
    maven("https://www.matteodev.it/spigot/public/maven/")
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly(project(":api"))
    compileOnly("io.papermc.paper:paper-api:1.21.4-R0.1-SNAPSHOT")
    compileOnly("dev.lone:api-itemsadder:4.0.10")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.release.set(21)
    dependsOn(tasks.clean)
}
