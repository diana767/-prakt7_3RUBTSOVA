import kotlin.math.sqrt

fun main()
{
    try {
        println("введите сторону a треугольника")
        var a= readLine()!!.toDouble()
        println("введите сторону b треугольника")
        var b= readLine()!!.toDouble()
        println("введите сторону c треугольника")
        var c= readLine()!!.toDouble()
        when((b+c)>a&&(a+c)>b&&(a+b)>c)
        {
            true->
            {
                var p = (a + b + c) / 2
                var s = sqrt(p * (p - a) * (p - b) * (p - c))
                var h =String.format ("%.2f",((2 * s) / a))
                println("высота, опущенная к стороне а равна  ${h}")
            }
            false->  println("треугольник не может существовать с такими значениями")
        }


    } catch (e:Exception){println("некорзектно введены значения")}
}