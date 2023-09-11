package secao05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hInicio, hFim, duracao;
        System.out.print("Digite a hora no inicio do jogo: ");
        hInicio = sc.nextInt();
        System.out.print("Digite a hora do fim do jogo: ");
        hFim = sc.nextInt();
        if (hInicio<hFim){
            duracao = hFim - hInicio;
        } else {
            duracao = (24-hInicio)+hFim;
        }
        System.out.println("O jogo durou "+duracao+" horas");
    }
}
