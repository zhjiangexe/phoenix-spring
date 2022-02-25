package com.phoenix.stories

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StoriesApp

fun main(args: Array<String>) {
    runApplication<StoriesApp>(*args)
}
