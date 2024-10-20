

fun main() {
  println(bigNumber(12, 17,78))


}
fun <T>bigNumber(a:T,b:T,c:T):T {
  var a1: Double = a.toString().toDouble()
  var b1: Double = b.toString().toDouble()
  var c1: Double = c.toString().toDouble()

  if (a1>b1 && a1>c1) {
    return a
  }else if (b1>a1 && b1>c1){
    return b
    }else{
      return c
  }
}
