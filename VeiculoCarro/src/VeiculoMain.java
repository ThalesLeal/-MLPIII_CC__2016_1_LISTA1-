public class VeiculoMain {
	public static void main(String[] args) {
		VeiculoDeCarga veiculo1 = new VeiculoDeCarga();
		VeiculoDePasseio veiculo2 = new VeiculoDePasseio();
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("Thales Leal");
		pessoa1.setCpf(111111);
		
		veiculo1.setAno(2017);
		veiculo1.setCapacidadeCarga(5000);
		veiculo1.setKmInicial(0);
		veiculo1.setKmFinal(1000);
		veiculo1.setChassi("abcdfga1234567");
		veiculo1.setMarca("Fiat");
		veiculo1.setPlaca("Ogg1023");
		veiculo1.setModelo("Uno");
		veiculo1.setValorKmRodado(100);
		veiculo1.setProprietario(pessoa1);
		veiculo1.calcularValorLocacao();
		
		System.out.println(veiculo1);
		System.out.println(veiculo2);
	}
}