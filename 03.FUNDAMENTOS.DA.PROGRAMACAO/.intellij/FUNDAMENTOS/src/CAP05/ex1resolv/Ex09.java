package CAP05.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("\n **** Notas de ALunos ***");
    System.out.println("Quandos alunos tem na sala: ");
    int nAlunos = sc.nextInt();

    int[] codAluno = new int[nAlunos];
    double[] n1 = new double[nAlunos];
    double[] n2 = new double[nAlunos];
    double[] med = new double[nAlunos];
    String[] sitAluno = new String[nAlunos];

    double somaMedias = 0;
    int alunosRep = 0;
    int alunosExam = 0;
    int alunosAprov =0;

    for (int i = 0; i < nAlunos; i++) {
        codAluno[i] = i;
      System.out.println("\t*** Cadastro Aluno "+(i+1)+" ***");
      System.out.print("Nota 1: ");
      n1[i] = sc.nextDouble();
      System.out.print("Nota 2: ");
      n2[i] = sc.nextDouble();
      med[i] = (n1[i]+n2[i])/2;

      if (med[i]<3){
        sitAluno[i] = "Reprovado";
        alunosRep++;
      } else if (med[i]>=3&&med[i]<7) {
        sitAluno[i] = "Em exame";
        alunosExam++;
      } else {
        sitAluno[i] = "Aprovado";
        alunosAprov++;
      }
      somaMedias+= med[i];
    }

    for (int i = 0; i <nAlunos ; i++) {
      System.out.println("Aluno: "+codAluno[i]+" | media: "+med[i]+" | Situação: "+sitAluno[i]);
    }

    double mediaTurma = somaMedias/nAlunos;
    System.out.println("\n*** Resultados ****");
    System.out.println("Total de Alunos aprovados "+alunosAprov);
    System.out.println("Total de Alunos em exame "+alunosExam);
    System.out.println("Total de Alunos reprovados "+alunosRep);
    System.out.println("A média da turma é "+df.format(mediaTurma));

  }
}
