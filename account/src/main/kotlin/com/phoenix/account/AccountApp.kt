package com.phoenix.account

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AccountApp

fun main(args: Array<String>) {
    runApplication<AccountApp>(*args)
}
