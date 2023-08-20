package aula15;

import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String hora;
        System.out.println("Em que horas você estuda?");
        System.out.println("[M] - Matutino");
        System.out.println("[V] - Vespertino");
        System.out.println("[N] - Noturno");
        System.out.printf(">> ");
        hora = sc.next();
        if (hora.equalsIgnoreCase("m")){
            System.out.println("Bom dia");
        } else if (hora.equalsIgnoreCase("v")) {
            System.out.println("Boa tarde");

        } else if (hora.equalsIgnoreCase("n")) {
            System.out.println("Boa noite");
        }else {
            System.out.println("Opção inválida");
        }
    }
}
