package aula6;

public class lampadaTeste {
	public static void main(String[] args) {
		lampada l1 = new lampada("LED", 1.5f, "Branco", "Philips", 5.50f, 0.5f, true);
		l1.status();
		
		lampada l2 = new lampada("Fluorescente", 2, "Amarela", null, 7.5f, 1.5f, false);
		l2.status();
		
		if(l1.potencia > l2.potencia) {
			System.out.println("A que tem mais potência: "+l1.tipo);
		} else {
			System.out.println("A que tem mais potência: "+l2.tipo);
		} 
		
		if(l1.preco > l2.preco) {
			System.out.println("A mais cara: "+l1.tipo);
		} else {
			System.out.println("A mais cara: "+l2.tipo);
		}
	}
}
