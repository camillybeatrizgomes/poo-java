package aula2;

import java.util.Scanner;

public class ex002Questao3 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.print("digite um numero: \n");
			System.out.print("digite um numero: \n");
			System.out.print("digite um numero: \n");
			System.out.print("digite um numero: \n");
			System.out.print("digite um numero: \n");
			int numero1 = teclado.nextInt();
			int numero2 = teclado.nextInt();
			int numero3 = teclado.nextInt();
			int numero4 = teclado.nextInt();
			int numero5 = teclado.nextInt();
			
			System.out.println("O sucessor de "+numero1+ " é "+(++numero1)+" e o antecessor é "+(numero1-2));
			System.out.println("O sucessor de "+numero2+ " é "+(++numero2)+" e o antecessor é "+(numero2-2));
			System.out.println("O sucessor de "+numero3+ " é "+(++numero3)+" e o antecessor é "+(numero3-2));
			System.out.println("O sucessor de "+numero4+ " é "+(++numero4)+" e o antecessor é "+(numero4-2));
			System.out.print("O sucessor de "+numero5+ " é "+(++numero5)+" e o antecessor é "+(numero5-2));
		}
	}
}
