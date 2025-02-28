import kotlin.math.sqrt

fun main()
{
    try{

        println("введите координаты первой вершины треугольника: ")
        print("x1 = ")
        var x1 = readln()!!.toDouble()
        print("y1 = ")
        var y1 = readln()!!.toDouble()

        println("введите координаты второй вершины треугольника: ")
        print("x2 = ")
        var x2 = readln()!!.toDouble()
        print("y2 = ")
        var y2 = readln()!!.toDouble()

        println("введите координаты третьей вершины треугольника: ")
        print("x3 = ")
        var x3 = readln()!!.toDouble()
        print("y3 = ")
        var y3 = readln()!!.toDouble()

        val ab = Math.sqrt(Math.pow((x2 - x1), (2.0)) + Math.pow((y2 - y1), (2.0)))
        val bc = Math.sqrt(Math.pow((x3 - x2), (2.0)) + Math.pow((y3 - y2), (2.0)))
        val ca = Math.sqrt(Math.pow((x1 - x3), (2.0)) + Math.pow((y1 - y3), (2.0)))

        var P = ab + bc + ca

        var S = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))

        println("периметр треугольника = $P")
        println("площадь треугольника = $S")
    }

    catch (e: Exception){
        println("неверный формат данных")
    }
}