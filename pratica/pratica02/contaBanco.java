package pratica2;

public class contaBanco {
	// Atributos
		public int numConta;
		protected String tipo;
		private String dono;
		private float saldo;
		private boolean status;
		
		public void estadoAtual() {
			System.out.println("Conta: "+this.getNumConta());
			System.out.println("Dono: "+this.getDono());
			System.out.println("Tipo: "+this.getTipo());
			System.out.println("Saldo: "+this.getSaldo());
			System.out.println("Status: "+this.getStatus());
		}

	public contaBanco (int c, String t, String n, float s, boolean u) {
		
		numConta = c;
		tipo = t;
		dono = n;
		saldo = s;
		status = u;
	}
	public contaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	// Métodos Personalizados 
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if(t == "CC") {
			this.saldo = 50;
		} else if (t == "CP") {
			this.saldo = 150;
		}
		System.out.println("Conta aberta com sucesso!");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro!");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta em débito!");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(float v) {
		if(this.getStatus()) {
			// this.saldo = this.saldo + v;
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado na conta de "+this.getDono());
	} else {
		System.out.println("Impossível depositar!");
		}
	}

	public void sacar(float v) {
		if(this.getStatus() && this.getSaldo() >= v) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Saque realizado na conta de "+ this.getDono());
		} else if (saldo < v){
			System.out.println("Saldo insuficiente!");
		} else {
			System.out.println("Impossível Sacar!");
		}
	}

	public void pagarMensal(float v) {
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus() && saldo > v) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
		} else if (saldo < v) {
			System.out.println("Saldo insuficiente!");
		} else {
			System.out.println("Impossível pagar!");
		}
	}
	// Métodos Especiais 
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}