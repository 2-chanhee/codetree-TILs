fun main() {
    val str: String? = readLine();

    str?.let {
        val strNum: Int = str.toInt();

        if (strNum == 1) print("t") else print("f")

    }
}