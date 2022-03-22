import java.util.Scanner

fun main(){

    // mengambil input
    val reader = Scanner(System.`in`)
    print("Waktu Sekarang: ")
    val waktu = readLine()

    print("Nama Anda: ")
    val nama = readLine()
    print("Umur Anda: ")
    var umur = Integer.valueOf(readLine())
    print("Suhu Tubuh Anda: ")
    var suhutubuh:Float = reader.nextFloat()
    // menampilkan output

    println("Selamat $waktu, $nama.")
    println("Umur Anda $umur Tahun")
    if(suhutubuh >= 35 && suhutubuh <= 37 ){
        println("Suhu tubuh anda $suhutubuh derajat Celcius.")
    }
    else{
        println("Suhu Anda aneh, Anda bukan manusia.")
    }
}

