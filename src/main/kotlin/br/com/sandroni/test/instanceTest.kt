import br.com.sandroni.models.Adress
import br.com.sandroni.models.Client
import br.com.sandroni.models.CurrentAccount
import br.com.sandroni.models.SavingsAccount

fun instanceTest() {
    val a1 = SavingsAccount(
        holder = Client(
            name="Gigio",
            CPF="777777777",
            pass=1,
        adress =Adress(
            place = "Av Paulista",
            number = 1005,
            district = "Cerqueira Cesar",
            city="São Paulo",
            county = "SP"
        )),
        number=777)

    a1.deposit(90000.0)

    val a2 = CurrentAccount(number = 3333, holder = Client("Miguel", "",1))
    a2.deposit(90000.0)

    println(a1.holder)
    println("Holder ${a1.holder.name}")
    println("CPF ${a1.holder.CPF}")
    println("Adress ${a1.holder.adress.place}, ${a1.holder.adress.number} - ${a1.holder.adress.city}")
    a1.extract()

    a2.extract()

    a1.transfer(900.0, a2)

    a1.deposit(555.0)
    a1.extract()
    a1.bag(50.0)
    a1.extract()

    a2.extract()
}