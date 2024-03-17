fun main () {
    val str: String? = readLine();

    str?.toIntOrNull()?.let { value ->
        if(value >= 3000) print("book");
        else if (value >= 1000 && value < 3000) print("mask")
        else print("no")
    }
}