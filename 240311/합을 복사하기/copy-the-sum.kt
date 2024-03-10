fun main(){
    var a: Int = 1;
    var b: Int = 2;
    var c: Int = 3;

    val sum: Int = a+b+c;
    a = sum
    b = sum
    c = sum

    print("$a $b $c")
}