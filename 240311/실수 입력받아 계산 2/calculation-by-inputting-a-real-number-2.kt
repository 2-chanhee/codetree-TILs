fun main() {
    val a = readLine()?.toDoubleOrNull();
    if(a !== null)  print("%.2f".format(a+1.5))
}