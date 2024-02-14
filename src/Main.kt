/*
    1. Add tasks
    2. Delete tasks
    3. Edit tasks
    4. Write tasks to file
    5. Make an UI
    6. Make it installable
 */


open class Task()
{
    private var id: Int = 0
    var name:  String = ""
    var done: Boolean = false
    constructor(id: Int, name: String, done: Boolean) : this() {
        this.id=id
        this.name=name
        this.done=done
    }
}

class Tasks : Task()
{
    var tasks: List<Task> = TODO()
    fun addTask(task: Task)
    {
        tasks.addLast(task)
    }
}

fun main()
{
    val task = Task(1,"test",false)
    val tasks: Tasks = Tasks()
    tasks.addTask(task)

}