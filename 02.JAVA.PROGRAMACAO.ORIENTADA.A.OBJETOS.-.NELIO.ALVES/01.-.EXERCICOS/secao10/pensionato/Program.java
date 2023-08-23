package secao10.pensionato;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int locadores, nQuarto;
        String nome, email;
        Quarto[] quartos=new Quarto[10];
        System.out.print("Quantos quartos serão locados: ");
        locadores = sc.nextInt();

        for(int i=0;i<locadores;i++){
            sc.nextLine();
            System.out.print("Nome: ");
            nome=sc.nextLine();
            System.out.print("E-mail: ");
            email=sc.nextLine();
            System.out.print("Numero do quardo[0-9]: ");
            nQuarto = sc.nextInt();
            quartos[nQuarto] = new Quarto(nome, email);
            System.out.println();
        }
        System.out.println("O quartos locados são: ");
        for(int i=0;i<quartos.length;i++){
            if (quartos[i]!=null){
                System.out.println("[Quarto "+i+"]: "+quartos[i]);
            }
        }
    }
}
