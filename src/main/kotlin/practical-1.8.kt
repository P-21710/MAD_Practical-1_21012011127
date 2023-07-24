
fun main() {    /*
     println("1.Create an array1 using array of method:")
    var arr1 = arrayOf(10,20,35,45,50)
    println(arr1.contentDeepToString())
    */
    /*
    println("2.create array using Array<>():")
    var arr2 = Array<Int>(5){0}
    println(arr2.contentDeepToString())
    */
    /*
    println("3.Creating an array using lambda function")
    var arr3 = Array<Int>(7){i: Int -> i }
    println(arr3.contentDeepToString())
    */
    /*
    println("4.creating array by using intarray()")
    var arr4 = IntArray(5){i: Int ->i}
    println(arr4.contentToString())
    */
    /*
    println("5.creating array by using intarrayof()")
    var arr5 = intArrayOf(5,4,3)
    println(arr5.contentToString())

     */
    /*
    println("Array created by using arrayof() and intArrayOf()")
    var a6 = arrayOf(intArrayOf(45,3), intArrayOf(4,1), intArrayOf(9,2))
    println(a6.contentDeepToString())
*/
    println("Array created by using arrayof() and intArrayOf()")
    var a6 = arrayOf(intArrayOf(45,3), intArrayOf(4,1), intArrayOf(9,2))
    println(a6.contentDeepToString())

    print("Enter number of Elements : ")
    val size : Int = readLine()!!.toInt()
    val user = IntArray(size) {0}


    for(i in 0 until size)
    {
        print("a[$i]:")
        user[i] = readLine()!!.toInt()
    }
    print("Entered Array = ")
    println(user.contentToString())

}
