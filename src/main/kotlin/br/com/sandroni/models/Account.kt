package br.com.sandroni.models

import br.com.sandroni.exception.AuthException
import br.com.sandroni.exception.InsufficientFundsException
import br.com.sandroni.interfaces.UserAuthInterface

abstract class Account(
    var holder:Client,
    var number:Int=0
    ): UserAuthInterface{
    var balance=0.0
        protected set

    companion object{
        var totalAccount:Int=0
            private set
    }

    init {
        totalAccount++
    }

    override fun auth(pass: Int): Boolean {
        return this.holder.auth(pass)
    }


    fun deposit(balance:Double){
        if(balance>0) {
            this.balance += balance
        }
    }

    abstract fun bag(value:Double)

    fun extract(){
        println("Your Balance ${this.holder.name} - ${this.balance}")
    }

    fun transfer(value:Double,destiny: Account,pass:Int){

        if(this.balance<value){
            throw InsufficientFundsException("Actual Funds ${this.balance} - Amount Withdraw $value")
        }

        if(!this.auth(pass)){
            throw AuthException("Fail Password ${this.holder.name}")
        }

        this.bag(value)
        destiny.deposit(value)
    }
}