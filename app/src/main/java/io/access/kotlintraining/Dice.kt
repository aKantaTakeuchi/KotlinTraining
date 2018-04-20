package io.access.kotlintraining

import java.util.Random

class Dice(val n: Int) {

    var count = 1
    fun roll(): Int {
        try {
            if (count > 100) {
                throw Exception("I was broken")
            } else {
                count++
                val random = Random()
                return random.nextInt(n)
            }
        } catch (e: Exception) {
            println("I was broken")
            return 0
        }
    }
}