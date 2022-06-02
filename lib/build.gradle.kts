plugins {
    id("java-library")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

tasks.test {
    //useJUnitPlatform()
}

tasks.compileJava {
    options.encoding = "UTF-8"
}
