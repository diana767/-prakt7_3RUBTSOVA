import kotlin.math.sqrt
import kotlin.math.pow

fun main() = try {
    println("a ")
    var a= readLine()!!.toDouble()
    println("b ")
    var b= readLine()!!.toDouble()
    println("c ")
    var c= readLine()!!.toDouble()
   var d= b.pow(2)-4*a*c
    var t1:Double
    var t2:Double
    var x1:Double
    var x2:Double
    var x3:Double
    var x4:Double

    if (d<0)
    {
        println("уравнение не имеет действительных корней")
    }
    else {
        t1 = (-b + sqrt(d)) / (2 * a)
        t2 = (-b - sqrt(d)) / (2 * a)
        if (t1 > 0) println("x1 = ${sqrt(t1)}и х2=${sqrt(t2)}")
        if (t1 < 0) println("x1 и х2 не действительные корни")
        else {
            if (t2 < 0) println("x2 и х4 не действительные корни")
        }

        if (t1 < 0) {
            x1 = sqrt(t1)
            x2 = -x1
            println(
                "x1=${x1} " +
                        "x2=${x2}"
            )
            /* } else { if (t2 > 0)

            x3 = sqrt(t2)
            println(message = "x1=${x3} ,x2=-${x3}")



        }*/


        } else {

        }
    }
}
catch (e:Exception){println("неккоректно введены значения")}
