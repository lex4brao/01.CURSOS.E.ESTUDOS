package aula13;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double tempf, tempc;
        System.out.println("Conversor de temperatura");
        System.out.printf("Digite a temperatura em Celcius: ");
        tempc = sc.nextDouble();
        tempf = ((1.8*tempc)+32);
        System.out.printf("%.2fºC é igual a %.2fºf\n",tempc,tempf);
    }
}
