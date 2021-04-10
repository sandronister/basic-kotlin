import br.com.sandroni.models.Client
import br.com.sandroni.models.Director
import br.com.sandroni.models.InternalSystem
import br.com.sandroni.models.Manager

fun polimorfTest() {
    val e1 = Director(name = "Gigio", CPF = "222.222.222-55", salary = 9000.00, pass = 1000, plr = 900.0)
    val e2 = Manager(name = "Miguel", CPF = "555.555.555-22", salary = 8000.00, pass = 2000)
    val c1 = Client(name="Julio",CPF="555.333.444-99",9000)

    val isystem = InternalSystem()

    isystem.auth(e1, 1200)
    isystem.auth(e2, 2000)
    isystem.auth(c1,9000)
}