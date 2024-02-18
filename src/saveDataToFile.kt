import java.io.File
import java.io.FileWriter
import java.io.PrintWriter

fun saveDataToFile(data: String, fileName: String) {
    val file = File(fileName)
    if (!file.exists()) {
        file.createNewFile()
    }

    FileWriter(file, true).use { fileWriter ->
        PrintWriter(fileWriter).use { printWriter ->
            printWriter.println(data)
        }
    }
    println("Data saved to $fileName successfully.")
}