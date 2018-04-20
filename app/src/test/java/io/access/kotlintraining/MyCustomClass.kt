package io.access.kotlintraining

class MyCustomClass {
    var counter: Int = 0

    var propertyWithCounter: Int = 0
        set(value){
            this.counter++
        }

}

