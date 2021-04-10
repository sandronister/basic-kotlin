package br.com.sandroni.models

import br.com.sandroni.interfaces.UserAuthInterface

class Client(
    val name: String,
    val CPF: String,
    val pass: Int,
    var adress:Adress=Adress()
): UserAuthInterface {

    override fun auth(pass: Int): Boolean {
        return this.pass == pass
    }
}