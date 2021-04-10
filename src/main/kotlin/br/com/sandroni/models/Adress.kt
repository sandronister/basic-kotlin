package br.com.sandroni.models

class Adress(
    var place: String = "",
    var number: Int = 0,
    var district: String = "",
    var city: String = "",
    var county: String = "",
    var zipcode:String="",
    var complement:String=""
) {
    override fun toString(): String {
        return """
            Adress(place='$place', 
            number=$number, 
            district='$district', 
            city='$city', 
            county='$county', 
            zipcode='$zipcode', 
            complement='$complement')""".trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Adress

        if (place != other.place) return false
        if (number != other.number) return false
        if (district != other.district) return false
        if (city != other.city) return false
        if (county != other.county) return false
        if (zipcode != other.zipcode) return false
        if (complement != other.complement) return false

        return true
    }

    override fun hashCode(): Int {
        var result = place.hashCode()
        result = 31 * result + number
        result = 31 * result + district.hashCode()
        result = 31 * result + city.hashCode()
        result = 31 * result + county.hashCode()
        result = 31 * result + zipcode.hashCode()
        result = 31 * result + complement.hashCode()
        return result
    }


}
