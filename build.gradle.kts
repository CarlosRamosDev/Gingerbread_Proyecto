plugins {
    id("java")
    id("application")
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("com.gingerbread.Main")
}

tasks.compileJava {
    options.encoding = "UTF-8"
}

tasks.jar {
    manifest.attributes["Main-Class"] = "com.gingerbread.Main"
}