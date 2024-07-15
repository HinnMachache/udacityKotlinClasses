package classes

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