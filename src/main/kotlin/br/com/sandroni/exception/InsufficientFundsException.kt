package br.com.sandroni.exception

import java.lang.Exception

class InsufficientFundsException(message:String="Insufficient Funds") : Exception(message) {}