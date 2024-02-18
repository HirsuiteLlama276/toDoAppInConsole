class Tasks(private var tasks: ArrayList<Task>) {

    fun addTask(task: Task) {
        tasks.add(task)
    }

    fun deleteTask(task: Task) {
        tasks.remove(task)
    }

    fun modifyTask(id: Int, task: Task) {
        tasks[id] = task
    }

    private fun showTask(i: Int): String {
        val show = tasks[i]
        var result = "Your task: ${show.name}"
        result += if (show.done) {
            " is done"
        } else {
            " is not yet done"
        }
        return result
    }

    fun showAllTasks() {
        var i = 0
        while (i < tasks.size) {
            print(showTask(i) + "\n")
            i++
        }
    }

    fun saveToFile(): String {
        var i = 0
        var data = ""
        while (i < tasks.size)
        {
            data = "${tasks[i].id},${tasks[i].name},${tasks[i].done}\n"
            i++
        }
        return data
    }

    fun readFromFile(dataFromFile: List<List<String>>) {
        var i = 0
        var data: Task
        while (i < dataFromFile.size-1)
        {
            data = Task(dataFromFile[i][0].toInt(),dataFromFile[i][1],dataFromFile[i][2].toBoolean())
            tasks.add(data)
            i++
        }
    }
}
