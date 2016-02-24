
public class TCarro {
	protected String cor;
	protected String modelo;
	protected int velocidadeAtual;
	protected int velocidadeMaxima;
	
	public TCarro(String cor, String modelo, int velocidadeMaxima,int velocidadeAtual ) {
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void ligar(){
		if (velocidadeAtual == 0){
			System.out.println("Teste do Motor");
		} else {
			System.out.println("Carro já está ligado!");
		}
	}
	
	public void acelerar(int velocidadeAcrescentada){
		
		if (velocidadeMaxima >= (velocidadeAtual + velocidadeAcrescentada)){
			velocidadeAtual += velocidadeAcrescentada;
		} else {
			System.out.println("Velocidade excedida!");
		}
	}

	@Override
	public String toString() {
		return "TCarro [cor=" + cor + ", modelo=" + modelo + ", velocidadeAtual=" + velocidadeAtual
				+ ", velocidadeMaxima=" + velocidadeMaxima + "]";
	}
	
	

}