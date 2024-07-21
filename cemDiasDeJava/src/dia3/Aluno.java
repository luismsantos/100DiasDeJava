package dia3;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double calcNota() {
		return nota1 + nota2 + nota3;
	}
	
	
	public boolean verificarNota() {
		if (calcNota() >= 60) {
			return true;
		} else {
			return false;
		}
	}

	
	public String toString() {
		if (verificarNota() == true) {
			return "APROVADO";
		} else {
			double resto;
			resto = 60 - calcNota();
			return "REPROVADO"
					+ "Faltou: "
					+ resto;
				}
		}
	
}
