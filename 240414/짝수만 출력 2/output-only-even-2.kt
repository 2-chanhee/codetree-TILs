fun main() {
    val a = readLine();

    a?.let { value -> 
        val (bb, aa) = value.split(" ").map { it.toInt() }

        for(i in bb downTo aa step(2))
            print("$i ")
    }
}