package roman

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class RomanNumeralCalculatorTest {
    val romanNr = RomanNumeralCalculator()

    @Test
    fun `input 1 makes I`() {
        val result: String = romanNr.toRoman(1)
        Assertions.assertThat(result).isEqualTo("I")
    }

    @Test
    fun `input 2 makes II`() {
        val result: String = romanNr.toRoman(2)
        Assertions.assertThat(result).isEqualTo("II")
    }

    @Test
    fun `input 3 makes III`() {
        val result: String = romanNr.toRoman(3)
        Assertions.assertThat(result).isEqualTo("III")
    }

    @Test //@Disabled
    fun `input 4 makes IV`() {
        val result: String = romanNr.toRoman(4)
        Assertions.assertThat(result).isEqualTo("IV")
    }

    @Test
    fun `input 5 makes V`() {
        val result: String = romanNr.toRoman(5)
        Assertions.assertThat(result).isEqualTo("V")
    }

    @Test
    fun `input 6 makes VI`() {
        val result: String = romanNr.toRoman(6)
        Assertions.assertThat(result).isEqualTo("VI")
    }

    @Test
    fun `input 10 makes X`() {
        val result: String = romanNr.toRoman(10)
        Assertions.assertThat(result).isEqualTo("X")
    }

    @Test
    fun `input 18 makes XVIII`() {
        val result: String = romanNr.toRoman(18)
        Assertions.assertThat(result).isEqualTo("XVIII")
    }

    @Test
    fun `input 990 makes XXXI`() {
        val result: String = romanNr.toRoman(990)
        Assertions.assertThat(result).isEqualTo("CMXC")
    }

    @Test
    fun `input 1000 makes M`() {
        val result: String = romanNr.toRoman(1000)
        Assertions.assertThat(result).isEqualTo("M")
    }

    @Test
    fun `input 3000 makes MMM`() {
        val result: String = romanNr.toRoman(3000)
        Assertions.assertThat(result).isEqualTo("MMM")
    }

    @Test
    fun `input 3999 makes MMMCMXCIX`() {
        val result: String = romanNr.toRoman(3999)
        Assertions.assertThat(result).isEqualTo("MMMCMXCIX")
    }

    @Test
    fun `input 40 makes XL`() {
        val result: String = romanNr.toRoman(40)
        Assertions.assertThat(result).isEqualTo("XL")
    }

    @Test
    fun `input II makes 2`() {
        val result: Int = romanNr.fromRoman("II")
        Assertions.assertThat(result).isEqualTo(2)
    }

    @Test
    fun `input IV makes 4`() {
        val result: Int = romanNr.fromRoman("IV")
        Assertions.assertThat(result).isEqualTo(4)
    }

    @Test
    fun `input VI makes 6`() {
        val result: Int = romanNr.fromRoman("VI")
        Assertions.assertThat(result).isEqualTo(6)
    }

    @Test
    fun `input XIV makes 14`() {
        val result: Int = romanNr.fromRoman("XIV")
        Assertions.assertThat(result).isEqualTo(14)
    }

    @Test
    fun `input * makes *`() {
        for (i in 1..3999) {
            val result: Int = romanNr.fromRoman(romanNr.toRoman(i))
            Assertions.assertThat(result).isEqualTo(i)
        }
    }

}