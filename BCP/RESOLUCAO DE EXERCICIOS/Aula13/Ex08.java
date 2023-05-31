package Aula13;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quanto você ganhar por hora?: ");
    double valor = scan.nextDouble();
    
    System.out.print("Quantas você horas você trabalhou?: ");
    double horas = scan.nextDouble();

    double salario = valor*horas;

    System.out.println("\nVocê irá receber R$"+salario);

	}

}
