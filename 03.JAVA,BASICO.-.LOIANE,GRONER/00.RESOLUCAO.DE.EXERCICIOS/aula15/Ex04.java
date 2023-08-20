package aula15;

import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String letra;
        System.out.printf("Digite uma letra: ");
        letra = sc.next();
        if (letra.equalsIgnoreCase("a")
                ||letra.equalsIgnoreCase("e")
                ||letra.equalsIgnoreCase("i")
                ||letra.equalsIgnoreCase("o")
                ||letra.equalsIgnoreCase("u")){
            System.out.println("É uma vogal");
        } else {
            System.out.println("É uma consoante");
        }
    }
}
