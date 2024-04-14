fun main() {
    val n = readLine()!!.toInt();

    for(i in 1..n) {
        val num = readLine()!!.toInt();
        if(num % 2 == 1 && num % 3 == 0) println(num)
    }
}