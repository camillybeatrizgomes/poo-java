package pratica4;

public class lutador {
	// Atributos
	
		private String nome;
		private String nacionalidade;
		private int idade;
		private float altura;
		private float peso;
		private String categoria;
		private int vitoria, derrota, empate;
		
		// Métodos Públicos
		
		public void apresentar() {
			System.out.println("CHEGOU A HORA! Apresentamos o lutador "+this.getNome());
			System.out.println("Diretamente de "+this.getNacionalidade());
			System.out.println("Com "+this.getIdade()+" anos de idade");
			System.out.println("E com "+this.getAltura()+" de altura");
			System.out.println("Pesando "+this.getPeso()+" Kg");
			System.out.println(this.getVitoria()+" vitórias");
			System.out.println(this.getDerrota()+" derrotas");
			System.out.println(this.getEmpate()+" empates");
		}
		public void status() {
			System.out.println(this.getNome()+" é um peso "+this.getCategoria());
			System.out.println("Ganhou "+this.getVitoria()+" vezes");
			System.out.println("Perdeu "+this.getDerrota()+" vezes");
			System.out.println("Empatou "+this.getEmpate()+" vezes");
		}
		public void ganharLuta() {
			this.setVitoria(this.getVitoria() + 1);
			// this.vitoria = this.vitoria + 1
		}
		public void perderLuta() {
			this.setDerrota(this.getDerrota() + 1);
		}
		public void empataLuta() {
			this.setEmpate(this.getEmpate() + 1);
		}
		// Métodos Especiais
		
		public lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrota,
				int empate) {
			super();
			this.nome = nome;
			this.nacionalidade = nacionalidade;
			this.idade = idade;
			this.altura = altura;
			this.setPeso(peso);
			this.vitoria = vitoria;
			this.derrota = derrota;
			this.empate = empate;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public float getAltura() {
			return altura;
		}
		public void setAltura(float altura) {
			this.altura = altura;
		}
		public float getPeso() {
			return peso;
		}
		public void setPeso(float peso) {
			this.peso = peso;
			this.setCategoria();	}
		public String getCategoria() {
			return categoria;
		}
		private void setCategoria() {
			if(this.peso < 52.2) {
				this.categoria = "Inválido";
			} else if(this.peso <= 70.3) {
				this.categoria = "Leve";
			} else if(this.peso <= 83.9) {
				this.categoria = "Médio";
			} else if(this.peso <= 120.2) {
				this.categoria = "Pesado";
			} else {
				this.categoria = "Inválido";
			}
		}
		public int getVitoria() {
			return vitoria;
		}
		public void setVitoria(int vitoria) {
			this.vitoria = vitoria;
		}
		public int getDerrota() {
			return derrota;
		}
		public void setDerrota(int derrota) {
			this.derrota = derrota;
		}
		public int getEmpate() {
			return empate;
		}
		public void setEmpate(int empate) {
			this.empate = empate;
		}
}
