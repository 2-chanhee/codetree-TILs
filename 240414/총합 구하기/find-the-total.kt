fun main(){
    val str = readLine();

    str?.let { value -> 
        val (a, b) = value.split(" ").map { it.toInt() };
        var sum = 0;
        for(i in a..b){
            if(i % 6 == 0 && i % 8 != 0) sum = sum + i;
        }
        print(sum)
    }
}