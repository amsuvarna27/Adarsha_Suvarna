fun main(args: Array<String>) {
    val num : Int = 3
    var str = when(num)
    {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Enter valid input"
    }
    println("Given integer number is $str")
}