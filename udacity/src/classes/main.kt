package classes

fun main() {
    //buildAquarium()
    //simpleSpice()
    // simpleGeom()
    grocerySpices()
}

fun buildAquarium(): Aquarium {
    val fishAquarium = Aquarium(length = 30, height = 40)
    var volume = fishAquarium.volume()
    println("Length = ${fishAquarium.length} " +
            "Width = ${fishAquarium.width} " +
            "Height = ${fishAquarium.height} " +
            "Volume = $volume")

    fishAquarium.width = 40
    volume = fishAquarium.volume()
    println("Length = ${fishAquarium.length} " +
            "Width = ${fishAquarium.width} " +
            "Height = ${fishAquarium.height} " +
            "Volume = $volume")

    val fishAquarium2 = Aquarium(numberOfFish = 29)
    fishAquarium2
    return fishAquarium
}

fun simpleSpice() {
    val spice = SimpleSpice("onion", "mild", 5)
    println("Name = ${spice.name}\n" +
            "Heat = ${spice.heat}\n" +
            "Price = ${spice.price}\n" +
            "Bought = ${spice.isBought}")
    spice.customerKey
    //val spice2 = SimpleSpice("homeBased")
}

fun simpleGeom() {
    val areaGeometery = BaseGeometry()
    areaGeometery.area()
}

fun makeSalt() = Spice("Salt", "mild")

fun grocerySpices() {
    //Instead of the list of spices as Strings you used earlier, create a list of Spice objects and give each object a name and a spiciness level.
//Add an init block that prints out the values for the object after it has been created. Create a spice.
//Create a list of spices that are spicy or less than spicy. Hint: Use a filter and the heat property.
//Because salt is a very common spice, create a helper function called makeSalt().
    val spices = listOf(
        Spice("Tomatoes", "mild"),
        Spice("Onions", "mild"),
        Spice("Ginger", "medium"),
        Spice("Salt", "mild"),
        Spice("Chillies", "extremely hot"),
        Spice("Corriander", "mild"),
        makeSalt()
    )

    val spicySpices = spices.filter { it.heat > 3 }
    println("Less Spicy spices")
    spicySpices.forEach { (println("Spice Name: ${it.name}, Spiciness: ${it.spiciness}, Spice Level: ${it.heat}")) }
    val lessSpicySpices = spices.filter { it.heat <= 3 }
    lessSpicySpices.forEach { println("Spice Name: ${it.name}, Spiciness: ${it.spiciness}, Spice Level: ${it.heat}") }


}