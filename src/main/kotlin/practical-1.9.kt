fun main()
{

    print("Enter Elements : ")
    val n:Int = readLine()!!.toInt()
    val num = ArrayList<Int>()
    var max = 0

    for (i:Int in 0 until n)
    {
        print("nums[$i] = ")
        num.add(i,readLine()!!.toInt())
        if (max<num[i])
        {
            max= num[i]
        }
    }

    println()
    println("Maximum Element from Array Without in-built Function = $max")
    println("Maximum Element from Array With in-built Function = ${num.max()}")
}