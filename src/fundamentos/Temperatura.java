package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (�F - 32) * 5/9 = �C
		
		int F = 86;
		final int A = 32;		
		final double B = 5/9.0; 
		final double C = (F - A) * B;
		
		System.out.println("80 graus Fahrenheit, s�o "+ C +" graus Celsius.");
		
		
	}

}
