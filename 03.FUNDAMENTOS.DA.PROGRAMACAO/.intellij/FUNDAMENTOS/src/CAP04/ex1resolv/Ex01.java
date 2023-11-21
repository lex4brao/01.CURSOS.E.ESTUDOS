package CAP04.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double av1, tb, av2;
        System.out.printf("Digite a nota da primeira avaliação ");
        av1 = sc.nextDouble();
        System.out.printf("Digite a nota do trabalho ");
        tb = sc.nextDouble();
        System.out.printf("Digite a nota da segunda avaliação ");
        av2 = sc.nextDouble();
        double media = (av1*0.35)+(tb*0.4)+(av2*0.35);
        if ((media>=8)&&(media<=10)){
            System.out.println("O aluno obteve conceito A");
        } else if ((media>=7)&&(media<8)) {
            System.out.println("O aluno obteve conceito B");
        } else if ((media>=6)&&(media<7)) {
            System.out.println("O aluno obteve conceito C");
        } else if ((media>=5)&&(media<6)) {
            System.out.println("O aluno obteve conceito D");
        } else if ((media>=0)&&(media<5)) {
            System.out.println("O aluno obteve conceito E");
        } else {
            System.out.println("Nota inválida");
        }
    }
}
