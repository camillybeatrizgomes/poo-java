package pratica7;

public class tecnico extends aluno{
	private int registroProfissional;
	
	public void pratica() {
		System.out.println("Praticando...");
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
}
