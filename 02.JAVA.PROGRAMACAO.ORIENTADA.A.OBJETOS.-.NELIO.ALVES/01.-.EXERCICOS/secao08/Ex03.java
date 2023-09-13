package secao08;

import secao08.ex03.Aluno;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Entre com os dados do Aluno");
        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();
        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        aluno.nota3 = sc.nextDouble();

        System.out.printf("Média final %.2f\n",aluno.Media());
        if (aluno.Media()<70){
            System.out.println("REPROVADO");
            System.out.printf("Faltam %.2f pontos", aluno.pontosFaltando());
        } else {
            System.out.println("APROVADO");
        }

    }
}
