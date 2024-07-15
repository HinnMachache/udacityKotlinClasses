package classes

import java.awt.Color

class Aquarium (var height: Int = 20, var length: Int = 100, var width: Int = 20){
//    var width = 0
//        set(value) {
//            if (value >= 0) {
//                field = value
//            }
//        }
    fun volume() = width * height * length / 1000

    constructor(numberOfFish: Int): this() {
        println("Number of fish = $numberOfFish")
    }

}

class SimpleSpice(var name: String, var spiciness: String, var price: Int, var isBought: Boolean = false) {
    val heat: Int
        get() {
            return 5
        }
    var customerKey = name.lowercase().also(::println)
    //constructor(typeofSpice: String): this() {}
}

class Spice (var name: String, var spiciness: String = "mild") {
    val heat: Int
        get() = when (spiciness){
            "mild" -> 1
            "medium" -> 3
            "hot" -> 5
            "extremely hot" -> 10
            else -> 0
        }

    init {
        println("$name with a level of $spiciness has a value of $heat.")
    }
}

open class Book(val name: String, val author: String) {
    private var currentPage = 0;
    open fun readPage() {
        currentPage += 1;
        println("You have read $currentPage pages of $name")
    }
}

class eBook(name: String = "text", author: String = "text"): Book(name, author) {
    private var wordCount = 0;
    override fun readPage() {
        super.readPage()
        wordCount += 250;
        println("You have read $wordCount words of $name")
    }
}

open class Vehicle(val name: String, val color: String) {
    fun move() {
        println("$name is moving")
    }

    fun stop() {
        println("$name has stopped")
    }
}

class Car(name: String, color: String, val engine: String, val doors: Int) : Vehicle(name, color) {
}

class Plane(name: String, color: String, val engine: String, val doors: Int) : Vehicle(name, color) {

}