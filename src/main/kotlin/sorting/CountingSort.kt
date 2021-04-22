package sorting

class CountingSort {
    fun sort(arr: Array<Long>): Array<Long>{
        val arrayOfCounts = Array<Long>((arr.maxOrNull() ?: 0).toInt() + 1, { i -> 0})
        //подсчёт количества каждого элемента входящего массива
        for(element in arr)
            arrayOfCounts[element.toInt()]++
        //определение количества чисел меньших чем текущее
        for(i in 1 until arrayOfCounts.size)
            arrayOfCounts[i] += arrayOfCounts[i-1]

        val resultArray = Array<Long>(arr.size, { i -> 0})
        var k = arr.size - 1
        while(k >= 0){
            val countsArrayIndex = arr[k].toInt()
            resultArray[arrayOfCounts[countsArrayIndex].toInt() - 1] = arr[k]
            arrayOfCounts[countsArrayIndex]--
            k--
        }

        return resultArray
    }
}