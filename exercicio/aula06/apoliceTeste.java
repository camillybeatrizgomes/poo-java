package aula6;

public class apoliceTeste {
	public static void main(String[] args) {
		apolice a1 = new apolice();
		a1.nome = "camilly";
		a1.idade = 19;
		a1.valorPremio = 10000;
		a1.calcularPremioApolice();
		a1.oferecerDesconto(null);
		
		a1.imprimir();
	}
}
