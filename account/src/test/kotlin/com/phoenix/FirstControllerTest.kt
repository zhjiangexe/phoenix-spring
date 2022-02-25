package com.phoenix

import com.phoenix.account.web.controller.FirstController
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FirstControllerTest {

    @Test
    fun go() {
        val firstController = FirstController()
        val go = firstController.go("zero")
        assertEquals(go.name, "zero")
    }
}