package l3Classes

fun main ( args : Array<String>){
    buildAquarium()
    makeFish()
}

private fun buildAquarium() {
    val aquarium = Aquarium()
    printProperties(aquarium, "Big Aquarium")
    aquarium.height = 90
    println("New Height = ${aquarium.height}cm")


    val smallAquarium = Aquarium(length = 20,width = 10,height = 10)
    printProperties(smallAquarium, "Small Aquarium")

    val aquarium2 = Aquarium(9)
    printProperties(aquarium2, "Constructor Aquarium")

}

private fun printProperties(aquarium: Aquarium, name: String) {
    println(
        "The $name dimensions are: " +
                "Length = ${aquarium.length}cm " +
                "Width = ${aquarium.width}cm " +
                "Height = ${aquarium.height}cm  " +
                "and The Volume is ${aquarium.volume}litres"
    )
}

fun makeFish(){
    val shark = Shark()
    val pleco  =  Plecostomus()

    println("Shark is ${shark.color}, Plecostomus is ${pleco.color}")

    shark.eat()
    pleco.eat()
}
