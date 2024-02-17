/*
    1. Add tasks v
    2. Delete tasks v
    3. Edit tasks v
    4. Write tasks to file
    5. Make an UI
    6. Make it installable
 */

fun main()
{
    val task = Task(1,"test",false)
    val tasks = arrayListOf<Task>()
    tasks.add(task)
    val test = Tasks(tasks)
    test.showAllTasks()
}