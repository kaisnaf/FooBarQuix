package com.kata.foobarquix.services

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FooBarQuixServiceTest{

    val fooBarQuixService = FooBarQuixService();

    @Test
    fun test_FooBarQuix_Should_Return_1() {
        assertEquals("1",fooBarQuixService.convertNumber(1))
    }
    @Test
    fun test_FooBarQuix_Should_Return_FooFoo() {
        assertEquals("FooFoo",fooBarQuixService.convertNumber(3))
    }
    @Test
    fun test_FooBarQuix_Should_Return_BarBar() {
        assertEquals("BarBar",fooBarQuixService.convertNumber(5))
    }
    @Test
    fun test_FooBarQuix_ShouldReturn_Quix() {
        assertEquals("Quix",fooBarQuixService.convertNumber(7))
    }
    @Test
    fun test_FooBarQuixShould_Return_Foo() {
        assertEquals("Foo",fooBarQuixService.convertNumber(9))
    }
    @Test
    fun test_FooBarQuix_Should_Return_FooBar() {
        assertEquals("FooBar",fooBarQuixService.convertNumber(51))
    }
    @Test
    fun test_FooBarQuix_Should_Return_BarFoo() {
        assertEquals("BarFoo",fooBarQuixService.convertNumber(53))
    }
    @Test
    fun test_FooBarQuix_Should_Return_FooFooFoo() {
        assertEquals("FooFooFoo",fooBarQuixService.convertNumber(33))
    }
    @Test
    fun test_FooBarQuix_Should_Return_FooQuix() {
        assertEquals("FooQuix",fooBarQuixService.convertNumber(27))
    }
    @Test
    fun test_FooBarQuix_Should_Return_FooBarBar() {
        assertEquals("FooBarBar",fooBarQuixService.convertNumber(15))
    }
    @Test
    fun test_FooBarQuix_Should_Return_InputNumber() {
        assertEquals("11111111",fooBarQuixService.convertNumber(11111111))
    }
}