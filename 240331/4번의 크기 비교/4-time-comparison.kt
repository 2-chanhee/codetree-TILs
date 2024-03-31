fun main() {
    val str = readLine()
    val str2 = readLine()

    val intValue: Int? = str?.toIntOrNull()

    if (intValue != null && str2 != null) {
        val sNumbers = str2.split(" ").map { it.trim().toIntOrNull() }
        sNumbers.forEach { number ->
            if (number != null) {
                if (intValue > number) println(1) else println(0)
            } else {
                println("Invalid input in the second string.")
                return
            }
        }
    } else {
        println("Invalid input.")
        return
    }
}