fun main() {
    val info1: String? = readLine();
    val info2: String? = readLine();

    if(info1 != null && info2 != null) {
        val (info1Age, info1Sex) = info1.split(" ")
        val (info2Age, info2Sex) = info2.split(" ")

        val info1AgeInt = info1Age.toIntOrNull()
        val info2AgeInt = info2Age.toIntOrNull()

        if(info1AgeInt != null && info2AgeInt !== null ) {
            return if((info1AgeInt >= 19 && info1Sex == "M") || (info2AgeInt >= 19 && info2Sex == "M")) print(1) else print(0)
        }
    }
}