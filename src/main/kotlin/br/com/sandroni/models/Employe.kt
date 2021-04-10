package br.com.sandroni.models

abstract class Employe(
    val name: String,
    val CPF: String,
    val salary: Double
) {
    abstract val bonus:Double
}