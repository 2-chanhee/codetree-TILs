fun main () {
    val phoneNumber = readLine();
    // let: null이 아닐 때만 호출
    phoneNumber?.let {
        val split: List<String> = phoneNumber.split('-');
        print("${split[0]}-${split[2]}-${split[1]}")
    }  
}