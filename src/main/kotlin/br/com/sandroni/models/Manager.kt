package br.com.sandroni.models

import br.com.sandroni.models.AuthEmploye

class Manager(
    name: String,
    CPF: String,
    salary: Double,
    pass: Int
) : AuthEmploye(name, CPF, salary,pass) {

    override val bonus: Double
        get() {
            return  salary+ salary * 0.2
        }
}