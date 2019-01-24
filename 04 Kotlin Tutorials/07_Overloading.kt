fun main(args: Array<String>) {
   
   //show funtion to show int value
    fun show(n: Int): Int {
        return n
    }
//overload show method to show string value
    fun show(s: String): String{
        return s
    }

    println("Integer no is : ${show(5)}")
    println("String is : ${show("Hello")}")
}