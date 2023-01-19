package exercicio;

public class livro {
	private String titulo;
	private int quantPaginas;
	private int paginasLidas;
	
	public livro(String titulo, int quantPaginas) {
		this.titulo = titulo;
		this.quantPaginas = quantPaginas;
	}
	
	public livro() {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getQuantPaginas() {
		return quantPaginas;
	}

	public void setQuantPaginas(int quantPaginas) {
		this.quantPaginas = quantPaginas;
	}

	public int getPaginasLidas() {
		return paginasLidas;
	}

	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}

	public void verificarProgresso(int quantPaginas, int paginasLidas) {
		int porcentagem = paginasLidas * 100/quantPaginas;
		
		System.out.println("Você já leu "+porcentagem+"% do livro");
	}
}
