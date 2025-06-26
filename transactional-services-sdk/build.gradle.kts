plugins {
    id("java")
}

group = "shop.teener.transaction"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")c
    // https://mvnrepository.com/artifact/org.projectlombok/lombok -- lombok annotation
    compileOnly("org.projectlombok:lombok:1.18.38")
    annotationProcessor("org.projectlombok:lombok:1.18.38")
    // https://mvnrepository.com/artifact/org.bouncycastle/bcprov-jdk18on -- bouncy castle for crypto operations.
    implementation("org.bouncycastle:bcprov-jdk18on:1.81")
}

tasks.test {
    useJUnitPlatform()
}