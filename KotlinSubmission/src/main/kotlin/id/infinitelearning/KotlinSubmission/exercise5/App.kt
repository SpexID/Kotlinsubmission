package id.infinitelearning.KotlinSubmission.exercise5

import kotlin.math.min

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
var hero = Hero()

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
hero.setProfile("I Gusti Ngurah Adi Permana",21,177)


    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
hero.profile()


    /**
    Challenge:
    Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Group 3: jalan 3x -1, lari 1x -2 , makan 5x +2 , minum 1x +2 , lompat 5x -2, duduk 3x+2  //saya grup 3 dengan ibu peja
    Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */

    var jalan = 3
    var lari = 1
    var makan = 5
    var minum = 1
    var lompat = 5
    var duduk = 3
//    * lari = -2
//    * makan = +2
//    * minum = +2
//    * lompat = -2
//    * duduk = +1
    var i = 0
    while (i<jalan){
    hero.jalan()
    i++
    }
    i = 0
    while (i<lari){
    hero.lari()
        i++
    }
    i = 0
    while (i<makan){
    hero.makan()
        i++
    }
    i = 0
    while (i< minum){
    hero.minum()
        i++
    }
    i = 0
    while (i<lompat){
    hero.lompat()
        i++
    }
    i = 0
    while (i<duduk){
    hero.duduk()
        i++
    }



    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
hero.profile()

}