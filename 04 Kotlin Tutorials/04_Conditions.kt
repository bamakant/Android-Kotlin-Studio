fun main(args: Array<String>) {
    // //declare a constant value lives
    // val lives = 0

    // var isGameOver = (lives < 1)

    // println(isGameOver)

    // if(isGameOver){
    //     println("You are dead.")
    // } else {
    //     println("You are still alive.")
    // }
    // If else condition ends here

    println("how old are you?")
    val age = readLine()!!.toInt()

var message : String
    if(age < 18){
        message = "you are too young."
    } else if(age == 100){
        message = "Cofngratulations."
    } else{
        message = "You can vote."
    }

    println(message)
}