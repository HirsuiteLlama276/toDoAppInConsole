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
        var result: String
       result = "Your task: ${show.name}"
        if (show.done) {
            result += " is done"
        } else {
            result += " is not yet done"
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
        while (i < tasks.size) {
            data = "${tasks[i].id},${tasks[i].name},${tasks[i].done}\n"
            i++
        }
        return data
    }

    fun readFromFile(dataFromFile: List<List<String>>) {
        //data.forEach { println(it) }
        var i = 0
        var data: Task
        println("Data read from $fileName:")
        while (i < dataFromFile.size-1) {
            data = Task(dataFromFile[i].get(0).toInt(),dataFromFile[i].get(1),dataFromFile[i].get(2).toBoolean())
            tasks.add(data)
            i++
        }
    }
}
