import java.util.Scanner;
public class FaturaMain {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Digita o n�mero do produto: ");
		String number = sca.nextLine();
		System.out.println("Digita a descri��o do produto: ");
		String desc = sca.nextLine();
		System.out.println("Quantidade do produto do pedido:");
		int quant = sca.nextInt();
		System.out.println("Valor por um item");
		double valor = sca.nextDouble();
		Fatura inv = new Fatura( quant, valor);
		inv.setNum(number);
		inv.setDesc(desc);
		System.out.println("N�mero: "+inv.getNum()+
							"\nDescri��o: "+inv.getDescricao()+
							"\nQuantidade: "+inv.getQuant()+
							"\nValor: "+inv.getPreco());
		System.out.println();
		System.out.println("O Valor total � "+inv.GetInvoiceAmount());
	}
}