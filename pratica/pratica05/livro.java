package pratica5;

public class livro implements publicacao{
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int pagAtual;
	private boolean aberto;
	private pessoa leitor;
	
	public String detalhes() {
		return "livro [titulo: " + titulo + "\n autor: " + autor + "\n totalPaginas: " + totalPaginas + "\n pagAtual: "
				+ pagAtual + "\n aberto: " + aberto + "\n leitor: " + leitor.getNome() + "\n idade do leitor: " + leitor.getIdade() +
				"\n sexo do leitor: "+ leitor.getSexo() +"]";
	}
	
	public livro(String titulo, String autor, int totalPaginas, pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int p) {
		if(p > this.totalPaginas) {
			this.pagAtual = 0;
		} else {
		this.pagAtual = p;
		}
	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
}
