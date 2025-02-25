package bancoSimulacao;

public class Correntista{
	private String cpf;
	private String nome;
	private Endereco endereco;
		
	public Correntista(String cpf, String nome, String logradouro, int numero, String cidade, String UF) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = new Endereco(logradouro, numero, cidade, UF); 
	}
		
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
