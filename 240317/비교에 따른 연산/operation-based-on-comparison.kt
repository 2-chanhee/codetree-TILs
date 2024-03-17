fun main (){
    val str = readLine();
    
    str?.let {
        val strNum = str.split(" ");
        val a: Int? = strNum[0].toIntOrNull();
        val b: Int? = strNum[1].toIntOrNull();

        if(a!=null && b!=null) {
             if (a>b) print(a * b) else print(a / b)
        }
         
    }
}