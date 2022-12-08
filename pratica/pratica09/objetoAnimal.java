package pratica9;

public class objetoAnimal {

	public static void main(String[] args) {
		lobo l = new lobo();
		cachorro c = new cachorro();
		
		l.emitirSom();
		c.emitirSom();
		
		c.reagir("Olá"); // frase
		c.reagir("Vai apanhar");
		c.reagir(11,45); // hora e minuto
		c.reagir(21,00);
		c.reagir(true); // dono
		c.reagir(false);
		c.reagir(2,12.5f); // peso e idade
		c.reagir(17,4.5f);
	}

}
