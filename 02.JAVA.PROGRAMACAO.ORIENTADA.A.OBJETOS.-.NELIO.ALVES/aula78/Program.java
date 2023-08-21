package aula78;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        String nome, email;
        Long tel;

        System.out.println("Cadastre na agenda");
        System.out.printf("Nome: ");
        nome = sc.nextLine();
        System.out.printf("E-mail: ");
        email = sc.next();
        System.out.printf("Telefone: ");
        tel = sc.nextLong();
        Agenda age = new Agenda(nome, email, tel);
        sc.nextLine();
        System.out.println("Modifique o nome");
        System.out.printf("Nome: ");
        nome= sc.nextLine();
        age.setNome(nome);
        System.out.println(age);



    }
}
