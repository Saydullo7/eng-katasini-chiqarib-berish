fun main() {

var saydullo = GenericId("Ulud'vor",123,"Saydullo")
}
class GenericId<T>( val adress:T, val id:T,val name:T,) {
    init {
        println("adress:$adress,name:$name")
    }
}

