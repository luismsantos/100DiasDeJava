import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros você vai digitar?");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero:");
            vetor[i] = sc.nextDouble();
        }

        System.out.print("VALORES:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }


        System.out.print("SOMA:");
        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println(soma);


        System.out.print("MEDIA:");
        double media = 0.0;
        double result = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            media += vetor[i];
            result = media / vetor.length;
        }

        System.out.println(result);
        sc.close();
    }
}
