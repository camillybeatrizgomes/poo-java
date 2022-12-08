package aula1;

import java.util.Scanner;

public class ex001 {
	
	public static void main(String[] args) {
		try (var teclado = new Scanner(System.in)) {
			System.out.print("digite seu nome: \n");
			String nome = teclado.nextLine();
			System.out.print("digite sua idade: \n");
			int idade = teclado.nextInt();
			System.out.print(nome + " tem "+ (idade*2) + " anos");
		}

	}
}
