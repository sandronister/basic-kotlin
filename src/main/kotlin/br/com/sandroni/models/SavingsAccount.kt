package br.com.sandroni.models

import br.com.sandroni.exception.InsufficientFundsException


class SavingsAccount(
    holder: Client,
    number: Int
): Account(holder,number) {

    override fun bag(value: Double) {
        if(this.balance < value){
          throw InsufficientFundsException()
        }

        this.balance-=value
    }
}