fun main() {
    val a = readLine()?.toIntOrNull()
    a?.let { value -> 
        for (i in 1..value) {
            if (!(i % 2 == 0 && i % 4 != 0) && !((i / 8) % 2 == 0) && !(i % 7 < 4)) {
                print("$i ")
            }
        }
    }
}