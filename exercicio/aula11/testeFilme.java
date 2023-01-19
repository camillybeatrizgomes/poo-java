package exercicio;

public class testeFilme {

	public static void main(String[] args) {
		filme filme1 = new filme();
		filme1.setTitulo("Os Vingadores");
		filme1.setDuracaoEmMinutos(142);
		filme1.exibirDuracaoEmHoras();
		// Filme 2
		filme filme2 = new filme();
		filme2.setTitulo("Hotel Transilvânia");
		filme2.setDuracaoEmMinutos(93);
		filme2.exibirDuracaoEmHoras();
		
	System.out.println("Os filmes em cartaz são "+filme1.getTitulo()+" e "+filme2.getTitulo());
	System.out.println("-----------------------------------------------------------");
		// Filme 3
		filme filme3 = new filme();
		filme3.setTitulo("Rei Leão");
		filme3.setDuracaoEmMinutos(105);
		filme3.exibirDuracaoEmHoras();
	
		// Filme 4
		filme filme4 = new filme();
		filme4.setTitulo("Toy Story");
		filme4.setDuracaoEmMinutos(112);
		filme4.exibirDuracaoEmHoras();
		
		// Filme 5
		filme filme5 = new filme();
		filme5.setTitulo("Shrek");
		filme5.setDuracaoEmMinutos(126);
		filme5.exibirDuracaoEmHoras();
		
		System.out.println("Os filmes em cartaz são "+filme3.getTitulo()+", "+filme4.getTitulo()+" e "+filme5.getTitulo());
	}	

}
