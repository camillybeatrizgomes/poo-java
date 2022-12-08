package pratica7;

public class objetoPessoa {
	public static void main(String[] args) {
		// pessoa p1 = new pessoa(); ERRO -> Classe abstrata
		/**visitante v1 = new visitante();
		v1.setNome("Camilly");
		v1.setIdade(19);
		v1.setSexo("F");;
		System.out.println(v1.toString());
		*/
		
		aluno a1 = new aluno();
		a1.setNome("Laís");
		a1.setMatricula(1100);
		a1.setCurso("Informática");
		a1.setIdade(17);
		a1.setSexo("F");
		a1.pagarMensalidade();
		
		bolsista b1 = new bolsista();
		b1.setMatricula(7799);
		b1.setNome("Viviane");
		b1.setBolsa(12.5f);
		b1.setSexo("F");
		b1.pagarMensalidade();
	
	}
}
