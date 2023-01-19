package exercicio;

public class filme {
	private String titulo;
	private int DuracaoEmMinutos;
	
	public filme(String titulo, int duracaoEmMinutos) {
		super();
		this.titulo = titulo;
		DuracaoEmMinutos = duracaoEmMinutos;
	}
	
	public filme() {
		
	}

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getDuracaoEmMinutos() {
		return DuracaoEmMinutos;
	}


	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		DuracaoEmMinutos = duracaoEmMinutos;
	}


	public void exibirDuracaoEmHoras() {
		int minutos = this.DuracaoEmMinutos;
		int horas = minutos/60;
		int resto = minutos % 60;
		
		System.out.println("O filme "+getTitulo()+" possui "+horas+" horas "+resto+" minutos de duração");
	}
}
