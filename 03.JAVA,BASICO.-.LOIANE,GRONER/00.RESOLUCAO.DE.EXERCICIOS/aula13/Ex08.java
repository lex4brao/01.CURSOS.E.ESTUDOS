package aula13;

import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hora;
        double vhora, sal;
        System.out.println("Calculo de Salário");
        System.out.printf("Valor da hora trabalhada R$:");
        vhora = sc.nextDouble();
        System.out.printf("Quantas horas foram trabalhadas: ");
        hora = sc.nextInt();
        sal = vhora*hora;
        System.out.println();
        System.out.printf("Seu salário é R$%.2f\n",sal);
    }
}
