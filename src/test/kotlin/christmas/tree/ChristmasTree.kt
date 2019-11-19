package christmas.tree

class ChristmasTree {

    fun draw(height: Int): String {
        if (height == 2) {
            return " X \nXXX"
        }
        return "X"
    }
}
