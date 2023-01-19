package ex002;

public class objetoOperacao {

	public static void main(String[] args) {
		soma s = new soma();
		s.setN1(2);
		s.setN2(2);
		s.calcular();
		
		subtracao b = new subtracao();
		b.setN1(8);
		b.setN2(4);
		b.calcular();
		
		multiplicacao m = new multiplicacao();
		m.setN1(5);
		m.setN2(5);
		m.calcular();
		
		divisao d = new divisao();
		d.setN1(10);
		d.setN2(2);
		d.calcular();
	}

}
