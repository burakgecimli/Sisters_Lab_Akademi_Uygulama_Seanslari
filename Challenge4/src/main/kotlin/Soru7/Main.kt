package Soru7

/*
 Bir "Calisan" (Employee) arayüzü oluşturun ve bu
  arayüzü uygulayan sınıfları (Mudur ve Memur) tanımlayın.
   Her sınıfın "maasHesapla" metodu olsun
 */

fun main() {
    val memur = Memur(4)
    memur.maasHesapla()

    val mudur = Mudur(10)
    mudur.maasHesapla()
}