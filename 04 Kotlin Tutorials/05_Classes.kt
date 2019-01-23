class Player(var name : String){
    var lives = 3
    var two = 2
    var one = 1
    fun show(){
        println("""
        name : $name
        lives : $lives
        tow : $two
        one : $one
        """)
    }
}

fun main(args: Array<String>){
val bama = Player("Bama")
// println(bama.name)
// println(bama.two)
// println(bama.one)

bama.show()

val b = Player("Bam")
b.lives = 5
b.show()
}