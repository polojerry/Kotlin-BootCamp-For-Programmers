package l2

import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello ${args[0]}")
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println("Today is ${day}, the fish eats $food")
}

fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random.nextInt(7)]

}

fun fishFood(day: String): String {
    return when (day) {
        "Sunday" -> "plankton"
        "Monday" ->"flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "red worms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuces"
        else -> "fasting"


    }
}
