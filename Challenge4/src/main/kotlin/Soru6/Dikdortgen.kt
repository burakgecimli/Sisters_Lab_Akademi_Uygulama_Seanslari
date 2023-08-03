package Soru6


class Dikdortgen(val kisaKenar:Int, val uzunKenar:Int) : Shape {

    override fun alanHesapla() {
        println("Dikdörtgen Alan:${kisaKenar * uzunKenar}")

    }
}