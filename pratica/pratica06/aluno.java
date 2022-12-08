package pratica6;

public class aluno extends pessoa{
	private int matricula;
	private String curso;
	
	public void cancelarMAtricula() {
		System.out.println("Matrícula será cancelada");
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
