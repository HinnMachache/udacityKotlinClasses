package classes

fun main() {
    //buildAquarium()
    //simpleSpice()
    readBook()
    BMW()
    fly540()
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

fun readBook() {
    val bookRead = Book("Rich Dad, Poor Dad", "Robert Kiyosaki")
    bookRead.readPage()

    val bookRead2 = eBook("Both Dads", "Kiyosaki")
    bookRead2.readPage()
}

fun BMW() {
    val bmw = Car("BMW", "Black", "ES6", 4)
    bmw.move()
    bmw.stop()
}

fun fly540() {
    val fly540 = Plane("Fly540", "White", "SE6", 2)
    fly540.move()
    fly540.stop()
}