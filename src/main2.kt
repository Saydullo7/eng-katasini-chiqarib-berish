fun main() {
   val s = S()
   val a = S.A(s)
    a.printme()
}
interface Printer{
    fun printme()
}
class S:Printer{
    override fun printme() {
        println("mani chop et")

    }
    class A(printer:Printer):Printer by printer

}