import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("Numeros negativos:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }

        }






        sc.close();
    }
}
