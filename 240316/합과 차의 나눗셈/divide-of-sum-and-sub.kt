fun main() { 
    val str = readLine();
    if(str != null) {
        val splitStr = str.split(" ");

        val numA = splitStr[0].toDouble()
        val numB = splitStr[1].toDouble()

        val cal = (numA + numB) / (numA - numB);

        print("%.2f".format(cal))
    }else {
        print("str is null")
    }
}