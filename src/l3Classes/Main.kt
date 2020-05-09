package l3Classes

fun main ( args : Array<String>){
    buildAquarium()
}

private fun buildAquarium() {
    val aquarium = Aquarium()
    println(
        "The Aquariums dimensions are: " +
                "Length = ${aquarium.length}cm " +
                "Width = ${aquarium.width}cm " +
                "Height = ${aquarium.height}cm  " +
                "and The Volume is ${aquarium.volume}cm3"
    )

    aquarium.height = 90
    println("New Height = ${aquarium.height}cm")
    
}