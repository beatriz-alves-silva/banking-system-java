package bancoSimulacao;

public class ContaPoupanca extends Conta{
	private double rendimento;
		
	public ContaPoupanca(int numAgencia, int numConta, int senha, Correntista correntista) {
		super(numAgencia, numConta, senha, correntista);
		this.rendimento = 0.1;
	}

	// realiza depósito e calcula o rendimento com base no valor atual da conta
	@Override
	public void realizarDeposito(double valorDeposito) {
		super.setSaldo(super.getSaldo() + valorDeposito);
			
		double valorAtualizado = super.getSaldo() + calcularRendimento(super.getSaldo());
			
		super.setSaldo(valorAtualizado);
		
		System.out.println("\nDepósito de R$ " + valorDeposito + " na conta POUPANÇA " + super.getConta() + " | Saldo atualizado: R$ " + super.getSaldo());
	}
		
	@Override
	public void realizarSaque(double valorSaque, int senha) {
		// se a senha estiver correta
		if(senha == super.getSenha()) {
			// se o saldo for maior que o valor do saque
			if(super.getSaldo() >= valorSaque) {
				super.setSaldo(super.getSaldo() - valorSaque);
				System.out.println("\nSaque de R$ " + valorSaque + " na conta POUPANÇA " + super.getConta() + " | Saldo atualizado: R$ " + super.getSaldo());
			}
			// se o saldo não for suficiente para realizar o saque
			else{
				System.out.println("\nSaldo insuficiente. Saque não realizado.");
			}
		} else {
			System.out.println("\nSenha incorreta. Saque não realizado.");
		}
	}
		
	public double calcularRendimento(double saldoConta) {
		return rendimento * saldoConta;
	}
}
