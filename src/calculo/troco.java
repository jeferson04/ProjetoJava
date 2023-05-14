package calculo;

import java.util.Scanner;

public class troco {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor recebido:  ");
		double PreçoRecebido = scanner.nextDouble();

		System.out.print("Digite o valor do produto: ");
		double PreçoProduto = scanner.nextDouble();

		double troco = PreçoRecebido - PreçoProduto;
		System.out.println("Troco no valor de: " + troco);

		scanner.close();

	}
}
