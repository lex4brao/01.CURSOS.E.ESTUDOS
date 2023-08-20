package aula15;

import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n1, n2, med;
        String conceito="";
        String situacao="";
        System.out.println("Digite as notas do Aluno");
        System.out.printf("1ª nota :");
        n1 = sc.nextDouble();
        System.out.printf("2ª nota :");
        n2 = sc.nextDouble();
        med = ((n1+n2)/2);
        if (med<=4){
            conceito="E";
            situacao="REPROVADO";
        } else if (med>4&&med<6) {
            conceito="D";
            situacao="REPROVADO";

        }  else if (med>6&&med<7) {
            conceito="C";
            situacao="APROVADO";

        }  else if (med>7&&med<8.5) {
            conceito="B";
            situacao="APROVADO";

        } else if (med>8.5&&med<10) {
            conceito="A";
            situacao="APROVADO";

        }
        System.out.println("O Aluno obteve conceito "+conceito);
        System.out.println("O Aluno está "+situacao);
    }
}
