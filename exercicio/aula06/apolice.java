package aula6;

public class apolice {
	String nome;
	int idade;
	float valorPremio;
	
public apolice(String nome, int idade, float valorPremio) {
		this.nome = nome;
		this.idade = idade;
		this.valorPremio = valorPremio;
	}

public apolice() {
	
}

public void imprimir() {
	System.out.println("Nome: "+this.nome);
	System.out.println("Idade: "+this.idade);
	System.out.println("Valor do Prêmio: "+this.valorPremio);
}

public void calcularPremioApolice() {
	if(idade >= 18 && idade <= 25) {
		valorPremio +=(valorPremio * 20)/100;
	} else if(idade > 25 && idade <= 36) {
		valorPremio +=(valorPremio * 15)/100;
	} else if(idade > 36) {
		valorPremio +=(valorPremio * 10)/100;
	}
}

public void oferecerDesconto(String cidade){
	if(cidade == "Curitiba") {
		valorPremio = valorPremio * 80/100;
	} else if (cidade == "Rio de Janeiro") {
		valorPremio = valorPremio * 85/100;
	} else if (cidade == "São Paulo") {
		valorPremio = valorPremio * 90/100;
	} else if (cidade == "Belo horizonte") {
		valorPremio = valorPremio * 95/100;
	}
	
}
}
