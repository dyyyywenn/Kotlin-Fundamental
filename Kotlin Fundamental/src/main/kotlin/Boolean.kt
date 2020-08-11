fun main() {
    val Nilaiku = 90
    val kkm = 75
    val tuntas = Nilaiku > kkm

    if (!tuntas) {
        print("Anda belum tuntas")
        } else {
        print("Anda Tuntas")
        }
    println()
    if(Nilaiku >= 90){
        println("Anda mendapatkan nilai A")
    }else if(Nilaiku >= 80){
        println("Anda mendapatkan nilai B")
    }else if(Nilaiku >= 70){
        println("Anda mendapatkan nilai C")
    }else if(Nilaiku >= 60){
        println("Anda mendapatkan nilai D")
    }else{
        println("Anda Mendapatkan nilai E")
    }
}