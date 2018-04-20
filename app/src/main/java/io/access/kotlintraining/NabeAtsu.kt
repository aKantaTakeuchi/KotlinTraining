package io.access.kotlintraining

class NabeAtsu {
    // TODO: 実装する

    var counter = 0

    fun next(): String {
        counter++
        var str = "$counter"
        when {
            str.contains("3") -> return "Aho"
            counter % 3 == 0 -> return "Aho"
            else -> return str
        }

    }
}
