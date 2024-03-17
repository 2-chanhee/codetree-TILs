fun main() {
    val str: String? = readLine();

    str?.toIntOrNull()?.let { value -> 
        if(value >= 3000) print("book")
        else if(value < 3000 && value >= 1000) print("mask");
        else if (value < 1000 && value >= 500) print("pen")
        else print("no")
    }
}