/*
    1. Add tasks
    2. Delete tasks
    3. Edit tasks
    4. Write tasks to file
    5. Make an UI
    6. Make it installable
 */


 data class Task( var name: String,  var done: Boolean)

 class Tasks(private var tasks: List<Task>)
{
    private fun showTask(i:Int)
    {
        val show = tasks[i]
        print("Your task: ${show.name}")
        if (show.done)
        {
            print(" is done")
        }
        else
        {
            print(" is not yet done")
        }
    }

    fun addTask(task: Task)
    {
        tasks.addLast(task)
    }
    fun showAllTasks()
    {
        var i = 0
        while (i < tasks.size)
        {
            showTask(i)
            i++
        }
    }
}

fun main()
{
    val task = Task("test",false)
    val taskList = listOf(task)
    val tasks = Tasks(taskList)
    tasks.showAllTasks()
}