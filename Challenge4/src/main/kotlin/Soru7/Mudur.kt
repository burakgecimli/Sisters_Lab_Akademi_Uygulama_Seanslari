package Soru7

class Mudur(val uzmanlikYili: Int) : Calisan {
    override fun maasHesapla() {
        println(uzmanlikYili * 1000)
    }
}