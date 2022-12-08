package pratica8;

public class ave extends animal{
	private String corPena;
	
	public void fazerNinho() {
		System.out.println("Contruiu um ninho");
	}

	@Override
	public void locomover() {
		System.out.println("voando...");
	}

	@Override
	public void alimentar() {
		System.out.println("comendo frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("som de ave");
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

}
