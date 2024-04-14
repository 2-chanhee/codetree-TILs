fun main() {
    val a = readLine();

    a?.toIntOrNull()?.let { value -> 
        var cnt = 1
        while(cnt <= value){
            cnt++
            println("*")
        }
    }
}