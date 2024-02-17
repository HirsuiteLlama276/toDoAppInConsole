class Tasks(private var tasks: ArrayList<Task>)
{

    fun addTask(task: Task)
    {
        tasks.add(task)
    }
    fun deleteTask(task: Task)
    {
        tasks.remove(task)
    }

    fun modifyTask(id: Int, task: Task)
    {
        tasks[id] = task
    }

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