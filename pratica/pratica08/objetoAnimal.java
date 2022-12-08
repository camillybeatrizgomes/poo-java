package pratica8;

public class objetoAnimal {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		mamifero m = new mamifero();
		reptil r = new reptil();
		peixe p = new peixe();
		ave a = new ave();
		
		cachorro c1 = new cachorro();
		canguru u1 = new canguru();
		cobra b1 = new cobra();
		tartaruga t1 = new tartaruga();
		goldFish g1 = new goldFish();
		arara a1 = new arara();
		
		//Polimorfismo
		
		m.locomover();
		r.locomover();
		p.locomover();
		a.locomover();
		
		c1.emitirSom();
		u1.emitirSom();
		c1.locomover();
		u1.locomover();
	}

}
