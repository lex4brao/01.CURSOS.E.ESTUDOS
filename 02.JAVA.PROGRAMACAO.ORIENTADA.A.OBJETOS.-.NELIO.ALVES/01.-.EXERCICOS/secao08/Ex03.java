package secao8;

import secao8.ex03.Aluno;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Aluno aluno=new Aluno();

        System.out.println("Entre com os dados do Aluno: ");
        System.out.printf("Nome: ");
        aluno.name = sc.nextLine();
        System.out.printf("Nota1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.printf("Nota2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.printf("Nota3: ");
        aluno.nota3 = sc.nextDouble();

        System.out.println();
        System.out.println("A nota final do aluno é "+aluno.NotaFinal());
        System.out.println("O aluno está "+aluno.Situacao());
        if (aluno.NotaFinal()<60){
            System.out.println("Faltaram "+aluno.Falta()+" pontos");
        }
    }
}
