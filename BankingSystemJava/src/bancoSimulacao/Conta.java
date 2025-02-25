package bancoSimulacao;

public abstract class Conta {
	protected int numAgencia;
	protected int numConta;
	protected int senha;
	protected double saldo;
	protected Correntista correntista;
	
	public Conta(int numAgencia, int numConta, int senha, Correntista correntista) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.senha = senha;
		this.saldo = 0.0;
		this.correntista = correntista;
	}
	
	public abstract void realizarDeposito(double valorDeposito);
	public abstract void realizarSaque(double valorSaque, int senha);
	
	public void verificarSaldo(int senha) {
		if(this.senha == senha) {
			System.out.println("\nAgencia: " + numAgencia + " | Conta: " + numConta + " | Correntista: " + correntista.getNome() + " | Saldo: R$ " + saldo);
		} else {
			System.out.println("\nSenha incorreta. Não foi possível verificar saldo.");
		}

	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public int getConta() {
		return numConta;
	}
}
