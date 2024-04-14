fun main() {
    var count = 0;
    for(i in 1..5) {
        val num = readLine()!!.toInt();
        if(num % 2 == 0) count ++;
    }
    print(count)
}