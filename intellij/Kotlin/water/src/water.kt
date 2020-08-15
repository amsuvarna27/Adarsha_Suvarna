import java.util.*
fun main(args: Array<String>){
    println("Hello, ${args[0]}")
    feedTheFish()
}
fun shouldChangeWater (
    day : String,
    temperature : Int = 22,
    dirty : Int = 20) : Boolean{
    return true
}

fun shouldChangeWater2 (
    day : String,
    temperature : Int = 22,
    dirty : Int = 20) {
}
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and fish eat $food")
    shouldChangeWater(day,20,50 )
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWater2(day="Monday")

    if (shouldChangeWater(day)){
        println("Change the water today")
    }


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