package dia3;

import java.util.Locale;
import java.util.Scanner;

public class dia3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Digita o nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.println("Digite a nota do primeiro trimestre: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Digite a nota do segundo trimestre: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Digite a nota do terceiro trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Final grade: %.2f", aluno.calcNota());
		System.out.println();
		System.out.println(aluno);
		
		sc.close();
	}


}
	
	




	


