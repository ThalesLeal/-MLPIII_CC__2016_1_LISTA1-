package br.unipe.cc.modelo;

public class Aluno extends Pessoa implements Comparable<Aluno> {
	private double media;
	private int faltas;

	public Aluno(int matricula, String nome, double media, int faltas) {
		super(matricula, nome);
		this.media = media;
		this.faltas = faltas;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	public int getFaltas(){
		return faltas;
	}
	
	public void setFaltas(int faltas){
		this.faltas = faltas;
	}

	@Override
	public String toString() {
		return "Aluno [pessoa=" + super.toString() + "media=" + media + "]\n";
	}

	@Override
	public int compareTo(Aluno aluno){
		return this.nome.compareTo(aluno.nome);
	}
}