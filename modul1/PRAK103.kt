fun main(){
    print("Input Bilangan = ")
    var nilai1 = Integer.valueOf(readLine())
    var i = 2
    var y = 6
    while (i <= y) {
        var jawab = i * nilai1
        if (jawab % 2 == 0 || jawab % 3 ==0) {
            println(jawab)
            i++
        } else {
            print("")
            i++
            y++
        }
    }
}
