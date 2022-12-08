package pratica9;

public class mamifero extends animal{
	protected String corPelo;

	@Override // <-  Polimorfismo de Sobreposição 
	public void emitirSom() {
		System.out.println("Som de Mamífero");
	}
}
