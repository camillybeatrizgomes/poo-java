package pratica8;

public class peixe extends animal{
	private String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}

	@Override
	public void locomover() {
		System.out.println("nadando...");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}
}
