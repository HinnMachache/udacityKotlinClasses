package collectionsOperations

fun main() {
    // Mapping
    val numbers = setOf<Int>(1, 2, 3, 4, 5)
    println(numbers.map { it * 10 })
    println(numbers.map { if (it == 3) it * 100 else it * 10})
    println(numbers.mapIndexedNotNull { index, value -> if (index == 0) null else value * 2 })
    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 4" to 4, "key 5" to 5)
    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapKeys { it.value * 10 })

    // Zipping
    val animals = listOf("fox", "wolf", "bear")
    val colors = listOf("red", "grey", "brown")
    println(animals zip colors)
    println(animals.zip(colors){ animal, color -> "The ${animal.replaceFirstChar { it.uppercase() }} is $color"})

    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs)
    println(numberPairs.unzip())

    // Association
    val zahlen = listOf("one", "two", "three", "four")
    println(zahlen.associateWith { it.length })
    println(zahlen.associateBy { it.first().uppercase() })
    println(zahlen.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))

    // Flatten
    val numberSet = listOf<Set<Int>>(setOf(1,2,3), setOf(4,5,6), setOf(7,8,9))
//    for (numbers in numberSet) {
//        for (number in numbers) {
//            println(number)
//        }
//        println()
//    }

    val flattenedNumber = numberSet.flatten()
//    for (number in flattenedNumber) {
//        println(number)
//    }
    flattenedNumber.forEach { println(it) }

}

