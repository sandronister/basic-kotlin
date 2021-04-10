package br.com.sandroni.models


class SavingsAccount(
    holder: Client,
    number: Int
): Account(holder,number) {

    override fun bag(value: Double) {
        if(this.balance>=value){
            this.balance-=value
        }
    }
}