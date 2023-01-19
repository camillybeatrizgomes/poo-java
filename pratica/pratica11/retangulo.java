package pratica11;

public class retangulo {
	private double lado1;
	private double lado2;
	private double area;
	private double perimetro;
	
	public retangulo(double lado1, double lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public retangulo() {
		
	}

	public void calcularArea() {
		double area = lado1 * lado2;
		System.out.println("Lado 1: "+this.getLado1()+" | Lado 2: "+this.getLado2());
		System.out.println("Resultado Área: "+area);
	}
	
	public void calcularPerimetro() {
		double perimetro = (2*lado1) + (2*lado2);
		System.out.println("Resultado do Perimêtro: "+perimetro);
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
}
