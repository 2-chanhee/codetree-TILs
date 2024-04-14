fun main () {
    val a = readLine();
    var count = 0;
    a?.toIntOrNull()?.let {value -> 
        for(i in 1..value) {
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0) continue;
            count++
        }
        print(count)
    }
}