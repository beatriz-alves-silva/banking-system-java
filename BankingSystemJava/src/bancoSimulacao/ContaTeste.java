package bancoSimulacao;

public class ContaTeste {
	public static void main(String[] args) {
		Correntista correntista1 = new Correntista("444.444.444-44", "João Silva", "Rua 15", 34, "Ponta Grossa", "PR");
		Correntista correntista2 = new Correntista("777.777.777-77", "Maria Oliveira", "Avenida 1", 345, "São José dos Campos", "SP");
		ContaPoupanca conta1 = new ContaPoupanca(7, 777, 123, correntista1);
		ContaCorrente conta2 = new ContaCorrente(3, 333, 456, correntista2, 300);

		conta1.realizarDeposito(300);
		conta1.verificarSaldo(123);
		conta1.realizarDeposito(100);
		conta1.realizarSaque(473, 123);
		
		conta2.realizarDeposito(234);
		conta2.verificarSaldo(456);
		conta2.realizarSaque(532, 456);
		conta2.realizarDeposito(1);
	}
}
