fun main() {
    val a = readLine();

    a?.toIntOrNull()?.let { value -> 
        for (i in 1..value)
            print("$i ")
    }
}