fun main() {
    val a: String? = readLine();

    a?.toIntOrNull()?.let { value -> 
        return if(value % 3 == 0 || value % 5 == 0) print(1) else print(0)
    }


}