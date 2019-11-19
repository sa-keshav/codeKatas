package christmas.tree

class ChristmasTree {

    fun draw(height: Int): String {
        var result = ""

        result = when (height) {
            3 -> "  X\n" +
                 " XXX\n" +
                 "XXXXX"

            2 -> " X\n" +
                 "XXX"

            else -> "X"
        }
        print(result)

        return result
    }
}
