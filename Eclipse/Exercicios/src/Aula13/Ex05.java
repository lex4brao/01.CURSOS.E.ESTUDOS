package Aula13;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite uma distancia em metros: ");
    int metro = scan.nextInt();

    int cm = metro*100;
    System.out.println("A mesma mesma distancia é "+cm+" centimetro");

	}

}