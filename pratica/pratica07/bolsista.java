package pratica7;

public class bolsista extends aluno{
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de "+this.nome);
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsista! Pagamento Facilitado");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
}
