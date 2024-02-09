fun main()
{
    try {
        println("введите четырёхзначное число")
        var b= readLine()!!.toInt()
        when(b/1000>0)
        {
            true-> {
                var n1 = b % 10
                var n2 = (b / 10) % 10
                var n3 = (b / 100) % 10
                var n4 = (b / 1000) % 10
                println("Сумма цифр равна ${n1 + n2 + n3 + n4}")
            }
            false->println("число не четырёхзначное")
        }

    } catch (e:Exception){println("некорректно введены значения")}
}