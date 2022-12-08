package aula7;

public class aluno {
	protected String nome;
	protected Long cpf;
	protected int idade;
	
	public void status() {
		System.out.println("Nome do Aluno: "+this.getNome());
		System.out.println("CPF do Aluno: "+this.getCpf());
		System.out.println("Idade do Aluno: "+this.getIdade());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
