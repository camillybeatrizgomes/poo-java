package aula5;

import java.util.Scanner;

public class calculadora {
	int calculo1;
	int calculo2;
	int calculo3;
	int calculo4;
	
	public calculadora(int a, int s, int m, int d) {
		
		calculo1 = a;
		calculo2 = s;
		calculo3 = m;
		calculo4 = d;
	}
		
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Digite um número: ");
			int n1 = teclado.nextInt();
			System.out.println("Digite outro número: ");
			int n2 = teclado.nextInt();
			System.out.println("Digite: 1-adição, 2-subtração, 3-multiplicação, 4-divisão: ");
			int operacao = teclado.nextInt();
			
			switch(operacao) {
			case 1:
				int calculo1 = n1 + n2;
				System.out.println(calculo1);
				break;
			case 2:
				int calculo2 = n1 - n2;
				System.out.println(calculo2);
				break;
			case 3:
				int calculo3 = n1 * n2;
				System.out.println(calculo3);
				break;
			case 4:
				int calculo4 = n1 / n2;
				System.out.println(calculo4);
				break;
			}
		}
		
}
}
