package bancoSimulacao;

public class ContaCorrente extends Conta{
	private double limite;
		
	public ContaCorrente(int numAgencia, int numConta, int senha, Correntista correntista, double limite) {
		super(numAgencia, numConta, senha, correntista);
		this.limite = limite;
	}
	
	
	// realiza depósito na conta
	@Override
	public void realizarDeposito(double valorDeposito) {
		super.setSaldo(super.getSaldo() + valorDeposito);
		System.out.println("\nDepósito de R$ " + valorDeposito + " na conta CORRENTE " + super.getConta() + " | Saldo atualizado: R$ " + super.getSaldo());
	}
	
	// realiza saque se o valor do saque for menor ou igual ao saldo + limite (o usuário pode ficar negativado)
	@Override
	public void realizarSaque(double valorSaque, int senha) {
		// se a senha estiver correta
		if(senha == super.getSenha()) {
			// se o saldo for maior que o valor do saque
			if(super.getSaldo() >= valorSaque) {
				super.setSaldo(super.getSaldo() - valorSaque);
				System.out.println("\nSaque de R$ " + valorSaque + " na conta CORRENTE " + super.getConta() + " | Saldo atualizado: R$ " + super.getSaldo());
			} 
			// se o saldo + limite for maior que o valor do saque
			else if((super.getSaldo() + limite) >= valorSaque) {
				super.setSaldo(super.getSaldo() - valorSaque);
				System.out.println("\nSaque de R$ " + valorSaque + " na conta CORRENTE " + super.getConta() + " | Saldo atualizado: R$ " + super.getSaldo());
			}
			// se o saldo + limite não for suficiente para realizar o saque
			else{
				System.out.println("\nSaldo insuficiente. Saque não realizado.");
			}
		} else {
			System.out.println("\nSenha incorreta. Saque não realizado.");
		}
	}
}
