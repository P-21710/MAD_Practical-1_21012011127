
class student(var name:String) : person(firstname = "prasad", lastname = "rajyaguru")
{

    var enrollmentno:String="21012011127"
    constructor(name:String,enrollmentno:String):this(name)
    {
        var enno=enrollmentno
    }
    init {
        println("init function called")
    }

    override fun toString(): String {
        return super.toString()
    }
}
open class person(firstname:String,lastname:String)
{
    var first = firstname
    var last = lastname
}
fun main()
{
    val s=student("prasad")
    println(s.name)
    println(s.enrollmentno)
    println(s.first+" "+s.last)
}