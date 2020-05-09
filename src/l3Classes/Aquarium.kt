package l3Classes

import kotlin.math.PI
open class Aquarium(var length :Int = 100, var width: Int = 10, var height: Int = 50) {

    open var volume: Int
        get() = (width * height * length) / 1000
        set(value) {
            height = (value*1000) / (width * length)
        }

    open var water = volume * 0.9
    constructor(numberOfFish : Int): this(){
        val water = numberOfFish* 1000 //cm3
        val tank  = water + water *0.1
        height = (tank / (length*width)).toInt()
    }
}

class TowerTank()  : Aquarium(){

    override var water = volume * 0.8
    override var volume: Int
        get() = ((width * height * length) / 100* PI).toInt()
        set(value) {
            height = (value*1000) / (width* height)
        }
}

