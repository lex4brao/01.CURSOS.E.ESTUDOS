package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("Digite a 1ª nota ");
    double n1 = sc.nextDouble();
    System.out.println("Digite a 2ª nota ");
    double n2 = sc.nextDouble();
    System.out.println("Digite a 3ª nota ");
    double n3 = sc.nextDouble();
    System.out.println("Digite a 4ª nota ");
    double n4 = sc.nextDouble();

    double media = (n1+n2+n3+n4)/4;
    System.out.println("Média "+media);
    if (media >= 70) {
      System.out.println("Aluno aprovado");
    } else {
      System.out.println("Aluno reprovado");
    }

  }
}
