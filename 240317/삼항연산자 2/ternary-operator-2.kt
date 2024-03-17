fun main() {
    val str: String? = readLine();

    str?.toIntOrNull()?.let { value -> 
        if (value == 1) print("t") else print("f")
    }
}