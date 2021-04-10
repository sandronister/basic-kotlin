package br.com.sandroni.test

import br.com.sandroni.models.Adress

fun printToStringTest() {
    val a1 = Adress(place = "Av Interlagos", number = 871, district = "Jardim Marajoara", city = "São Paulo")
    val a2 = Adress(place="Av Jabaquara",number=500,district = "Jabaquara",city = "São Paulo")

    println(a1)
    println(a1.equals(a2))
    println(a1.hashCode())
    println(a2.hashCode())
}