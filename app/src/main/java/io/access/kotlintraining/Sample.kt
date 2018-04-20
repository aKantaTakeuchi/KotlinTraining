package io.access.kotlintraining

fun welcome() {
    println("welcome to ACCESS!")
}

fun hello() {
    println("Hello World")
}

fun fizzBuzz() {
    for (n in 1..100) {
        if (n % 15 == 0) {
            println("fizzbuzz")
        } else if (n % 3 == 0) {
            println("fizz")
        } else if (n % 5 == 0) {
            println("buzz")
        } else {
            println(n)
        }
    }
}

fun fizzBuzzTest(n: Int) : String{
    when {
        n % 15 == 0 -> return "fizzbuzz"
        n % 3 == 0 -> return "fizz"
        n % 5 == 0 -> return "buzz"
        else -> return "$n"
    }
}


fun leapYear(y: Int): Boolean {
    when {
        y % 100 == 0 && y % 400 != 0 -> return false
        else -> return y % 4 == 0
    }
}

fun power(a: Int, n: Int): Long {
    if (a < 0 || n < 0) {
        println("inputs must be positive. return 0")
        return 0
    }
    if (n == 0) {
        return 1
    }
    var x = 1L
    for (i in 1..n) {
        x *= a
    }
    return x
}

fun Int.isOdd() = (this + 1) % 2 == 0
fun Int.isEven() = this % 2 == 0

