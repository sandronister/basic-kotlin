package br.com.sandroni.models

abstract class Account(
    var holder:Client,
    var number:Int=0
    ){
    var balance=0.0
        protected set

    companion object{
        var totalAccount:Int=0
            private set
    }

    init {
        totalAccount++
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

    fun transfer(value:Double,destiny: Account):Boolean{

        if(this.balance<value){
            return false
        }

        this.bag(value)
        destiny.deposit(value)
        return true
    }
}