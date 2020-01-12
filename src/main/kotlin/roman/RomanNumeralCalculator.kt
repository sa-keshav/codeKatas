package roman


import java.util.*
import javax.swing.UIManager.put
import kotlin.collections.HashMap


class RomanNumeralCalculator {


    fun toRoman(input: Int): String {
        val map = TreeMap<Int, String>()
        with(map) {

            put(1000, "M")
            put(900, "CM")
            put(500, "D")
            put(400, "CD")
            put(100, "C")
            put(90, "XC")
            put(50, "L")
            put(40, "XL")
            put(10, "X")
            put(9, "IX")
            put(5, "V")
            put(4, "IV")
            put(1, "I")
        }
        /*lookup the greatest key less than or equal to the given key.
         If there is an exact match you just return the associated roman symbol,
         else you just concatenate the roman symbol associated by the greatest key
         less than the given number to the one returned by recursively calling
         the function using the current number subtracting the previous greatest key found
        * */
        val l = map.floorKey(input)
        return if (input == l) {
            map[input]!!
        } else map[l] + toRoman(input - l)
    }


    fun fromRoman(roman: String): Int {

        val map2 = TreeMap<String, Int>()
        with(map2)
        {

            put("M", 1000)
            put("CM", 900)
            put("D", 500)
            put("CD", 400)
            put("C", 100)
            put("XC", 90)
            put("L", 50)
            put("XL", 40)
            put("X", 10)
            put("IX", 9)
            put("V", 5)
            put("IV", 4)
            put("I", 1)
        }

        var i = 0
        var result = 0

        while (i < roman.length) {

            if (i == roman.length - 1) {
                result += map2[roman[i].toString()] ?: 0
                return result
            }
            var str = roman.substring(i..i + 1)

            if (map2.containsKey(str)) {
                result += map2[str] ?: 0
                i++
            } else result += map2[roman[i].toString()] ?: 0
            i++
        }
        return result
    }

}






































