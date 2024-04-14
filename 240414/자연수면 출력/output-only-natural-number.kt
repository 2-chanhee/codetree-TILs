fun main() {
    val a = readLine();

    a?.let { value -> 
        val (b, c) = value.split(" ").map { it.toInt() }
        return if(b>0) {
            for(i in 1..c) print(b)
        }else print(0)
    }
}