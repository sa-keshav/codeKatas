package roman

class RomanNumeralCalculator {


    fun toRoman(input: Int): String {
        var result = ""
        var x = input

        while (x != 0){
            if (x >= 1000){
                result += "M".repeat(x/1000)
                x %= 1000
            }
            if (x >= 500){
                if(x >= 900){
                    result += "CM" //case nochmal controllieren!
                    x %= 900
                }else {
                    result += "D"
                    x %= 500
                }
            }
            if (x >= 100){
                if (x >= 400){
                    result += "CD"
                    x %= 400
                } else {
                    result += "C".repeat(x/100)
                    x %= 100
                }
            }
            if (x >= 50){
                if(x >= 90){
                    result += "XC" //case nochmal controllieren!
                    x %= 90
                }else {
                    result += "L"
                    x %= 500
                }
            }
            if (x >= 10){
                if (x >=40){
                    result += "XL"
                    x %= 40
                }else{
                    result += "X".repeat(x/10)
                    x %= 10
                }
            }
            if (x >= 5) {
                if (x == 9){
                    result += "IX"
                    break
                }else{
                    result += "V"
                    x %= 5
                }
            }
            if (x == 4){
                result += "IV"
                break
            }
            else if (x < 4){
                result += "I".repeat( x/1)
                break
            }
        }

        print(result)

        return result
    }
}