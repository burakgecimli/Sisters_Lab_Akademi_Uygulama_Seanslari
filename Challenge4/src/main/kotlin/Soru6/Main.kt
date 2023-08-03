package Soru6

/*
Geometrik şekilleri temsil eden bir arayüz (Shape) ve bu arayüzü uygulayan
 iki sınıf (Dikdortgen ve Daire) tanımlayın. Her şekil için alanı hesaplayacak bir metot olsun
 */
fun main() {

    val dikdortgen = Dikdortgen(4, 5)
    dikdortgen.alanHesapla()

    val daire = Daire(4.0)
    daire.alanHesapla()

}