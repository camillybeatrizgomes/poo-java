package aula4;

public class livro {
	String titulo;
	String autor;
	int ano;
	
	public livro(String t, String a, int i) {
		this.setTitulo(t);
		this.setAutor(a);
		this.setAno(i);
	}

public void status() {
	System.out.println("Título: "+this.titulo);
	System.out.println("Autor: "+this.autor);
	System.out.println("Ano: "+this.ano);
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

public int getAno() {
	return ano;
}

public void setAno(int ano) {
	this.ano = ano;
}

}
