package aula13;

import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double tempf, tempc;
        System.out.println("Conversor de temperatura");
        System.out.printf("Digite a temperatura em Farenheit: ");
        tempf = sc.nextDouble();
        tempc = (5*(tempf-32)/9);
        System.out.printf("%.2fºf é igual a %.2fºC\n",tempf,tempc);
    }
}
