package christmas.tree

class ChristmasTree {

    /*fun draw(height: Int): String {
        var result = ""

        result = when (height) {
            4 -> "   X\n" +
                    "  XXX\n" +
                    " XXXXX\n" +
                    "XXXXXXX"

            3 -> "  X\n" +
                    " XXX\n" +
                    "XXXXX"

            2 -> " X\n" +
                    "XXX"

            else -> "X"
        }
        print(result)

        return result
    }*/
    /*
    fun drawTree(height2: Int, withStar: Boolean): String{

        var result2 = ""
        var star = withStar

        for ( i in 1..height2){ // outerloop to count nr of rows
            if (star){
            for (j in height2 - i downTo 1){// to draw *
                result2 += " "
                }
                result2 += "*\n"
                star = false
            }
            for (j in height2 - i downTo 1){
                result2 += " "
            }

            for (j in 1 until (2*i)){
                result2 += "X"
            }
            result2 += "\n"

        }

        for (i in 1 until height2)
            result2 += " "
        result2 += "I"

        print(result2)
        return result2

      }
      */

    fun newDraw(height2: Int, withStar: Boolean): String{

        var result2 = ""

        if (withStar){// draw the star if required
            result2 += " ".repeat(height2-1)
            result2 += "*\n"
        }

        for ( i in 1..height2){ // count nr of rows

            result2 += " ".repeat(height2-i) // insert whitespace in each row before X
            result2 += "X".repeat(2*i-1) // insert X in each row
            result2 += "\n"

        }
        result2 += " ".repeat(height2-1)
        result2 += "I"

        print(result2)

        return result2
    }
}
