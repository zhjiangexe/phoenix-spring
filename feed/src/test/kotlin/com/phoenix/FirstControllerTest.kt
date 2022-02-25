package com.phoenix

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FirstControllerTest {

    @Test
    fun go() {
        val firstController = FeedController()
        val go = firstController.mega("zero")
        assertEquals(go.name, "zero")
    }
}