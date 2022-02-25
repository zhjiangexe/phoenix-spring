plugins {
    id("org.springframework.boot") version "2.6.4"
    kotlin("plugin.spring") version "1.6.10"
    kotlin("plugin.jpa") version "1.6.10"
//    kotlin("jvm") version "1.6.10"
//    id("io.spring.dependency-management") version "1.0.11.RELEASE"
//    kotlin-spring plugin (Spring 版本的 All-open compiler plugin 包裝) 會自動幫我們把 class 和方法都預設打開成 open，因為在 Kotlin 中 class 和方法預設都是 final，而 Spring AOP 都是透過 AOP 自動代理 (CGLIB 或是 JDK 動態代理)達成的，使用 Spring AOP 的 class 或方法必須是 open 的才能作用。
//    標註 @Component、 @Async、 @Transactional、 @Cacheable、 @SpringBootTest 、 @Configuration、 @Controller、 @RestController、 @Service 或者 @Repository 的這些類別會自動變成 open。
//    Kotlin JPA plugin (Spring 版本的 No-arg compiler plugin 包裝)，因為 JPA 再從資料庫撈取資料時，在初始化物件的時候都需要有一個 無參數的 constructor (No-arg constructor) ，所以為了方便這個 plugin 會再有標註 @Entity、 @Embeddable 或 @MappedSuperclass 的 class 中產生一個無參數的 constructor。

}

dependencies {
    implementation(project(":core"))
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//    implementation("org.springframework.boot:spring-boot-starter-amqp")
//    implementation("org.springframework.boot:spring-boot-starter-cache")
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    implementation("org.springframework.boot:spring-boot-starter-data-redis")
//    implementation("org.springframework.boot:spring-boot-starter-jdbc")
//    implementation("org.springframework.boot:spring-boot-starter-security")
//    implementation("org.springframework.boot:spring-boot-starter-websocket")

    developmentOnly("org.springframework.boot:spring-boot-devtools")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
//    runtimeOnly("com.h2database:h2")
//    runtimeOnly("org.postgresql:postgresql")
//    testImplementation("org.springframework.amqp:spring-rabbit-test")
//    testImplementation("org.springframework.security:spring-security-test")
}