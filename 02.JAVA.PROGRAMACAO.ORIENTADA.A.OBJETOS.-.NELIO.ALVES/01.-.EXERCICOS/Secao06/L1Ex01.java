package secao6;

import java.util.Scanner;
public class L1Ex01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int senha=0000;
        while (senha!=2010){
            System.out.println("Digite a senha");
            System.out.printf(">>");
            senha = sc.nextInt();
            if (senha==2010){
                System.out.println("Acesso Permitido");
            }else {
                System.out.println("Senha Inválida");
            }
        }
    }
}
