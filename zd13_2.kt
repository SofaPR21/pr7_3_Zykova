import kotlin.math.sqrt //импорт функции sqrt из стандартной библиотеки котлин
fun main(){
    try{
        print("k = ")
        var k = readLine()!!.toDouble()
        print("b = ")
        var b = readLine()!!.toDouble()
        print("a = ")
        var a = readLine()!!.toDouble()

        // Вычисление дискриминанта
        val discriminant = b * b - 4 * k * (-a)

        when {
            discriminant > 0 -> {
                // 2 точки пересечения
                val x1 = (-b + sqrt(discriminant)) / (2 * k)
                val x2 = (-b - sqrt(discriminant)) / (2 * k)
                val y1 = k * x1 + b
                val y2 = k * x2 + b

                println("Две точки пересечения:")
                println("Точка 1: ($x1, $y1)")
                println("Точка 2: ($x2, $y2)")
            }
            discriminant == 0.0 -> {
                // 1 точка пересечения
                val x = -b / (2 * k)
                val y = k * x + b

                println("Одна точка пересечения:")
                println("Точка: ($x, $y)")
            }
            else -> {
                // Нет точек пересечения
                println("Нет точек пересечения.")
            }
        }
    }
    catch (e: Exception){
        println("неверный формат данных")
    }
}