public class VeiculoDeCarga extends Veiculo{
	private double capacidadeCarga;
	
	public VeiculoDeCarga(){}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	@Override
	public String toString() {
		return "VeiculoDeCarga [" + super.toString() + ", capacidadeCarga=" + capacidadeCarga + "]";
	}

}