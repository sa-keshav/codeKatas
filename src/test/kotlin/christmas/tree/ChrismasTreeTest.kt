package christmas.tree

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChrismasTreeTest {

    val tree = ChristmasTree()

    @Test
    fun `input 1 makes X`() {

        val result: String = tree.draw(1)
        assertThat(result).isEqualTo("X")
    }

    @Test
    fun `input 2 makes two rows`() {
        val result: String = tree.draw(2)
        assertThat(result).isEqualTo(" X \nXXX")
    }

    @Test
    fun `input 3 makes three rows`() {
        val result: String = tree.draw(3)
        assertThat(result).isEqualTo("   X   \n XXX \nXXXXX")
    }


}