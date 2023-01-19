package aula12;

import java.util.ArrayList;
import java.util.Scanner;

public class importado extends produto{
	private double taxa ;
	private double taxaImportacao;
	ArrayList<importado> listaImportado = new ArrayList<importado>();
	
	public importado() {
		super();
	}
	
	public void menu() {
		System.out.println("---------------------------------------------");
		System.out.println("   Produto   |     Valor     |    Imposto   |");
		System.out.println("---------------------------------------------");
	for(importado p: getListaImportado()) {
		System.out.println(p.getDescricao()+"          "+p.getValor()+"            "+p.getImposto()+"%            ");
	}
		System.out.println("---------------------------------------------");
	}
	
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public double getTaxaImportacao() {
		return taxaImportacao;
	}
	public void setTaxaImportacao(double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	public ArrayList<importado> getListaImportado() {
		return listaImportado;
	}
	public void setListaImportado(ArrayList<importado> listaImportado) {
		this.listaImportado = listaImportado;
	}

	public void cadastro() {
		importado i = new importado();
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o nome do produto \n");
		i.setDescricao(teclado.nextLine()) ;
		
		System.out.print("Digite o valor do produto \n");
		i.setValor(teclado.nextDouble()) ;
		
		System.out.print("Digite a imposto do produto \n");
		i.setImposto(teclado.nextDouble()) ;
		
		System.out.print("Digite a taxa do produto \n");
		i.setTaxa(teclado.nextDouble()) ;
		
		listaImportado.add(i);
	}






}
