package ChrismasTree

class ChristmasTree {

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
