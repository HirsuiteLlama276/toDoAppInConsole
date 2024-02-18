/*
    1. Add tasks v
    2. Delete tasks v
    3. Edit tasks v
    4. Write tasks to file v
    5. Make an UI
    6. Make it installable
 */
const val fileName = "listOfTasks.csv"
fun main()
{
    val task = Task(1,"Making TODO app in Android",false)
    val tasks = arrayListOf<Task>()
    tasks.add(task)
    val test = Tasks(tasks)

    saveDataToFile(test.saveToFile(), fileName)
    test.readFromFile(readDataFromFile(fileName))
    test.showAllTasks()
}