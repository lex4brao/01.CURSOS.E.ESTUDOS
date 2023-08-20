package aula17;

import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nome=" ", senha=" ";
        System.out.println("Faça seu login");
        System.out.printf("Usuário: ");
        nome = sc.next();
        do {
            System.out.printf("Senha: ");
            senha = sc.next();
            if (senha.equalsIgnoreCase(nome)){
                System.out.println("Senha inválida");
            } else {
                System.out.println("Senha valida");
            }
        }while (senha.equalsIgnoreCase(nome));
    }
}
