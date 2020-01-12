package CSVParser

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CSV2TableTest {
    val csv2T = CSV2Table()
    //val filename = "classpath:/personal.csv"

    @Test
    fun `input a file and makes a table`() {
        val result= csv2T.toTable()
        assertThat(result).isEqualTo(
                "Name         |Strasse         |Ort          |Alter|\n" +
                "--------------------------------------------------+\n" +
                "Peter Pan    |Am Hang 5       |12345 Einsam |42   |\n" +
                "Maria Schmitz|Kölner Straße 45|50123 Köln   |43   |\n" +
                "Paul Meier   |Münchener Weg 1 |87654 München|65   |"
        )
    }
}