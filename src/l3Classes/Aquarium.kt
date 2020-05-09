package l3Classes

class Aquarium {
    var width = 10
    var length = 100
    var height = 50

    var volume: Int
        get() = (width * height * length) / 1000
        set(value) {
            height = (value*1000) / (width * length)
        }

}
