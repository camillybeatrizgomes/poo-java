package aula7;

public class escolaTeste {
	public static void main(String[] args) {
		aluno a1 = new aluno();
		a1.setNome("Camilly");
		a1.setCpf(71278823476l);
		a1.setIdade(18);
		
		professor p1 = new professor();
		p1.setNome("Pedro");
		p1.setCpf(11122233344l);
		p1.setIdade(38);
		
		a1.status();
		p1.status();
	}
}
