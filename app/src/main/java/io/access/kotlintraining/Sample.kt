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

fun leapYear(y: Int): Boolean {
    when (y) {
        1700 -> return false
        1800 -> return false
        1900 -> return false
        2100 -> return false
        2200 -> return false
        2300 -> return false
        2500 -> return false
        2600 -> return false
        1600 -> return true
        2000 -> return true
        2400 -> return true
    }
    if (y % 4 == 0 && y % 100 != 0 && y % 400 == 0) {
        return true
    } else {
        return false
    }
}

fun power(a: Int, n: Int): Long {
    if (a < 0 || n < 0) {
        println("inputs must be positive. return 0")
        return 0
    }
    if(n == 0){
        return 1
    }
    var x = 1L
    for (i in 1..n){
        x *= a
    }
    return x
}
