package aula09;

import java.util.ArrayList;
import java.util.Scanner;

public class escalacao {

	public static void main(String[] args) {
		time t = new time();
		ArrayList<jogador> lista = new ArrayList<jogador>();
			
		for (int i=0; i< 1; i++) {
			Scanner teclado = new Scanner(System.in);
			jogador j1 = new jogador();
			
			System.out.print("Nome do "+(i+1)+"º Jogador: ");
			j1.setNome(teclado.nextLine()); 
			
			System.out.print("Apelido: ");
			j1.setApelido(teclado.nextLine());
			
			System.out.print("Posição: ");
			j1.setPosicao(teclado.nextLine()); 
			
			System.out.print("id: ");
			j1.setId(teclado.nextInt());
			
			System.out.print("Número: ");
			j1.setNumero(teclado.nextInt());
			
			System.out.print("Qualidade: ");
			j1.setQualidade(teclado.nextInt());
						
			System.out.print("Cartão amarelo: ");
			j1.setCartaoamarelo(teclado.nextInt()); 
			
		    System.out.print("Cartão vermelho: ");
		    j1.setCartaovermelho(teclado.nextInt()); 
		    
		    lista.add(j1);
		}
		 t.setJogador(lista);
		 t.exibir();

	}

}
