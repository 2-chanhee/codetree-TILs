fun main () {
    val str = readLine();

    val (sa, sb, sc) = str!!.split(" ")

    val intA = sa.toIntOrNull()
    val intB = sb.toIntOrNull()
    val intC = sc.toIntOrNull()

    var center = 0;

    if(intA != null && intB != null && intC != null) {
        if((intA < intB) && (intA < intC)) {
            if(intB < intC) center = intB else center = intC
        }else if ((intB < intA) && (intB < intC)) {
            if(intA < intC) center = intA else center = intC
        }else if ((intC < intA) && (intC < intB)) {
            if(intA < intB) center = intA else center = intB
        }
    }
    print(center)
}