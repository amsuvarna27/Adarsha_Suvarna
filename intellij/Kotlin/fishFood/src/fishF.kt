import java.util.*
fun main(args: Array<String>){
    println("Hello, ${args[0]}")
    feedTheFish()
}
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and fish eat $food")
}
fun randomDay() : String {
    val week = listOf ("Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}
fun fishFood(day :String) : String{
    var food = "fasting"
   return when(day) {
       "Monday"-> "a"
       "Tuesday"-> "b"
       "Wednesday"->"c"
       "Thursday"->"d"
       "Friday"->"e"
       "Saturday"->"f"
       else -> "fasting"

    }
}