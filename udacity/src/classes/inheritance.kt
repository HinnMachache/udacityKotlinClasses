package classes

open class Vehicle(val name: String, val color: String) {
    open fun move() {
        println("$name is moving")
    }

    open fun stop() {
        println("$name is stopping")
    }
}

class Auto(name: String, color: String, val engine: String, val door: Int): Vehicle(name, color) {
    override fun move() {
        speed()
        super.move()
    }

    private fun speed() {
        println("Car is Speed")
    }

}

class Plane(name: String, color: String, val engine: String, val door: Int): Vehicle(name, color) {
    override fun move() {
        flying()
        super.move()
    }

    private fun flying() {
        println("The Plane is Moving")
    }

}

open class View() {
    open fun draw() {
        println("Drawing a view")
    }
}

open class Button(val text: String, val orientation: String): View() {
    override fun draw() {
        println("Drawing a button")
        super.draw()
    }
}

class RoundButton(text: String, orientation: String, val corner: Int): Button(text, orientation) {
    override fun draw() {
        println("Drawing a round button")
        super.draw()
    }
}