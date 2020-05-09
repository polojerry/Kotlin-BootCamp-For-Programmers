package l3Classes

class Fish(val friendly: Boolean, volumeNeeded : Int) {

    var size: Int

    init {
        size = if(friendly){
            volumeNeeded
        }else{
            volumeNeeded * 2
        }
    }
}

fun fishExample(){
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}: Side = ${fish.size}")
}