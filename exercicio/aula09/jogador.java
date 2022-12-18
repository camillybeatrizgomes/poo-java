package aula09;

public class jogador {
	private int id;
	private String nome;
	private String apelido;
	private int numero;
	private String posicao;
	private int qualidade;
	private int cartaoamarelo;
	private int cartaovermelho;
	
	public jogador() {
		super();
	}

	public jogador(int id, String nome, String apelido, int numero, String posicao, int qualidade, int cartaoamarelo,
			int cartaovermelho) {
		super();
		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
		this.numero = numero;
		this.posicao = posicao;
		this.qualidade = qualidade;
		this.cartaoamarelo = cartaoamarelo;
		this.cartaovermelho = cartaovermelho;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}

	public int getCartaoamarelo() {
		return cartaoamarelo;
	}

	public void setCartaoamarelo(int cartaoamarelo) {
		this.cartaoamarelo = cartaoamarelo;
	}

	public int getCartaovermelho() {
		return cartaovermelho;
	}

	public void setCartaovermelho(int cartaovermelho) {
		this.cartaovermelho = cartaovermelho;
	}

}
