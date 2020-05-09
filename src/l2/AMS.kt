package l2

import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello ${args[0]}")
    feedTheFish()
    bubbling()
    exampleFiltering()

}

fun exampleFiltering() {
    val decorations = listOf("rock", "pagoda", "plastic plants", "alligator", "flower pots")

    //eager filtering
    val eagerFiltering = decorations.filter { it[0] == 'p' }
    println("Eager Filtered List: $eagerFiltering")

    //lazy
    val lazyFiltering = decorations.asSequence().filter { it[0] == 'p' }
    println("Lazily Filtered List: $lazyFiltering")
    println("Lazily Filtered List: ${lazyFiltering.toList()}")
}

private fun bubbling() {
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }

    //repeats (function from stdlib
    repeat(2) {
        println("Fish is Swimming")
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println("Today is ${day}, the fish eats $food")

    shouldChangeTheWater(day)
    shouldChangeTheWater(day, 20, getDirtySensorReading())
    shouldChangeTheWater(day, dirty = 50)

    if (shouldChangeTheWater(day)) {
        println("Change the water")
    }
}


fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random.nextInt(7)]

}

fun fishFood(day: String): String {
    return when (day) {
        "Sunday" -> "plankton"
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "red worms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuces"
        else -> "fasting"
    }
}

fun shouldChangeTheWater(day: String, temperature: Int = 22, dirty: Int = 10): Boolean {

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun getDirtySensorReading(): Int  = 20