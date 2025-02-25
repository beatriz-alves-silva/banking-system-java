package bancoSimulacao;

public class Endereco {
	private String logradouro;
	private int numero;
	private String cidade;
	private String UF;
		
	public Endereco(String logradouro, int numero, String cidade, String UF) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.UF = UF;
	}
}
