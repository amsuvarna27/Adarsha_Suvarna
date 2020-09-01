fun main(args: Array<String>) {
    var num = listOf(1,3,4,5,6,8,9,7,9,5,6)
    for((i,e) in num.withIndex())
    {
        println("$i : $e")
    }
}