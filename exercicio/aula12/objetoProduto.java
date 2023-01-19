package aula12;

import java.util.Scanner;

public class objetoProduto {
	public static int opcao;
	static estadual e = new estadual();
	static nacional n = new nacional();
	static importado i = new importado();

	public static void main(String[] args) {
		objetoProduto();
	}

		public final static void objetoProduto() {
			menu();
		}
		
		public final static void menu() {
			System.out.println("1 - CADASTRAR PRODUTO ESTADUAL");
			System.out.println("2 - CADASTRAR PRODUTO NACIONAL");
			System.out.println("3 - CADASTRAR PRODUTO INTERNACIONAL");
			System.out.println("4 - EXIBIR PRODUTOS ESTADUAIS");
			System.out.println("5 - EXIBIR PRODUTOS NACIONAIS");
			System.out.println("6 - EXIBIR PRODUTOS INTERNACIONAIS");
			System.out.println("7 - EXIBIR TODOS OS PRODUTOS");
		
			@SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);
			System.out.print("Digite a opção desejada \n");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				e.cadastro();
				objetoProduto();
				break;
			case 2:
				n.cadastro();
				objetoProduto();
				break;
			case 3:
				i.cadastro();
				objetoProduto();
				break;
			case 4: 
				e.menu();
				objetoProduto();
				break;
			case 5: 
				n.menu();
				objetoProduto();
				break;
			case 6: 
				i.menu();
				objetoProduto();
				break;
			case 7:
				e.menu();
				n.menu();
				i.menu();
				objetoProduto();
				break;
			default:
				break;
		}
		}
}
