fun main (){
    val a: String? = readLine();
    a?.let {
        val aNum: Int? = a.toIntOrNull()
        aNum?.let {
            return if(aNum>=113) print(1) else print(0)
        }
    }
}