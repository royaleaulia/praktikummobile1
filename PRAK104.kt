class Mobil(
    private val merekmobil: String = "Avanza" ,
    private val tahun: Int = 2014,
    var isOn: Boolean = false
){

    fun output(){
        println("Merek Mobil = $merekmobil")
        println("Diproduksi pada tahun = $tahun")
    }

    fun turnOn() {
        isOn = true
    }
    // member function
    fun turnOff() {
        isOn = false
    }

    fun StatusMesin() {
        if (isOn == true)
            println("Mobil Merek ${merekmobil} Menyalakan Mesin")
        else
            println("Mobil Merek ${merekmobil} Mematikan Mesin")
    }
}

fun main() {

    val mobil1 = Mobil()
    mobil1.output()
    mobil1.turnOn()
    mobil1.StatusMesin()
    mobil1.turnOff()
    mobil1.StatusMesin()

}
