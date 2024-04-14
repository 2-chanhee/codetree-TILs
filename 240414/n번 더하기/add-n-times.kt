fun main() {
    val a = readLine();

    a?.let { value -> 
        val (a, n) = value.split(" ").map { it.toInt() }

        var init = a + n
        for(i in 1..n){
            if (i==1) println (init)
            else {
                init = init + n
                println(init)
            }
                    
        }
            
    }
}