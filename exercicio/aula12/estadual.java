package aula12;

import java.util.ArrayList;
import java.util.Scanner;

public class estadual extends produto{
	ArrayList<estadual> listaEstadual = new ArrayList<estadual>();

	public estadual() {
		super();
	}

	public void menu() {
		System.out.println("---------------------------------------------");
		System.out.println("   Produto   |     Valor     |    Imposto   |");
		System.out.println("---------------------------------------------");
	for(estadual p: getListaEstadual()) {
		System.out.println(p.getDescricao()+"          "+p.getValor()+"            "+p.getImposto()+"%            ");
	}
	System.out.println("---------------------------------------------");
	}

	public ArrayList<estadual> getListaEstadual() {
		return listaEstadual;
	}

	public void setListaEstadual(ArrayList<estadual> listaEstadual) {
		this.listaEstadual = listaEstadual;
	}

	public void cadastro() {
		estadual e = new estadual();
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o nome do produto \n");
		e.setDescricao(teclado.nextLine()) ;
		
		System.out.print("Digite o valor do produto \n");
		e.setValor(teclado.nextDouble()) ;
		
		System.out.print("Digite a imposto do produto \n");
		e.setImposto(teclado.nextDouble()) ;
	
		listaEstadual.add(e);
	}
	
}
