package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
    var namadepan: String = "I Gusti Ngurah "
    var namabelakang: String = "Adi Permana"
    var umur: Int = 21
    var status: Boolean = false
    println("nama saya " + namadepan + namabelakang + ", umur saya = "+ umur+", Dalam hubungan = "+status)
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {

    println("kami grup = "+groupId+ ", dari sesi = "+ session+ ", dengan anggota = "+groupMember)
    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): String {
    var listgrup = arrayOf("Peja", "Mikais","Kevin","Ananda","Adi")
    var namaanggota: String =""
    for (i in 0..listgrup.size-1)
    {
        namaanggota += "\n"+(i+1)+"."+listgrup[i]
        if(listgrup[i] == "Adi"){
            namaanggota += ", ini saya"
        }
    }
    return namaanggota
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
    val countOfGroup = 5
    var jumlah = mentor.size + countOfGroup
    return jumlah

}

fun main() {

    myProfile()

    val myGroup = myGroup()
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(3, listOf("Hafara putri", "Mikais", "Ananda Samudra", "Nathaniel Kevin", "I Gusti Ngurah adi Permana"), "Afternoon")

}