package exercicio;

public class testeLivros {

	public static void main(String[] args) {
		livro livrofavorito = new livro();
		livrofavorito.setTitulo("O Pequeno Príncipe");
		livrofavorito.setQuantPaginas(98);
		livrofavorito.verificarProgresso(98,20);
		System.out.println("O livro "+livrofavorito.getTitulo()+" e possui "+livrofavorito.getQuantPaginas()+" páginas");
		System.out.println("-----------------------------------------------");
		// Livro 2
		
		livro livro2 = new livro();
		livro2.setTitulo("Harry Potter e a Pedra Filosofal");
		livro2.setQuantPaginas(250);
		livro2.verificarProgresso(250,15);
		System.out.println("O livro "+livro2.getTitulo()+" e possui "+livro2.getQuantPaginas()+" páginas");
		System.out.println("-----------------------------------------------");
		// Livro 3
		
		livro livro3 = new livro();
		livro3.setTitulo("O Senhor dos Anéis");
		livro3.setQuantPaginas(284);
		livro3.verificarProgresso(284,35);
		System.out.println("O livro "+livro3.getTitulo()+" e possui "+livro3.getQuantPaginas()+" páginas");
		System.out.println("-----------------------------------------------");
		// Livro 4
		
		livro livro4 = new livro();
		livro4.setTitulo("As Aventuras de Pinóquio");
		livro4.setQuantPaginas(177);
		livro4.verificarProgresso(177,46);
		System.out.println("O livro "+livro4.getTitulo()+" e possui "+livro4.getQuantPaginas()+" páginas");
		System.out.println("-----------------------------------------------");
		// Livro 5
		
		livro livro5 = new livro();
		livro5.setTitulo("...E o Vento Levou");
		livro5.setQuantPaginas(353);
		livro5.verificarProgresso(353,8);
		System.out.println("O livro "+livro5.getTitulo()+" e possui "+livro5.getQuantPaginas()+" páginas");
		System.out.println("-----------------------------------------------");
		// Livro 6
		
		livro livro6 = new livro();
		livro6.setTitulo("A Jovem Guarda");
		livro6.setQuantPaginas(457);
		livro6.verificarProgresso(457,11);
		System.out.println("O livro "+livro6.getTitulo()+" e possui "+livro6.getQuantPaginas()+" páginas");					
		System.out.println("-----------------------------------------------");
		// Livro 7
		
		livro livro7 = new livro();
		livro7.setTitulo("O Pequeno Príncipe");
		livro7.setQuantPaginas(98);
		livro7.verificarProgresso(98,20);
		System.out.println("O livro "+livro7.getTitulo()+" e possui "+livro7.getQuantPaginas()+" páginas");
		System.out.println("-----------------------------------------------");
		// Livro 8
		
		livro livro8 = new livro();
		livro8.setTitulo("O Poderoso Chefão");
		livro8.setQuantPaginas(208);
		livro8.verificarProgresso(208,33);
		System.out.println("O livro "+livro8.getTitulo()+" e possui "+livro8.getQuantPaginas()+" páginas");
		System.out.println("-----------------------------------------------");
		// Livro 9
		
		livro livro9 = new livro();
		livro9.setTitulo("Jogos Vorazes");
		livro9.setQuantPaginas(388);
		livro9.verificarProgresso(388,25);
		System.out.println("O livro "+livro9.getTitulo()+" e possui "+livro9.getQuantPaginas()+" páginas");
		System.out.println("-----------------------------------------------");
		// Livro 10
		
		livro livro10 = new livro();
		livro10.setTitulo("A Cabana");
		livro10.setQuantPaginas(412);
		livro10.verificarProgresso(412,10);
		System.out.println("O livro "+livro10.getTitulo()+" e possui "+livro10.getQuantPaginas()+" páginas");
		System.out.println("-----------------------------------------------");
				
	}
}
