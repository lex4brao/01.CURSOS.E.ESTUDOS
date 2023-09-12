package secao06.estruturawhile;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        String resp;
        do {
            System.out.println("Digite a cordenada de X e Y");
            System.out.print("X: ");
            x = sc.nextInt();
            System.out.print("Y: ");
            y = sc.nextInt();
            if (x>0 && y>0){
                System.out.println("Primeiro quadrante");
            } else if (x>0 && y<0) {
                System.out.println("Segundo quadrante");
            } else if (x<0 && y<0) {
                System.out.println("Terceiro quadrante");
            } else {
                System.out.println("Quarto quadrante");
            }
            System.out.print("Deseja continuar, [S]im ou [N]ão: ");
            resp = sc.next();
        } while (resp.equalsIgnoreCase("S"));
    }
}
