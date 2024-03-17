fun main() {
    val str: String? = readLine();

    str?.toIntOrNull()?.let { value -> 
        var letValue: Int = value
        if(value % 2 == 1) letValue = letValue + 3
        if(letValue % 3 == 0) letValue = letValue / 3;

        print(letValue)
    }
}