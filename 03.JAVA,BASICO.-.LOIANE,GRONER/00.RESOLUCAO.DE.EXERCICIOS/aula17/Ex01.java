package aula17;

import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double nota;
        do{
            System.out.printf("Digite a nota do aluno: ");
            nota = sc.nextDouble();
            if (nota>=0 && nota<=10){
                System.out.println("nota cadastrada");
            }else {
                System.out.println("NOTA INVALIDA, DIGITE NOVAMENTE");
            }
        }while(nota<=0 || nota>=10);
    }
}
