fun main() {
    val a = readLine();

    a?.let { value -> 
        val (aa, bb) = value.split(" ").map { it.toInt() }

        for(i in aa..bb step(2))
            print("$i ")
    }
}