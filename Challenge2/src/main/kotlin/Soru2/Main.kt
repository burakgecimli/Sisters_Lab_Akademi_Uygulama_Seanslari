package Soru2

fun main() {

    /*
    Bir "Hayvan" adlı üst sınıf oluşturun ve bu sınıfta hayvanların ses çıkarma
    özelliği için "sesCikar" adında bir metot tanımlayın. Ardından "Kedi" ve "Kopek" adlı
     iki alt sınıf oluşturun. Her bir alt sınıf, "sesCikar" metotunu kendi türüne uygun
     şekilde ezerek (override ederek) kendi sesini çıkartsın. Sonrasında bir "HayvanBarinagi"
     adlı sınıf oluşturun ve bu sınıfta "sesCikar" metodu parametre olarak aldığı hayvan
     nesnesini çağırarak hayvanın sesini çıkartsın.
     Polymorphism özelliğini kullanarak bu sınıfları nasıl bir arada kullanabilirsiniz?
     */


    val barinak = HayvanBarinagi()

    val kedi: Hayvan = Kedi()
    val kopek: Hayvan = Kopek()


    barinak.sesCikar(kedi)
    barinak.sesCikar(kopek)


}