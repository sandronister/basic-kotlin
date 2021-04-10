package br.com.sandroni.models


class CurrentAccount(
    holder: Client,
    number: Int
): Account(holder,number) {

    override fun bag(value:Double){
        val valueWithTax=value+0.50

        if(this.balance>=valueWithTax){
            this.balance-=valueWithTax
        }
    }
}