package aula6;

public class caneta {
	String marca;
	String cor;
	float tamanho;
	
	public void status() {
		System.out.println("Marca: "+this.marca);
		System.out.println("Cor: "+this.cor);
		System.out.println("Tamanho: "+this.tamanho);
	}	
	
	public caneta(String marca, String cor, float tamanho) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.tamanho = tamanho;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
}
