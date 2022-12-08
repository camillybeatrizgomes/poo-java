package aula7;

public class professor {
	public String nome;
	public Long cpf;
	public int idade;
	
	public void status() {
		System.out.println("Nome do Professor: "+this.getNome());
		System.out.println("CPF do Professor: "+this.getCpf());
		System.out.println("Idade do Professor: "+this.getIdade());
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
