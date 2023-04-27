package Aula13;


import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Qual a temperatura em farenheit?: ");
    double f = scan.nextDouble();

    double c = (5*(f-32))/9;

    System.out.println("\n\nA temperatura em Celsius é"+c+"°C");
  
	}

}
