package pratica5;

public class objetoLivro {
	public static void main(String[] args) {
		pessoa [] p = new pessoa[2];
		livro [] l = new livro[3];
		
		p[0] = new pessoa("Camilly",19,"F");
		p[1] = new pessoa("Laís",12,"F");
		
		l[0] = new livro("Aprendendo Java","José da Silva",300,p[0]);
		l[1] = new livro("POO para Iniciantes","Pedro Paulo",500,p[1]);
		l[2] = new livro("Java Avançado","Maria Candido",800,p[0]);
		
		l[0].abrir();
		l[0].folhear(100);
		l[0].avancarPag();
		l[0].voltarPag();
		
		System.out.println(l[0].detalhes());
		
	}
}
