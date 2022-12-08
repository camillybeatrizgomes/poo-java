package pratica6;

public class objetoPessoas {
	public static void main(String[] args) {
		pessoa p1 = new pessoa();
		aluno p2 = new aluno();
		professor p3 = new professor();
		funcionario p4 = new funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");
		
		p1.setSexo("M");
		p2.setSexo("F");
		p2.setIdade(18);
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		//p3.receberAumento(550.20f);
		//p4.mudarTrabalho();
		//p2.cancelarMAtricula();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}
}
