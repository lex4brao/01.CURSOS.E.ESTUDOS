package aula15;

import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n1, n2, med;
        System.out.printf("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.printf("Digite a segunda nota: ");
        n2 = sc.nextDouble();
        med = ((n1+n2)/2);
        if (med>=10){
            System.out.println("Aprovado com LOUVOR");
        } else if (med>=7 && med<10) {
            System.out.println("Aprovado");
        } else if(med<7){
            System.out.println("Reprovado");
        }
    }
}
