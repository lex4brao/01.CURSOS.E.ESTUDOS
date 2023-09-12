package secao06.estruturawhile;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao, gasolina=0, etanol=0, diesel=0;
        do {
            System.out.println("Qual o Combustivel da sua preferencia");
            System.out.println("[1] - Gasolina");
            System.out.println("[2] - Etanol");
            System.out.println("[3] - Diesel");
            System.out.println("[0] - Sair");
            opcao = sc.nextInt();
            switch (opcao){
                case 1 : gasolina++; break;
                case 2 : etanol++; break;
                case 3 : diesel++; break;
                case 0 : break;
                default:
                    System.out.println("Opção invalida");
            }
        } while (opcao!=0);
        System.out.println("Muito Obrigado");
        System.out.println("Gasolina: "+gasolina+" votos");
        System.out.println("Etanol: "+etanol+" votos");
        System.out.println("Diesel: "+diesel+" votos");
    }
}
