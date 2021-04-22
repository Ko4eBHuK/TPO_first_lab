import kotlin.math.*
import function.Calculator
import models.Captives
import models.Vogon
import sorting.CountingSort

fun main(args: Array<String>){
    /*Проверка работы степенного ряда функции*/
    val calc = Calculator()
    println("~~~~FUNCTION~~~~")
    println("Mine secant result of 0.05: ${calc.secant(0.05)}")
    println("Comp secant result of 0.05: ${1/cos(0.05)}")
    println()

    /*Проверка работы метода сортировки*/
    val sorter = CountingSort()
    val array: Array<Long> = arrayOf(13, 15, 18, 28, 12, 14, 11, 25, 11, 27, 24, 9, 15, 1, 15, 24, 6, 21, 0, 8, 24, 13, 15, 19, 13, 1, 13, 15, 17, 21)
    val sortedArray: Array<Long> = sorter.sort(array)

    println("~~~~SORTING~~~~")
    print("Origin array: ")
    for(elem in array)
        print("$elem ")
    println()

    print("Sorted array: ")
    for(elem in sortedArray)
        print("$elem ")
    println()
    println()

    /*Проверка доменной модели*/
    val newVogon = Vogon("Djeltz", "Prostetnic")
    val newCaptives = Captives(true)

    println("~~~~~~DOM~~~~~~")
    newVogon.pamperVogonHimself(newCaptives)
    newVogon.smile()
    newVogon.checkVogonsCondition()

}