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
    fun testFizzBuzz(){
        println("---------testFizzbuzz---------")
        fizzBuzz()
    }

    @Test
    fun testLeapYear(){
        println("---------testLeapyear---------")
        if(leapYear(1600)){
            println(true)
        }else{
            println(false)
        }

    }

    @Test
    fun testPower(){
        println("---------testPower---------")
        println(power(2, 10))
    }

}