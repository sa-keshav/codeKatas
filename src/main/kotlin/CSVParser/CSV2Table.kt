package CSVParser

class CSV2Table {


    fun toTable(): String {
        val personalList = this::class.java.getResource("/personal.csv")?.readText()?.lines()
        var result = ""
        personalList?.ifEmpty { listOf("default") }?.forEach {
            val person = toPerson(it)

            result += toPrint(person)
            if (person.name == "Name") {
                result += "-".repeat(52)
                result += "+\n"
            }

        }
        return result


    }

    private fun toPerson(line: String): Person {
        var line = line.split(";").toTypedArray()
        return Person(
                name = line[0],
                strasse = line[1],
                ort = line[2],
                alter = line[3]
        )
    }

    private fun toPrint(person: Person): String {

        var str = ""
        str += person.name
        var wortLength: Int = person.name.length
        str += " ".repeat(14 - wortLength)
        str += "|"
        str += person.strasse
        wortLength = person.strasse.length
        str += " ".repeat(16 - wortLength)
        str += "|"
        str += person.ort
        wortLength = person.ort.length
        str += " ".repeat(14 - wortLength)
        str += "|"
        str += person.alter
        wortLength = person.alter.length
        str += " ".repeat(5 - wortLength)
        str += "|\n"

        return str
    }
}

data class Person(var name: String = "",
                  var strasse: String = "",
                  var ort: String = "",
                  var alter: String = "")