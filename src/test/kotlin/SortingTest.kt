import org.junit.jupiter.api.*
import sorting.CountingSort

class SortingTest {
    private lateinit var actualSortedArray: Array<Long>
    private lateinit var testingCountingArray: Array<Long>

    @BeforeEach
    fun initializeActualSortedArray(){
        val sorter = CountingSort()
        actualSortedArray = sorter.sort(originArray)
        testingCountingArray = sorter.arrayOfCountsFinal
    }

    @Test
    @DisplayName("Manual sort testing")
    fun testManual(){
        //val testedSortedArray = sorter.sort(originArray)
        Assertions.assertArrayEquals(expectedSortedArray, actualSortedArray)
    }

    @Test
    @DisplayName("Machine sort testing")
    fun testByComputer(){
        //val testedSortedArray = sorter.sort(originArray)
        val sortedByMachineArray = originArray.sortedArray()
        Assertions.assertArrayEquals(sortedByMachineArray, actualSortedArray)
    }

    @Test
    @DisplayName("intermediate point testing: ready-made counting array")
    fun testCountingArray(){
        Assertions.assertArrayEquals(expectedCountingArray, testingCountingArray)
    }

    companion object{
        private val originArray: Array<Long> = arrayOf(13, 15, 18, 28, 12, 14, 11, 25, 11, 27, 24, 9, 15, 1, 15, 24, 6, 21, 0, 8, 24, 13, 15, 19, 13, 1, 13, 15, 17, 21)
        private val expectedSortedArray: Array<Long> = arrayOf(0, 1, 1, 6, 8, 9, 11, 11, 12, 13, 13, 13, 13, 14, 15, 15, 15, 15, 15, 17, 18, 19, 21, 21, 24, 24, 24, 25, 27, 28)
        private val expectedCountingArray: Array<Long> = arrayOf(1, 3, 3, 3, 3, 3, 4, 4, 5, 6, 6, 8, 9, 13, 14, 19, 19, 20, 21, 22, 22, 24, 24, 24, 27, 28, 28, 29, 30)
    }
}