import br.com.sandroni.models.Analist
import br.com.sandroni.models.Director
import br.com.sandroni.models.Manager
import br.com.sandroni.utils.BonusCalc

fun employeTest() {
    val e1 = Analist("Júlio", "111.222.333-44", 2000.00)

    println("Nome ${e1.name}")
    println("CPF ${e1.CPF}")
    println("Salário ${e1.salary}")
    println("Bonificação ${e1.bonus}")

    val e2 = Manager("Gigio", "222.333.444-55", 4000.00, 1234)
    println("Nome ${e2.name}")
    println("CPF ${e2.CPF}")
    println("Salário ${e2.salary}")
    println("Bonificação ${e2.bonus}")

    val e3 = Director("Miguel", "333.333.333-33", 6000.00, 4000, 400.00)
    println("Nome ${e3.name}")
    println("CPF ${e3.CPF}")
    println("Salário ${e3.salary}")
    println("Bonificação ${e3.bonus}")
    println("PLR ${e3.plr}")

    val e4 = Analist("Erika", "444.444.444-44", 3000.00)
    println("Nome ${e4.name}")
    println("CPF ${e4.CPF}")
    println("Salário ${e4.salary}")
    println("Bonificação ${e4.bonus}")

    val calc = BonusCalc()

    calc.register(e1)
    calc.register(e2)
    calc.register(e3)
    calc.register(e4)

    println("Total de bonus ${calc.total}")
}