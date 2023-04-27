package Aula13;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Qual a temperatura em Celsius?: ");
    double c = scan.nextDouble();

    double f = (1.8*c)+32;

    System.out.println("\n\nA temperatura em Farenheit é "+f+"°F");
  
	}

}
