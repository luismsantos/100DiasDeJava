package dia4;

public class Calcular {
	public static final double TAXA =  0.10;
	
	public static double calcPreco(double precoBarril, double qtdBarril) {
		return precoBarril * qtdBarril * (1.00 + TAXA);
	}
	
}
