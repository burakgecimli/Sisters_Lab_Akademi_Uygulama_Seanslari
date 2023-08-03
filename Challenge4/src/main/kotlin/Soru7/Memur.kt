package Soru7

class Memur(val uzmanlikYili: Int) : Calisan {

    override fun maasHesapla() {
        println(uzmanlikYili * 1000)
    }
}