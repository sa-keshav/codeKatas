package christmas.tree

import ChrismasTree.ChristmasTree
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChrismasTreeTest {

    val tree = ChristmasTree()

    @Test
    fun `input 1 makes X`() {

        val result: String = tree.newDraw(1, true)
        assertThat(result).isEqualTo("*\nX\nI")
    }

    @Test
    fun `input 2 makes two rows`() {
        val result: String = tree.newDraw(2, true)
        assertThat(result).isEqualTo(" *\n X\nXXX\n I")
    }

    @Test
    fun `input 3 makes four rows`() {
        val result: String = tree.newDraw(3, true)
        assertThat(result).isEqualTo(
                "  *\n" +
                        "  X\n" +
                        " XXX\n" +
                        "XXXXX\n  I")
    }

    @Test
    fun `input 4 makes four rows`() {
        val result2: String = tree.newDraw(4, false)
        assertThat(result2).isEqualTo("   X\n  XXX\n XXXXX\nXXXXXXX\n   I")
    }

    @Test
    fun `input 3 made with new function`() {
        val result2: String = tree.newDraw(4, true)
        assertThat(result2).isEqualTo("   *\n   X\n  XXX\n XXXXX\nXXXXXXX\n   I")
    }


}