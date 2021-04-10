package br.com.sandroni.models

import br.com.sandroni.interfaces.UserAuthInterface

abstract class AuthEmploye(
    name: String,
    CPF: String,
    salary: Double,
    val pass: Int
): Employe(
    name,
    CPF,
    salary
), UserAuthInterface {

    override fun auth(pass:Int): Boolean {
        return this.pass==pass
    }
}