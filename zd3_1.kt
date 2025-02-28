fun main()
{
    try{
        println("введите длину окружности: ")
        var C = readLine()!!.toDouble()

        while(C <= 0) {
            println("длина окружности не может быть меньше или равно нулю, введите еще раз")
            C = readLine()!!.toDouble()
        }

        println("площадь круга = ")
        var S_krug = (C * C)/(4 * Math.PI)
        print(S_krug)
    }
    catch (e: Exception){
        println("неверный формат данных")
    }
}