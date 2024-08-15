package classes

fun main() {
    //car_obj()
    playHat()
}

fun car_obj() {
    val car1 = Car("Tesla", "Cybertruck", "Gray", 4)

    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")
    car1.move()
    car1.stop()
    println()

    val car2 = Car("Ford", "Mustang", "Red", 2)

    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Color = ${car2.color}")
    println("Doors = ${car2.doors}")
    car2.move()
    car2.stop()
    println()
}

fun playHat() {

    val client01 = User("Ann", "Marrie", 17)
    println()
    val client02 = User("Jim")
    println()
    val client03 = User("Makkonen", "Drew")

}