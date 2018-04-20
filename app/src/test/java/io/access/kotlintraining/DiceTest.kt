package io.access.kotlintraining

import org.junit.Test

class DiceTest {
    @Test
    fun testDice() {
        println("---------testDice---------")
        val d = Dice(10)

        for (i in 1..100) {
            println(d.roll()) // 1〜16 までの数字
        }
        println(d.roll()) // Exception

    }
}