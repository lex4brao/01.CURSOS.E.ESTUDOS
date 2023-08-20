package secao5;

import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hi, hf, duracao;
        System.out.println("Duração do jogo");
        System.out.printf("Hora de inicio: ");
        hi = sc.nextInt();
        System.out.printf("Hora do termino: ");
        hf = sc.nextInt();
        if (hi<hf){
            duracao = hf-hi;
        }else {
            duracao = (24-hi)+hf;
        }
        System.out.println("O jogo durou "+duracao+" horas");
    }
}
