fun main() {
    val str = readLine();
    str?.let { value ->
        val (a, b) = value.split(" ").map { it.toInt() };
        var sum = 1;
        for(i in 1..b) {
            if(i % a == 0) sum*=i
        }
        print(sum)
    }
}