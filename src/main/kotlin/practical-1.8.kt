<<<<<<< HEAD

fun main() {    /*
=======
import com.sun.glass.ui.Size
import java.util.*

fun main()
{    /*
>>>>>>> origin/master
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
<<<<<<< HEAD
    /*
    println("5.creating array by using intarrayof()")
    var arr5 = intArrayOf(5)
    */
    /*
    println("6.Array created by using arrayof() and intArrayOf()")
    var arr6 = arrayOf(intArrayOf(21, 23), intArrayOf(24, 11), intArrayOf(39, 12))
    println(arr6.contentDeepToString())
     */
    /*
    println("6.user input in array")
    print("Enter number of Elements : ")
    val size : Int = readLine()!!.toInt()
    val arr7 = IntArray(size) {0}


    for(i in 0 until size)
    {
        print("a[$i]:")
        arr7[i] = readLine()!!.toInt()
    }
    print("Entered Array = ")
    println(arr7.contentToString())
    */
    /*
    println("7.sorting of array with builtin function")
    print("Enter number of Elements : ")
    val size : Int = readLine()!!.toInt()
    val arr = IntArray(size) {0}


    for(i in 0 until size)
    {
        print("a[$i]:")
        arr[i] = readLine()!!.toInt()
    }
    print("Entered Array = ")
    println(arr.contentToString())
    arr.sort()
    println("Sorted array: ${arr.joinToString(" ")}")
     */
    println("sorting of array without builtin function")
    fun bubbleSort(arr: IntArray) {
        val n = arr.size
        var temp: Int
        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
    }
    println("Enter the numbers of elements:")
        val input = readLine()
        val inputArray = input?.split(" ")?.map { it.toInt() }?.toIntArray()
        if (inputArray == null) {
            println("Invalid input. Please enter numeric elements separated by spaces.")
            return
        }
        bubbleSort(inputArray)
        println("Sorted array: ${inputArray.joinToString(" ")}")
    }




=======
    println("5.creating array by using intarrayof()")
    var arr5 = intArrayOf(5)
}
>>>>>>> origin/master
