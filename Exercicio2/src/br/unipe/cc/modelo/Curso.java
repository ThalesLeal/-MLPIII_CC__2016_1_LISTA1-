package br.unipe.cc.modelo;

import java.util.Set;
import java.util.TreeSet;

public class Curso{
	private Professor professor; 
	private Set<Aluno> listaDeAlunos = new TreeSet<Aluno>();
	private String nome;
	private int numeroDeIdentificacao;
	
	public Curso(Professor professor, Set<Aluno> listaDeAlunos, String nome, int numeroDeIdentificacao) {
		this.professor = professor;
		this.listaDeAlunos = listaDeAlunos;
		this.nome = nome;
		this.numeroDeIdentificacao = numeroDeIdentificacao;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Set<Aluno> getListaDeAlunos() {
		return listaDeAlunos;
	}

	public void setListaDeAlunos(Set<Aluno> listaDeAlunos) {
		this.listaDeAlunos = listaDeAlunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDeIdentificacao() {
		return numeroDeIdentificacao;
	}

	public void setNumeroDeIdentificacao(int numeroDeIdentificacao) {
		this.numeroDeIdentificacao = numeroDeIdentificacao;
	}

	@Override
	public String toString() {
		return "Curso: \n   professor=" + professor + "\n   listaDeAlunos:\n" + listaDeAlunos + ", nome=" + nome
				+ ", numeroDeIdentificacao=" + numeroDeIdentificacao + "]";
	}
	
}