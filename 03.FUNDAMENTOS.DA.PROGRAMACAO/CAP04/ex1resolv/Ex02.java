package CAP04.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("digite a média do aluno ");
        double media = sc.nextDouble();
        if ((media>=0)&&(media<3)){
            System.out.println("Aluno reprovado");
        } else if ((media>=3)&&(media<7)) {
            System.out.println("Aluno em exame ");
            double faltam = 12-media;
            System.out.println("A nota do exame deve ser "+faltam);
        } else if ((media>=7)&&(media<=10)) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("nota inválida");
        }

    }
}
