package com.phoenix.feed

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FeedApp

fun main(args: Array<String>) {
    runApplication<FeedApp>(*args)
}
