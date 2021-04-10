fun printBalance(balance:Double){
    when {
        balance > 0.0 -> println("Positive Balance")
        balance == 0.0 -> println("Neutre Balance")
        else -> print("Negative Balance")
    }
}