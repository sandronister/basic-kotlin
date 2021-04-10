package br.com.sandroni.models

import br.com.sandroni.interfaces.UserAuthInterface

class InternalSystem {

    fun auth(employe: UserAuthInterface, pass:Int){
        if(employe.auth(pass)){
            println("Você conseguiu autenticar")
        }else{
            println("Verifique seu usuário e senha")
        }
    }

}