fun main (){
    val numbers = readLine();
    numbers?.let {
        val sNumbers = numbers.split(" ");
        val a = sNumbers[0].toInt();
        val b = sNumbers[1].toInt();
        val c = sNumbers[2].toInt();

        val sum = a + b + c;
        val avg = (a + b + c) / 3
        print("$sum\n$avg\n${sum-avg}")
    }
}