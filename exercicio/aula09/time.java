package aula09;

import java.util.ArrayList;

public class time {
	ArrayList<jogador> jogador;

	public ArrayList<jogador> getJogador() {
		return jogador;
	}

	public void setJogador(ArrayList<jogador> jogador) {
		this.jogador = jogador;
	}

	public void exibir() {
		for(jogador j : jogador) {
			System.out.println("\n Nome: "+j.getNome()+", Número: "+j.getNumero()+", Posição: "+j.getPosicao());
			if(j.getCartaoamarelo() >= 2 || j.getCartaovermelho() >=1) {
				System.out.print("Suspenso da Partida");
			} else {
				System.out.print("Vai pro jogo");
				
			}
		}
	}
}
