package pratica1;

public class caneta {
	public String modelo;
	public String cor;
	public float ponta;
	protected int carga;
	protected boolean tampada;
	public void status() {
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Uma caneta "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Carga: "+this.carga);
		System.out.println("Está tampada? "+this.tampada);
	}

	public caneta(String m, String c, float p) {
		
			this.setModelo(m);
			this.setCor(c);
			this.setPonta(p);
			this.tampar();
		
	}

	public caneta() {
		// TODO Auto-generated constructor stub
	}

	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
}