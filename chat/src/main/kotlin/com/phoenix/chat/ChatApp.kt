package com.phoenix.chat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChatApp

fun main(args: Array<String>) {
    runApplication<ChatApp>(*args)
}
