import kotlin.math.*
import function.Calculator
import sorting.CountingSort

fun main(args: Array<String>){
    /*
    val calc = Calculator()

    println(calc.secant(0.05))
    println(1/cos(0.05))
    */

    val sorter = CountingSort()
    val array: Array<Long> = arrayOf(1, 0, 10, 7, 3, 7, 2, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0)
    val sortedArray: Array<Long> = sorter.sort(array)

    for(elem in array)
        print("$elem ")
    println()

    for(elem in sortedArray)
        print("$elem ")

}