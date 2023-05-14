package calculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class valoresiguais {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Integer> x = new ArrayList<Integer>();

		List<Integer> y = new ArrayList<Integer>();

		Integer Preço = null;

		boolean sair = false;

		while (sair != true) {

			System.err.print("Digite um numero : ");
			int PreçoX = scanner.nextInt();
			x.add(PreçoX);

			System.out.println();

			System.out.print("Digite outro numero: ");
			int PreçoY = scanner.nextInt();
			y.add(PreçoY);

			for (Integer unidadeX : x) {
				for (Integer unidadeY : y) {
					if (unidadeX == unidadeY) {
						Preço = unidadeX;

						System.out.println("igual");
						System.out.println(x);
						System.out.println(y);

						// x.clear();
						// y.clear();

						break;

					}
				}
			}
			if (Preço != null) {
				break;
			}

			scanner.close();
		}
	}
}
