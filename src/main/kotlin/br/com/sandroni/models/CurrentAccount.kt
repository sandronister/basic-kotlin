package br.com.sandroni.models

import br.com.sandroni.exception.InsufficientFundsException


class CurrentAccount(
    holder: Client,
    number: Int
): Account(holder,number) {

    override fun bag(value:Double){
        val valueWithTax=value+0.50

        if(this.balance<valueWithTax){
            throw InsufficientFundsException()
        }

        this.balance-=valueWithTax

    }
}