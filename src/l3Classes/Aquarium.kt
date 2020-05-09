package l3Classes

import kotlin.math.tan

class Aquarium(var length :Int = 100, var width: Int = 10, var height: Int = 50) {

    var volume: Int
        get() = (width * height * length) / 1000
        set(value) {
            height = (value*1000) / (width * length)
        }

    constructor(numberOfFish : Int): this(){
        val water = numberOfFish* 1000 //cm3
        val tank  = water + water *0.1
        height = (tank / (length*width)).toInt()
    }

}
