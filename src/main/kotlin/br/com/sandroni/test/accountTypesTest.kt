import br.com.sandroni.models.Client
import br.com.sandroni.models.CurrentAccount
import br.com.sandroni.models.SavingsAccount

fun accountTypeTest() {
    val c1 = SavingsAccount(holder=Client("Gigio", "",1),number=1001)
    val c2 = CurrentAccount(holder=Client("Miguel", "",1),number=1002)

    c1.deposit(1000.0)
    c2.deposit(1000.0)

    c1.extract()
    c2.extract()

    c1.bag(100.0)
    c2.bag(100.0)

    c1.extract()
    c2.extract()

    c2.transfer(400.0, c1)

    c1.extract()
    c2.extract()
}
