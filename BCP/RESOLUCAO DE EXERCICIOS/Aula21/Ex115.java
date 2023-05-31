package Aula21;

import java.util.*;

public class Ex115 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um caracter");
		String letra = scan.next();
		System.out.println("");
		System.out.println((letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) ? "É uma vogal" : "É um consoante");

	}
}
