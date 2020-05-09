package l2Functions

fun main(args : Array<String>) {
    //variable from main and string template ${}
    println("Hello ${args[0]}")

    val isUnit = println("Is Unit")
    println(isUnit)

    val fishTemp = 10

    //using value of expression
    val isHot = if(fishTemp>50) true else false
    println(isHot)

    //using value of expression and string template ${}
    val message = "You are a ${if(fishTemp>10) "Safe" else "fried" }fish"
    println(message)
}