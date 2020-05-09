package l3Classes

abstract class AquariumFish {
    abstract val color: String
}

interface FishAction {

    fun eat(){
    }
}

class Shark() : AquariumFish(), FishAction {
    override val color: String
        get() = "Grey"

    override fun eat() {
        println("Hunt and Eat Fish")
    }
}

class Plecostomus() : AquariumFish(), FishAction {
    override val color: String = "Gold"
    override fun eat() {
        println("Munch on Algae")
    }
}

