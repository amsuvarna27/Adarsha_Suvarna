fun main(args: Array<String>) {
    var num = 6;
    var fact = 1;
    for (i in 1..num)
    {
        fact = fact * i;

    }
    println(" The factorial of $num is $fact")
}

fun fact(num: Int): Int {
    if (num == 0)
        return 1;
    else
        return num * fact(num-1)

}
