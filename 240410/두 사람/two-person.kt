fun main() {
    val info1: String? = readLine();
    val info2: String? = readLine();

    if(info1 != null && info2 != null) {
        val (info1Age, info1Sex) = info1.split(" ")
        val (info2Age, info2Sex) = info2.split(" ")

        if(info1Age != null && info2Age !== null ) {
            return if((info1_age >= 19 && info1_sex == "M") || (info2_age >= 19 && info2_sex == "M")) print(1) else print(0)
        }
    }
}