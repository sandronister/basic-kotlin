fun loopTest(){
    for(i in 6 downTo 1) {
        val holder = "Sandroni $i"
        val accountNumber = 1000+i
        var balance = 0.0

        balance += i+200

        println("Welcome $holder")
        println("br.sandroni.models.Account Number $accountNumber")
        println("Balance $balance")

        printBalance(balance)
        println("------------------------")
    }
}