package aula12;

import java.util.ArrayList;
import java.util.Scanner;

public class nacional extends produto{
	private double taxa;
	ArrayList<nacional> listaNacional = new ArrayList<nacional>();
	
	public nacional() {
		super();
	}
	
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public void menu() {
		System.out.println("---------------------------------------------");
		System.out.println("   Produto   |     Valor     |    Imposto   |");
		System.out.println("---------------------------------------------");
	for(nacional p: getListaNacional()) {
		System.out.println(p.getDescricao()+"          "+p.getValor()+"            "+p.getImposto()+"%            ");
	}
		System.out.println("---------------------------------------------");
	}

	public void cadastro() {
		nacional n = new nacional();
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o nome do produto \n");
		n.setDescricao(teclado.nextLine()) ;
		
		System.out.print("Digite o valor do produto \n");
		n.setValor(teclado.nextDouble()) ;
		
		System.out.print("Digite a imposto do produto \n");
		n.setImposto(teclado.nextDouble()) ;
		
		System.out.print("Digite a taxa do produto \n");
		n.setTaxa(teclado.nextDouble()) ;
		
		listaNacional.add(n);
	}

	public ArrayList<nacional> getListaNacional() {
		return listaNacional;
	}

	public void setListaNacional(ArrayList<nacional> listaNacional) {
		this.listaNacional = listaNacional;
	}

}
