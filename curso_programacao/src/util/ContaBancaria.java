package util;

public class ContaBancaria {
	
	String nome;
	String sobrenome;
	private int conta;
	private double saldo;
		
	public ContaBancaria(String nome, String sobrenome, int conta) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.conta = conta;
	}

	public ContaBancaria(String nome, String sobrenome, int conta, double saldo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.conta = conta;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSaldo() {
		return saldo;
	}

	public double getConta() {
		return conta;
	}

	public void depositaDinheiro(double saldo) {
		this.saldo += saldo;
	}
	
	public void sacaDinheiro(double saldo) {
		this.saldo -= saldo + 5;
	}
	
	
	public String toString() {
		return "Conta: "
		+ conta
		+ ", Titular: "
		+ nome 
		+ sobrenome
		+ ", Saldo: $ "
		+ saldo;
		}
	
	
}