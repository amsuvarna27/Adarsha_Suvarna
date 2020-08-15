import java.util.*
fun main(args: Array<String>){
   println("Hello, ${args[0]}")
    feedTheFish()
}
fun feedTheFish() {
    val day = randomDay()
    val food = "pallets"
    println("Today is $day and fish eat $food")
}
fun randomDay() : String {
    val week = listOf ("Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}