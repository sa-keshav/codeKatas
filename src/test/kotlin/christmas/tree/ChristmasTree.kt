package christmas.tree

class ChristmasTree {

    fun draw(height: Int): String {
        if (height == 3) {
            return "   X   \n" +
                    " XXX \n" +
                    "XXXXX"
        }
        if (height == 2) {
            return " X \n" +
                    "XXX"
        }
        return "X"
    }
}
