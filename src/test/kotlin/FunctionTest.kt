import function.Calculator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

import kotlin.math.*

class FunctionTest {
    private val testCalc: Calculator = Calculator()

    @Test
    @DisplayName("test in zero point")
    fun testSecantAtZero(){
        val correctAnswer = 1/cos(0.0)
        val testedAnswer = testCalc.secant(0.0)
        assertThat(testedAnswer).isEqualTo(correctAnswer)
    }

    @ParameterizedTest
    @ValueSource(doubles = [0.00008, -0.00008])
    fun testSecantNearZero(input: Double){
        val expectedAnswer = 1/cos(input)
        val actualAnswer = testCalc.secant(input)
        assertThat(actualAnswer).isEqualTo(expectedAnswer)
    }

    @ParameterizedTest
    @ValueSource(doubles = [0.05, -0.05])
    fun testSecantNear(input: Double){
        val expectedAnswer = 1/cos(input)
        val actualAnswer = testCalc.secant(input)
        assertThat(actualAnswer).isCloseTo(expectedAnswer, offset(0.001))
    }

    @Test
    @DisplayName("test that absolute amount is big")
    fun testSecantFail(){
        assertThrows(IllegalArgumentException::class.java){
            testCalc.secant(-0.2)
        }
    }
}