package Aula13;

public class OperadoresLogico {

	public static void main(String[] args) {
		
		boolean valor1 = true;
		boolean valor2 = false;
		
		boolean resultado = valor1&valor2;
		System.out.println(resultado);
		
		resultado = valor1|valor2;
		System.out.println(resultado);

		resultado = valor1^valor2;
		System.out.println(resultado);
	
	
		resultado = valor1&&valor2;
		System.out.println(resultado);
		
		resultado = valor1||valor2;
		System.out.println(resultado);
		
		resultado = !valor1;
		System.out.println(resultado);
		
		
	}

}
