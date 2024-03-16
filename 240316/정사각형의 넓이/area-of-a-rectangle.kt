fun main (){
    val strNumber = readLine();

    strNumber?.let {
        val number: Int = strNumber.toInt();
        return if (number < 5) print("${number * number}\ntiny") else print("${number * number}")
    }
}