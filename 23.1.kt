fun main()
{
    try {
        println("введите r окружности")
        var r= readLine()!!.toDouble()
        var l:Double
        var p:Double
       if (r>0){
           l=2*3.14*r
           p=(2*r)*4
           println("l=${String.format("%.2f",l) }  , p=${String.format ("%.2f",p )}")
       }
        else
       {
           println("r должен быть больше нуля, введите корректное значение")
       }


    }
    catch (e:Exception){println("некорректно введены значения")}

}