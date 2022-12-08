package aula6;

public class lampada {
	String tipo;
	float voltagem;
	String cor;
	String marca;
	float preco;
	float potencia;
	Boolean status;
	
	public void status() {
		System.out.println("Tipo: "+this.tipo);
		System.out.println("Voltagem: "+this.voltagem);
		System.out.println("Cor: "+this.cor);
		System.out.println("Marca: "+this.marca);
		System.out.println("Preço: "+this.preco);
		System.out.println("Potência: "+this.potencia);
		System.out.println("Status: "+this.status);
	}
	
	public String toString() {
	return "tipo:"+ this.getTipo()+"Voltagem: "+this.getVoltagem()+"Cor: "+this.getCor()+"Marca: "+this.getMarca()+"Preço: "+this.getPreco()+"Potência: "+this.getPotencia()+"Status: "+this.getStatus();
	}
		
	
	public lampada(String t, float v, String c, String m, float r, float p, Boolean s) {
		super();
		this.tipo = t;
		this.voltagem = v;
		this.cor = c;
		this.marca = m;
		this.preco = r;
		this.potencia = p;
		this.status = s;
	}
	
	public void escolha(String t) {
		if(t == "LED") {
			this.getTipo();
		} else if (t == "Fluorescente") {
			this.getTipo();
		}
	}

	public void acender() {
		this.setStatus(true);
	}
	
	public void apagar() {
		this.setStatus(false);
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(float voltagem) {
		this.voltagem = voltagem;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
}
