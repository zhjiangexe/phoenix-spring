package com.phoenix

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FirstControllerTest {

    @Test
    fun go() {
        val firstController = FirstController()
        val go = firstController.go("zero")
        assertEquals(go.name, "zero")
    }
}