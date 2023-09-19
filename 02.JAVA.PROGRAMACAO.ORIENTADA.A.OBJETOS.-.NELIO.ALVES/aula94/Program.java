package aula94;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluguel[] alugueis = new Aluguel[10];
        String nome;
        String email;
        int quarto, qtd;
        System.out.print("Quantos Alugueis deseja cadastrar: ");
        qtd = sc.nextInt();
        for (int i=1; i<=qtd; i++){
            System.out.println("Aluguel "+i+": ");
            sc.nextLine();
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("E-mail: ");
            email = sc.next();
            System.out.print("Quarto: ");
            quarto = sc.nextInt();
            alugueis[quarto] = new Aluguel(nome, email);
            System.out.println();
        }
        System.out.println();
        System.out.println("Quartos Alugados ");
        for (int i=0; i<alugueis.length;i++){
            if (alugueis[i]!=null){
                System.out.println("Quarto "+i+": "+alugueis[i]);
            }
        }

    }
}
