package functions

fun main() {
    sayHello("Machache", 21)
    val max = getMax(54, 45, 80)
    val max2 = getMax(5.4, 4.5)
    println(max)
    println(max2)
}

fun sayHello(name: String, age: Int) {
    println("Hello ${name}. Your age is: ${age}.")
}

fun getMax(firstAge: Int, secondAge: Int): Int {
    val max = if (firstAge > secondAge) firstAge else secondAge
    return max
}

fun getMax(firstAge: Int, secondAge: Int, thirdAge: Int): Int {
    return if (firstAge > secondAge && firstAge > thirdAge)
        firstAge
    else if (secondAge > firstAge && secondAge > thirdAge)
        secondAge
    else
        thirdAge
}

fun getMax(firstAge: Double, secondAge: Double): Double {
    val max = if (firstAge > secondAge) firstAge else secondAge
    return max
}

fun getMax2(firstAge: Int, secondAge: Int) = if (firstAge > secondAge) firstAge else secondAge