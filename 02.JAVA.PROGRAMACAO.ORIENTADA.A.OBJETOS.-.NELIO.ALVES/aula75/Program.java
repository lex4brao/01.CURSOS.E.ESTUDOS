package aula75;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, email;
        int cel;
        System.out.println("Entre com os dados do contato");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Celular: ");
        cel = sc.nextInt();
        System.out.print("E-mail: ");
        email = sc.next();
        Contato contato = new Contato(nome, cel, email);
    System.out.println(contato);
        sc.nextLine();
        System.out.println("Entre com os dados do contato");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Celular: ");
        cel = sc.nextInt();
        Contato contato1 = new Contato(nome, cel);
        System.out.println(contato1);
    }
}
