fun main(args: Array<String>) {
    var a1 = Adarsh()
    a1.skills = "Java"
    a1.show()

    var a2 = Adarsh()
    a2.skills = " SQL"
    a2.show()

    var a3 = a1.plus(a2)
    a3.show()

}
fun Adarsh.plus(a : Adarsh) : Adarsh
{
    var newAdarsh =Adarsh()
    newAdarsh.skills = this.skills + "  " + a.skills
    return newAdarsh
}