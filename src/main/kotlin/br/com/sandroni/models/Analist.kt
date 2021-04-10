package br.com.sandroni.models

class Analist(
    name: String,
    CPF: String,
    salary: Double
) : Employe(name, CPF, salary) {


    override val bonus: Double
        get() = salary *0.1 + salary
}