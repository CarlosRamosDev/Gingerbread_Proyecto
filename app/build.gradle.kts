plugins {
    id("java")
    id("application")
}

application {
    mainClass.set("com.gingerbread.app.Main")
}

dependencies {
    implementation(project(":lib"))
}

tasks.jar {
    manifest.attributes["Main-Class"] = "com.gingerbread.app.Main"
    from(sourceSets.main.get().output)
    dependsOn(configurations.runtimeClasspath)
    from({
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    })
}