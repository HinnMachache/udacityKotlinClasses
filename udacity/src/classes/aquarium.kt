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

class SpiceIce (var name: String, var spiciness: String = "mild") {
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

class BaseGeometry() {
    fun area(): Unit = throw error("Area() is not implemented")
}

// Create a new class, Spice.
//Pass in a mandatory String argument for the name, and a String argument for the level of spiciness where the default value is mild for not spicy.
//Add a variable, heat, to your class, with a getter that returns a numeric value for each type of spiciness.
//Instead of the list of spices as Strings you used earlier, create a list of Spice objects and give each object a name and a spiciness level.
//Add an init block that prints out the values for the object after it has been created. Create a spice.
//Create a list of spices that are spicy or less than spicy. Hint: Use a filter and the heat property.
//Because salt is a very common spice, create a helper function called makeSalt().

class Spice(var name: String, var spiciness: String = "mild") {
    val heat: Int
    get() =
        when (spiciness){
            "mild" -> 1
            "medium" -> 3
            "hot" -> 5
            "extremely hot" -> 7
            else -> 0
        }

    init {
        println("$name with a level of $spiciness has a value of $heat.")
    }


}