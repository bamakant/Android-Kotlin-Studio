
fun main(args: Array<String>) {
    println(Owl("Owl", 5))
}

open class Bird(var name : String, var weight : Int){}

class Owl(nam: String, wt: Int) : Bird(nam, wt){
 
override fun toString() : String{
 return "name $name"
}
}