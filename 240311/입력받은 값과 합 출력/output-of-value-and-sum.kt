fun main (){
    val input: List<String> = readLine()?.split(" ") ?: emptyList()

    if(input.size === 2){
        val a: Int = input[0].toInt();
        val b: Int = input[1].toInt();

        print("$a $b ${a+b}")
    }
}