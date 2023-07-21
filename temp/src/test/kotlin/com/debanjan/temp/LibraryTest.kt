package com.debanjan.temp

import kotlin.test.Test
import kotlin.test.assertTrue

class LibraryTest {
    @Test
    fun someLibraryMethodReturnsTrue() {
        val classUnderTest = Library()
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'")
    }

    @Test
    fun assertFalse() {
        assert(false)
    }
}
