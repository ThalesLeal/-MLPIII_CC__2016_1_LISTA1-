public class VeiculoDePasseio extends Veiculo{
	private boolean possuiAr;
	private int quantidadePortas;
	
	public VeiculoDePasseio(){}

	public boolean isPossuiAr() {
		return possuiAr;
	}

	public void setPossuiAr(boolean possuiAr) {
		this.possuiAr = possuiAr;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	@Override
	public String toString() {
		return "VeiculoDePasseio [" + super.toString() + ", possuiAr=" + possuiAr + ", quantidadePortas=" + quantidadePortas + "]";
	}
	
}