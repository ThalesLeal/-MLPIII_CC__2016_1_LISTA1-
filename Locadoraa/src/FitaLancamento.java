public class FitaLancamento extends Fita{
	
	@Override
	public void setPreco(double preco) {
		super.setPreco(preco + ((preco*20)/100));
	}

}