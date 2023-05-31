package Aula13;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um numero inteiro : ");
    int int1 = scan.nextInt();
    System.out.print("Digite outro numero inteiro : ");
    int int2 = scan.nextInt();
    System.out.print("Digite um numero real : ");
    double real = scan.nextDouble();

    double resultado1 = (int1*2)*(int2/2);
    double resultado2 = (int1*3)+real;
    double resultado3 = real*real*real;

    System.out.println("Resuldado a) "+resultado1);
    System.out.println("Resuldado b) "+resultado2);
    System.out.println("Resuldado c) "+resultado3);
	}

}
