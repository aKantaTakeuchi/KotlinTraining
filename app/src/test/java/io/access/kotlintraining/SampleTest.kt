package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class SampleTest {
    @Test
    fun testWelcome() {
        println("---------testWelcom---------")
        welcome()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testHello() {
        println("---------testHello---------")
        hello()
        // TODO: implement to call hello function
    }

    @Test
    fun testFizzBuzz() {
        println("---------testFizzbuzz---------")
        fizzBuzz()
    }

    @Test
    fun testFizzBuzz2() {
        println("---------testFizzbuzz2---------")
        println(fizzBuzzTest(30))
    }


    @Test
    fun testLeapYear() {
        println("---------testLeapyear---------")
        if (leapYear(1600)) {
            println(true)
        } else {
            println(false)
        }

    }

    @Test
    fun testPower() {
        println("---------testPower---------")
        println(power(2, 10))
    }

    @Test
    fun testOddEvenInt() {
        println("---------testOddEvenInt---------")
        val a = 5
        println(a.isOdd())
        println(a.isEven())
    }

    @Test
    fun testNabe(){
        println("----------NabeAtsuTest---------")
        val n = NabeAtsu()
        for (i in 1..100) {
            println(n.next())
        }
    }

    @Test
    fun testCounter(){
        println("---------testCounter---------")
        val p = MyCustomClass()
        p.propertyWithCounter = 123
        p.propertyWithCounter = 456
        p.propertyWithCounter = 789
        println(p.counter) // 3
    }




}

