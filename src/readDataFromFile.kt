import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

fun readDataFromFile(fileName: String): List<List<String>> {
    val lines = Files.readAllLines(Paths.get(fileName))
    val result = mutableListOf<List<String>>()

    for (line in lines) {
        val tokenizer = StringTokenizer(line, ",")
        val values = mutableListOf<String>()

        while (tokenizer.hasMoreTokens()) {
            values.add(tokenizer.nextToken())
        }

        result.add(values)
    }

    return result
}