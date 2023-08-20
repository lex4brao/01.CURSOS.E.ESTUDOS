package aula17;

import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ini, fim;
        System.out.printf("Digite o numero do inicio: ");
        ini = sc.nextInt();
        System.out.printf("Digite o numero do fim: ");
        fim = sc.nextInt();
        if (ini<fim){
            for (int i=ini;i<=fim;i++){
                System.out.printf(i+"  ");
            }
        } else if(ini>fim){
            for (int i=ini;i>=fim;i--){
                System.out.printf(i+"  ");
            }
        }
    }
}
