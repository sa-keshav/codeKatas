package FizzBazz

class FizzBazz {

    fun fizzBazz(number: Int) {

        for (i in 1..number) {

            var result = ""

            if (i % 3 == 0) {
                result += "Fizz"
            }
            if (i % 5 == 0) {
                result += "Bazz"
            }
            println(if (result.isEmpty()) i.toString() else result)

        }

    }
}

fun main(args: Array<String>) {
    FizzBazz().fizzBazz(100)
}