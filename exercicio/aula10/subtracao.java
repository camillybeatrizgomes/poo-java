package ex002;

public class subtracao extends operacaoMatematica {
	
	public void calcular() {
		int calculo = this.getN1() - this.getN2();
		System.out.println(this.getN1() +" - " +this.getN2()+ " = " +calculo);
	}
}
