fun main() {
    val str = readLine();
    val sNumbers = str!!.split(" ")!!.mapNotNull {it.toIntOrNull()}
    
    return if (sNumbers[1] > sNumbers[0] && sNumbers[1] < sNumbers[2]) print(1) else print(0)
}