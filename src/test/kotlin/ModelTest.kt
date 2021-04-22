import models.*

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ModelTest {
    @Test
    @DisplayName("test when no captives")
    fun testNoCaptives(){
        val newVogon: Vogon = Vogon("KoJl9l", "Sun")
        val newCaptives: Captives = Captives(false)

        newVogon.pamperVogonHimself(newCaptives)
        val vogonCondition = newVogon.rested || newVogon.readyToVileness

        assertThat(vogonCondition).isFalse()
    }

    @Test
    @DisplayName("test when captives are exist")
    fun testThereAreCaptives(){
        val testedVogon: Vogon = Vogon("reHa", "KpoKoguJl")
        val newCaptives: Captives = Captives(true)

        testedVogon.pamperVogonHimself(newCaptives)
        val vogonCondition = testedVogon.rested && testedVogon.readyToVileness

        assertThat(vogonCondition).isTrue()
    }

    @Test
    @DisplayName("test name")
    fun testName(){
        val testedVogon: Vogon = Vogon("Joker", "Admin")

        assertThat(testedVogon.name).isEqualTo("Joker")
    }
}