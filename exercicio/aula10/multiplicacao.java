package ex002;

public class multiplicacao extends operacaoMatematica {

	public void calcular() {
		int calculo = this.getN1() * this.getN2();
		System.out.println(this.getN1() +" x " +this.getN2()+ " = " +calculo);
	}

	
}
