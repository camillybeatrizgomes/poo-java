package aula08;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<String> cliente = new ArrayList<String>();

		cliente.add("Camilly"); 
		cliente.add("Viviane");
		//cliente.clear();
		
		System.out.println(cliente.indexOf("Viviane"));
	}

}
