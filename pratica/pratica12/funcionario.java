package pratica12;

public class funcionario {
	private String nome;
	private String sobrenome;
	protected double horasTrabalhadas;
	protected double valorPorHora;
	
	public funcionario(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public funcionario() {
		// TODO Auto-generated constructor stub
	}

	public void nomeCompleto() {
		System.out.println(this.getNome()+" "+this.getSobrenome());
	}
	
	public void calcularSalario() {
		double calculo = this.horasTrabalhadas * this.valorPorHora;
		System.out.println(calculo);
	}
	
	public void incrementarHoras(int horas) {
		double horas1 = getValorPorHora()+horas;
		System.out.println(horas1);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

}
