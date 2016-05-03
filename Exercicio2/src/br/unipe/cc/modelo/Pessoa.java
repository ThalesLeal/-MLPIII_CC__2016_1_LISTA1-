package br.unipe.cc.modelo;

public class Pessoa{
	protected int matricula;
	protected String nome;

	public Pessoa(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public int getMetricula() {
		return matricula;
	}

	public void setMetricula(int metricula) {
		this.matricula = metricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Metricula = " + matricula + ", Nome = " + nome;
	}

	public boolean equals(Aluno pessoa) {
		if((pessoa.matricula == this.matricula) || pessoa.nome == this.nome)
			return true;
		else 
			return false;
	}

}