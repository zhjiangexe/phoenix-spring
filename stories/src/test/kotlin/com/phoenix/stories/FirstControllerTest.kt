package com.phoenix.stories

import com.phoenix.FirstController
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class FirstControllerTest {

    @Test
    fun go() {
        val firstController = FirstController()
        val go = firstController.go("zero")
        Assertions.assertEquals(go.name, "zero")
    }
}