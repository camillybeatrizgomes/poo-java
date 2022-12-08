package pratica2;

public class conta {
	
	public static void main(String[] args) {
		contaBanco p1 = new contaBanco();
		p1.setNumConta(7745);
		p1.setDono("Camilly");
		p1.abrirConta("CC");
		p1.depositar(100);
		p1.sacar(150);
		p1.fecharConta();
		
		contaBanco p2 = new contaBanco();
		p2.setNumConta(4414);
		p2.setDono("Viviane");
		p2.abrirConta("CP");
		p2.depositar(500);
		p2.sacar(100);
		
		p1.estadoAtual();
		p2.estadoAtual();

	}
}
