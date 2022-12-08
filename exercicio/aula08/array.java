package aula8;

import java.util.Arrays;

public class array {
	String nome;
	int idade;
	double[] nota = new double[3];
	
	public array(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public void adicionarNotas(double nota1, double nota2, double nota3) {
		nota[0] = nota1;
		nota[1] = nota2;
		nota[2] = nota3;
	}
	
	public double calcularMedia() {
		double soma = 0;
		for (double n : nota) {
			soma += n;
		}
		return soma/3;
	}

	@Override
	public String toString() {
		return "array [nome = " + nome + ", idade = " + idade + ", nota = " + Arrays.toString(nota) + ", Média = "
				+ calcularMedia()+ "]";
	}

}

