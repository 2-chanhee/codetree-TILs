fun main () {
    val strNumber = readLine();
    strNumber?.let {
        val number: Int? = strNumber.toIntOrNull();
        if(number != null){
            return if(number >= 80) print("pass") else print("${80 - number} more score")
        }else{
            print("number is null")
        }
    }
}