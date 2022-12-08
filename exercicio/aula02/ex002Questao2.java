package aula2;

import java.util.Scanner;

public class ex002Questao2 {
	public static void main(String[] args) {
	try (Scanner teclado = new Scanner(System.in)) {
		System.out.print("digite um numero: \n");
		System.out.print("digite um numero: \n");
		System.out.print("digite um numero: \n");
		int numero1 = teclado.nextInt();
		int numero2 = teclado.nextInt();
		int numero3 = teclado.nextInt();
		int numeros = (numero1 + numero2 + numero3);
		int media = numeros/2;
		System.out.println("A 1 média entre os números: "+(media));
		
		System.out.print("digite um numero: \n");
		System.out.print("digite um numero: \n");
		System.out.print("digite um numero: \n");
		int numero4 = teclado.nextInt();
		int numero5 = teclado.nextInt();
		int numero6 = teclado.nextInt();
		int numeros2 = (numero4 + numero5 + numero6);
		int media2 = numeros2/2;
		int medias = media/media2;
		System.out.println("A 2 média entre os números: "+(media2));
		System.out.println("A média das médias: "+(medias));
	}
}
}
