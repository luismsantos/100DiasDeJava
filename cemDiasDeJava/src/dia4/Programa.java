package dia4;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o atual preço do barril: ");
		double barril = sc.nextDouble();
		System.out.println("Digite a quantidade de barris: ");
		double qtd = sc.nextDouble();
		
		double result = Calcular.calcPreco(barril, qtd);
		System.out.printf("Valor à pagar: %.2f", result);
	}

}
