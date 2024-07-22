package classes

fun main() {
    buildAquarium()
    //simpleSpice()
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