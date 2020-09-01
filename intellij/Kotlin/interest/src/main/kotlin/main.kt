fun main(args: Array<String>) {
    var finalAmt = calcAmount(50, 0.04)
    println(finalAmt)


}

fun calcAmount(amt : Int, interest : Double) : Int
{
    return (amt + amt * interest).toInt()
}