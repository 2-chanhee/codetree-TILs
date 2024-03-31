fun main() {
    val str: String? = readLine();

    str?.toIntOrNull()?.let { value -> 
        if (value % 3 == 0) println("YES") else println("NO")
        if (value % 5 == 0) print("YES") else print("NO")
    }
}