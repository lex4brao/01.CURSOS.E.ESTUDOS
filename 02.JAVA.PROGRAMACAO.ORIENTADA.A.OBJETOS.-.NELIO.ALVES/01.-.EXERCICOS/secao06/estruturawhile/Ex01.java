package secao06.estruturawhile;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        do {
            System.out.print("Digite sua senha: ");
            senha = sc.nextInt();
            if (senha==240213){
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha inválida");
            }
        } while (senha!=240213);
    }
}
