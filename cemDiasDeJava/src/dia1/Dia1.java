package dia1;

import java.util.Locale;
import java.util.Scanner;

public class Dia1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um número: ");
		
		Scanner a = new Scanner(System.in);
		int n1 = a.nextInt();
		
		
		if (n1 %2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		}
		
		a.close();
		
	}

}
