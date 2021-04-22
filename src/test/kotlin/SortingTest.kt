import sorting.CountingSort

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class SortingTest {
    private val sorter: CountingSort = CountingSort()
    private val originArray: Array<Long> = arrayOf(13, 15, 18, 28, 12, 14, 11, 25, 11, 27, 24, 9, 15, 1, 15, 24, 6, 21, 0, 8, 24, 13, 15, 19, 13, 1, 13, 15, 17, 21)
    private val expectedSortedArray: Array<Long> = arrayOf(0, 1, 1, 6, 8, 9, 11, 11, 12, 13, 13, 13, 13, 14, 15, 15, 15, 15, 15, 17, 18, 19, 21, 21, 24, 24, 24, 25, 27, 28)

    @Test
    @DisplayName("Manual sort testing")
    fun testManual(){
        val testedSortedArray = sorter.sort(originArray)
        Assertions.assertArrayEquals(expectedSortedArray, testedSortedArray)
    }

    @Test
    @DisplayName("Machine sort testing")
    fun testByComputer(){
        val testedSortedArray = sorter.sort(originArray)
        val sortedByMachineArray = originArray.sortedArray()
        Assertions.assertArrayEquals(sortedByMachineArray, testedSortedArray)
    }
}