fun main() {
    val x = readln().toInt()
    for (i in 1..x) {
        val y = readln()
        if (y.length>10){
            println("${y.first()}${y.length-2}${y.last()}")
        }
        else{
            println(y)
        }
    }
}