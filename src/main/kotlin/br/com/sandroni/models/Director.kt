package br.com.sandroni.models

import br.com.sandroni.models.AuthEmploye

class Director(
    name: String,
    CPF: String,
    salary: Double,
    pass: Int,
    val plr:Double
) : AuthEmploye(name, CPF, salary,pass) {

    override val bonus: Double
        get() = salary + plr
}