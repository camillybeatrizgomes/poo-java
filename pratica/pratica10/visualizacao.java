package pratica10;

public class visualizacao {
	private gafanhoto espectador;
	private video filme;
	
	public visualizacao(gafanhoto espectador, video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotalAssistido(this.espectador.getTotalAssistido()+1);
		this.filme.setViews(this.filme.getViews()+1);
	}

	public gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(gafanhoto espectador) {
		this.espectador = espectador;
	}

	public video getFilme() {
		return filme;
	}

	public void setFilme(video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}

	public void avaliar(float porc) {
		int tot = 0;
		if(porc <= 20) {
			tot = 3;
		} else if(porc <= 50) {
			tot = 5;
		} else if(porc <= 90) {
			tot = 8;
		} else {
			tot = 10;
		}
		this.filme.setAvaliacao(tot);
		
	}

	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
}
