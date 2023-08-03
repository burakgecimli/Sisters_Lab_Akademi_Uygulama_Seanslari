package Soru6

class Daire(val yaricap: Double) : Shape {
    override fun alanHesapla() {
        println("Daire Alanı:${Math.PI * yaricap * yaricap}")
    }
}