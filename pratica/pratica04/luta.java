package pratica4;

import java.util.Random;

public class luta {
	private lutador desafiado;
	private lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcaLuta(lutador l1, lutador l2) {
		if(l1.getCategoria() == l2.getCategoria()
				&& l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	public void lutar() {
		if(this.aprovada) {
			System.out.println("--- DESAFIADO ---");
			this.desafiado.apresentar();
			System.out.println("--- Desafiante ---");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vendedor = aleatorio.nextInt(3);
			System.out.println("==== RESULTADO DA LUTA ====");
			switch(vendedor) {
			case 0:
				System.out.println("Empatou!");
				this.desafiado.empataLuta();
				this.desafiante.empataLuta();
				break;
			case 1:
				System.out.println("Vitória do "+this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:
				System.out.println("Vitória do "+this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
			}
			System.out.println("===========================");
			
		} else {
			System.out.println("A luta não pode acontecer!");
		}
	}
	public lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(lutador desafiado) {
		this.desafiado = desafiado;
	}
	public lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
}
