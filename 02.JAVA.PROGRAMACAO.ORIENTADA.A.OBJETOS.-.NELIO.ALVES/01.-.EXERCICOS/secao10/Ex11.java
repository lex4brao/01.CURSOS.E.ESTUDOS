package secao10;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos Alunos deseja cadastrar: ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        double[] media = new double[n];
        for (int i=0; i<nome.length;i++){
            System.out.println("Cadastro Aluno "+(i+1));
            sc.nextLine();
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Nota 1: ");
            nota1[i] = sc.nextDouble();
            System.out.print("Nota 2: ");
            nota2[i] = sc.nextDouble();
            media[i] = ((nota1[i]+nota2[i])/2);
        }
        System.out.println("Os Alunos Aprovados são: ");
        for (int i=0; i<nome.length;i++){
            if (media[i]>=6){
                System.out.println(nome[i]);
            }
        }
    }
}
