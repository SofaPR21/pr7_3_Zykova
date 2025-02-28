fun main() {
    var x:Double = readln().toDouble()
    var y:Double = 0.0

    //a
    when {
        x <= 0 -> {
            y = x+1
        }
        x <= 3 -> {
            y = 1.0
        }
        x <= 4 -> {
            y = 4-x
        }
    }
    println(y)

    //б
    when {
        x <= 1 -> {
            y = (Math.PI/2) * (x+1)
        }
        x > 1 -> {
            y = x - 1
        }
    }
    println(y)

    //в
    when {
        x <= 0 -> {
            y = x+1
        }
        x <= 1 -> {
            y = 1 - x
        }
        x <= 3 -> {
            y = 1 - (x/3)
        }
        x > 3 -> {
            y = 1.0
        }
    }
    println(y)

    //г
    when {
        x <= 0 -> {
            y = (Math.PI/2) * (x+1)
        }
        x <= 2 -> {
            y = 1.0
        }
        x > 2 -> {
            y = x+1
        }
    }
    println(y)
}