fun main () {
    val str = readLine();

    val (sa, sb, sc) = str!!.split(" ")

    val intA = sa.toIntOrNull()
    val intB = sb.toIntOrNull()
    val intC = sc.toIntOrNull()

    val numbers = listOf(intA, intB, intC).filterNotNull().sorted();
    print(numbers[1])
}