import function.Calculator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

import kotlin.math.*

class FunctionTest {
    private val testCalc: Calculator = Calculator()

        //TODO("параметризовать тесты при джюнит5")

    @Test
    @DisplayName("test in zero point")
    fun testSecantAtZero(){
        val correctAnswer = 1/cos(0.0)
        val testedAnswer = testCalc.secant(0.0)
        assertThat(testedAnswer).isEqualTo(correctAnswer)
    }

    @Test
    @DisplayName("test near zero positive")
    fun testSecantNearZeroPositive(){
        val correctAnswer = 1/cos(0.00008)
        val testedAnswer = testCalc.secant(0.00008)
        assertThat(testedAnswer).isEqualTo(correctAnswer)
    }

    @Test
    @DisplayName("test near zero negative")
    fun testSecantNearZeroNegative(){
        val correctAnswer = 1/cos(-0.00008)
        val testedAnswer = testCalc.secant(-0.00008)
        assertThat(testedAnswer).isEqualTo(correctAnswer)
    }

    @Test
    @DisplayName("test near values positive")
    fun testNearValuesPositive(){
        val correctAnswer = 1/cos(0.05)
        val testedAnswer = testCalc.secant(0.05)
        assertThat(testedAnswer).isCloseTo(correctAnswer, offset(0.001))
        //assertEquals(testedAnswer, correctAnswer, 0.001)
    }

    @Test
    @DisplayName("test near values negative")
    fun testNearValuesNegative(){
        val correctAnswer = 1/cos(-0.05)
        val testedAnswer = testCalc.secant(-0.05)
        assertThat(testedAnswer).isCloseTo(correctAnswer, offset(0.001))
    }

    @Test
    @DisplayName("test that absolute amount is big")
    fun testSecantFail(){
        assertThrows(IllegalArgumentException::class.java){
            testCalc.secant(-0.2)
        }
    }
}