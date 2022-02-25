package com.phoenix.chat.web.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class FirstController {
    @GetMapping("/mega/{try}")
    fun go(@PathVariable("try") name: String): Person {
        return Person(name, 18)
    }
}

