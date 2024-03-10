fun main(){
    var a: Int = 5;
    var b: Int = 6;
    var c: Int = 7;

    var tempA: Int = a;
    var tempB: Int = b;
    var tempC: Int = c;

    b = tempA;
    c = tempB;
    a = tempC;

    println(a)
    println(b)
    print(c)
}