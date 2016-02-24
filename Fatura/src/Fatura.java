public class Fatura {
	String num;
	String desc;
	int quant;
	double preco;
	public Fatura(int iniciaQuant,double valor){
		if( iniciaQuant > 0){
			quant = iniciaQuant;
		} else {
			quant = 0;
		}
		if(valor > 0.0){
			preco  = valor;
		} else {
			preco = 0.0;
		}
	}
	public void setQuant(int quantid){
		quant = quantid;
	}
	public void setNum(String numero){
		num = numero;
	}
	public void setDesc(String descricao){
		desc = descricao;
	}
	public void setPreco(Double valor){
		preco = valor;
	}
	public int getQuant(){
		return quant;
	}
	public String getNum(){
		return num;
	}
	public String getDescricao(){
		return desc;
	}
	public double getPreco(){
		return preco;
	}
	public double GetInvoiceAmount(){
		double total = quant * preco;
		return total;
	}
}