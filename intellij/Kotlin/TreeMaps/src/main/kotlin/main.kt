import java.util.*

fun main(args: Array<String>) {
    var name = TreeMap<String, Int>()
    name["Adarsha"] = 21
    name["Suvarna"] = 22
    name["Akshath"] = 23

    for((name, age) in name)

    {
        println("$name : $age")
    }
}