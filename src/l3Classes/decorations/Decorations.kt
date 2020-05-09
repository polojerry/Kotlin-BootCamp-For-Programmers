package l3Classes.decorations

fun main(args: Array<String>) {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("Granite")
    println(d1)

    val d2 = Decorations("Slate")
    println(d1)

    val d3 = Decorations("Slate")
    println(d1)

    println(d1 == d2)
    println(d2 == d3)

    val d4 = d3.copy()
    println(d4)

    val d5 = Decorations1("crystals", "wood", "diver")
    val (rock, wood, crystal) = d5

    println(d5)
    println(rock)
    println(wood)
    println(crystal)

}

data class Decorations(val rocks: String)

data class Decorations1(val rocks: String,val wood: String,val diver: String)