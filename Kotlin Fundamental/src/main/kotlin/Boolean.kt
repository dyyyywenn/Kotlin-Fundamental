import java.util.*

fun main(){
    val nilai = Scanner(System.`in`)
    print("Masukkan Nilai:")
    val nilaiTuntas : Int = nilai.nextInt()
    val result : Char = if (nilaiTuntas >= 90){
        'A'
    }else if (nilaiTuntas >=80){
        'B'
    }else if (nilaiTuntas>=70){
        'C'
    }else if (nilaiTuntas>=60){
        'D'
    }else {
        'E'
    }

    print("Nilai Anda : $result")
}