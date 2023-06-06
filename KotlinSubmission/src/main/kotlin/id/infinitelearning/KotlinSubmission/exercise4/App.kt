package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    //operasi untuk membagi 2 angka
    println("Masukan angka pertama yang akan di bagi = ")
    var pertama = readLine()
    println("angka pertama anda adalah = $pertama, Masukan angka kedua yang akan di bagi = ")
    var kedua = readLine()

    try {
        val result = Integer.valueOf(pertama) / Integer.valueOf(kedua)
        println("The result is: $result")
    } catch (e: ArithmeticException) {
        println("Error occurred in arithmetic: ${e.message}")
    } catch (e: Exception) {
        println("Error occurred: ${e.message}")
    }
//jika di bagi 0 maka akan terdapat eror warning atau eror eror lainnya

}