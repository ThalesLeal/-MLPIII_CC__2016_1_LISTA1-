import java.util.Scanner;

public class Carro {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String cor;
		String modelo;
		int velocidadeAtual = 0;
		int velocidadeMaxima;
		int velocidadeAcrescentada;
		int aumentarVelocidade;
		
		System.out.print("digite a cor do carro: ");
		cor = scan.next();
		System.out.print("digite o modelo do carro: ");
		modelo = scan.next();
		System.out.print("digite a velocidade máxima do carro: ");
		velocidadeMaxima = scan.nextInt();
		
		TCarro carrotest = new TCarro(cor, modelo, velocidadeMaxima, velocidadeAtual);
		
		carrotest.ligar();
		
			System.out.print("Digite a velocidade a se acrescentar: ");	
			aumentarVelocidade = scan.nextInt();
			
			carrotest.acelerar(aumentarVelocidade);
			System.out.println(carrotest);		
			
		}


	
		
}