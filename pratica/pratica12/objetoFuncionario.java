package pratica12;

public class objetoFuncionario {

	public static void main(String[] args) {
		funcionario f = new funcionario(); 
		f.setNome("Luis");
		f.setSobrenome("Silva");
		f.setHorasTrabalhadas(10);
		f.setValorPorHora(25.50);
		f.nomeCompleto();
		f.calcularSalario();
		f.incrementarHoras(2);
	}

}
