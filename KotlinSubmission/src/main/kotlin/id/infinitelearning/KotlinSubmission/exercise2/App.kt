package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    var genap = mutableListOf<Int>()
    for (i in 1..100){
        if (i%2==0){
            genap.add(i)
        }

    }
println(genap.toList())

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
val bulan = mapOf<String,String>(
    "jan" to "Januari",
    "feb" to "Februari",
    "mar" to "Maret",
    "mei" to "Mei",
    "jun" to "Juni",
    "jul" to "Juli",
    "agu" to "Agustus",
    "apr" to "April",
    "sep" to "September",
    "okt" to "Oktober",
    "nov" to "November",
    "des" to "Desember"
)
    bulan.forEach { entry ->
        print("\n${entry.key} -> ${entry.value}")
    }
    val monthNow = bulan["jun"]
    val birthMonth = bulan["jan"]
    println("\nIt's {$monthNow} now, I was born in {$birthMonth}")
}