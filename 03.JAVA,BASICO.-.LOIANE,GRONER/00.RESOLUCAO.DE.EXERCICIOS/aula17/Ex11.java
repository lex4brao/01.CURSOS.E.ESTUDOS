package aula17;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ini, fim, soma=0;
        System.out.printf("Digite o numero do inicio: ");
        ini = sc.nextInt();
        System.out.printf("Digite o numero do fim: ");
        fim = sc.nextInt();
        if (ini<fim){
            for (int i=ini;i<=fim;i++){
                System.out.printf(i+"  ");
                soma+=i;
            }
        } else if(ini>fim){
            for (int i=ini;i>=fim;i--){
                System.out.printf(i+"  ");
                soma+=i;
            }
        }
        System.out.println("\nA soma dos numeros do intervalo é "+soma);
    }
}
