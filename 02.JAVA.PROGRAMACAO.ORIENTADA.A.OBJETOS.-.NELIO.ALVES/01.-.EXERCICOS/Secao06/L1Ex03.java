package secao6;

import java.util.Scanner;
public class L1Ex03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op=0, etanol=0, gas=0, diesel=0;
        while (op!=4){
            System.out.println("Digite o combustivel");
            System.out.println("[1] - Etanol");
            System.out.println("[2] - Gasolina");
            System.out.println("[3] - Diesel");
            System.out.println("[4] - Sair");
            System.out.printf(">>");
            op = sc.nextInt();
            switch (op){
                case 1:
                    etanol++;
                    break;
                case 2:
                    gas++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        System.out.println("Escolhas dos Clientes");
        System.out.println("Etanol: "+etanol);
        System.out.println("Gasolina: "+gas);
        System.out.println("Diesel: "+diesel);
    }
}
