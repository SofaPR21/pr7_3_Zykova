fun main(){
    try{

        print("x = ")
        var x = readLine()!!.toDouble()
        print("y = ")
        var y = readLine()!!.toDouble()
        print("z = ")
        var z = readLine()!!.toDouble()

        var U: Double = 0.0
        when{
            x < z ->  U = Math.max(x,y)
            x >= z -> U = Math.min(x,y)
            else -> {
                println("не верный ввод")
            }
        }
        println(U)
    }
    catch (e: Exception){
        println("неверный формат данных")
    }
}