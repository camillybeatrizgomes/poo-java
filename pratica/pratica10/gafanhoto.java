package pratica10;

public class gafanhoto extends pessoa{
	private String login;
	private int totalAssistido;
	
	public gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totalAssistido = 0;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotalAssistido() {
		return totalAssistido;
	}
	public void setTotalAssistido(int totalAssistido) {
		this.totalAssistido = totalAssistido;
	}

	@Override
	public String toString() {
		return "gafanhoto ["+ super.toString()  + "\n login=" + login + ", totalAssistido=" + totalAssistido + "]";
	}
	
}
