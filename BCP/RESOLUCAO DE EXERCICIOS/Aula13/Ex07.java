package Aula13;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o valor da lado do quadrado: ");
    int base = scan.nextInt();

    double area = Math.pow(base, 2	);
    System.out.println("A área do quadrado é "+area);
     
    area = area*2;
    System.out.println("O dobro da área é "+area);


	}

}
