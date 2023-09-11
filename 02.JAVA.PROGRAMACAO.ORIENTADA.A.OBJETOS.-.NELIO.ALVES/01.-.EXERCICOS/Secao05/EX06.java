package secao05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um valor de inteiro de 0 a 100:  ");
        double numb;
        numb = sc.nextDouble();
        if(numb<0 || numb>100){
            System.out.println("Fora do intervalo");
        } else if (numb<=25) {
            System.out.println("Está no intervalo [0,25]");
        } else if (numb<=50) {
            System.out.println("Está no intervalo [25,50]");
        } else if (numb<=75) {
            System.out.println("Está no intervalo [50,75]");
        } else if (numb>=75) {
            System.out.println("Está no intervalo [75,100]");
        }
    }
}
