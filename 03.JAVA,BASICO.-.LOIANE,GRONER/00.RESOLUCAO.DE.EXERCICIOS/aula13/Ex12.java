package aula13;

import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double alt, peso;
        System.out.println("Descobrindo o peso ideal");
        System.out.printf("Digite sua altura em metros: ");
        alt = sc.nextDouble();
        peso = ((72.7*alt)-58);
        System.out.printf("Seu peso ideal é %.2fkg",peso);
    }
}
