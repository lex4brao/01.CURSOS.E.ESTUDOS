package aula15;

import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dia;
        System.out.println("Digite o numero do dia da semana [1 á 7]");
        System.out.printf(">>>");
        dia = sc.nextInt();
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda - Feira");
                break;
            case 3:
                System.out.println("Terça - Feira");
                break;
            case 4:
                System.out.println("Quarta - Feira");
                break;
            case 5:
                System.out.println("Quinta - Feira");
                break;
            case 6:
                System.out.println("Sexta - Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Não é um numero de dia da semana");
        }
    }
}
