package CAP06.ex2prop;
import java.text.DecimalFormat;

public class Ex14 {
  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("#,###.##");

    String[] nomes = {"Ana", "João", "Maria", "Carlos", "Lúcia", "Pedro", "Laura"};
    double[] notasProva1 = {7.5, 8.0, 6.5, 9.0, 5.0, 5.5, 9.5};
    double[] notasProva2 = {6.0, 7.0, 5.5, 9.5, 4.0, 1.5, 8.0};
    double[] media = new double[nomes.length];
    double mediaTot=0, qtAprov=0, qtReprov=0, qtExam=0;

    for (int i = 0; i < nomes.length; i++) {
      media[i] = (notasProva1[i]+notasProva2[i])/2;
      System.out.printf("\"%-10s\" - Prova 1 = \"%-2.2f\" Prova 2 = \"%-2.2f\" Média = \"%-2.2f\"",
              nomes[i], notasProva1[i], notasProva2[i], media[i]);
      System.out.println((media[i]>=5&&media[i]<7)?" - EM EXAME":(media[i]>=7)?" - APROVADO": " - REPROVADO");
      mediaTot+=media[i];
      qtAprov = (media[i]>=7)?(qtAprov+1):qtAprov;
      qtExam = (media[i]>=5&&(media[i]<7))?(qtExam+1):qtExam;
      qtReprov=(media[i]<5)?(qtReprov+1):qtReprov;

    }
    System.out.println();
    System.out.println(df.format((qtAprov/nomes.length)*100)+"% dos alunos foram Aprovados");
    System.out.println(df.format((qtReprov/nomes.length)*100)+"% dos alunos foram Reprovados");
    System.out.println(df.format((qtExam/nomes.length)*100)+"% dos alunos ficaram de Exame");
  }
}
