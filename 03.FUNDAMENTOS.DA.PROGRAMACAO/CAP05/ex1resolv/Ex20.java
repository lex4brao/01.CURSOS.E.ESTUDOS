package CAP05.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    String resp, sexo;
    int horaTrab, numM = 0, numF = 0;
    double salL = 0, salB;
    double medM = 0, medf = 0;

    do {
      System.out.println("\n**** Cadastro de Professor ******\n");
      System.out.print("Quantas horas aulas: ");
      horaTrab = sc.nextInt();
      System.out.print("Sexo [M]asc ou [F]em: ");
      sexo = sc.next();
      salB = horaTrab * 30;

      if (sexo.equalsIgnoreCase("M")) {
        salL = salB * 0.9;
        medM += salL;
        numM++;
      } else if (sexo.equalsIgnoreCase("F")) {
        salL = salB * 0.95;
        medf += salL;
        numF++;
      }

      System.out.println("\n**** Salario Professor ******");
      System.out.println("Salario Bruto R$" + df.format(salB));
      System.out.println("Salario Liqudo R$" + df.format(salL));
      System.out.println();


      System.out.println("Deseja fazer novo cadastro?");
      System.out.print("[S]im ou [N]ão:  ");
      resp = sc.next();

    } while (resp.equalsIgnoreCase("s"));

    if (numM <= 0) {
      System.out.println("Nenhum professor do sexo masculino");
    } else {
      System.out.println(numM + " Professores do sexo masculino");
      medM = medM / numM;
      System.out.println("A média salarial é R$" + df.format(medM));
    }

    if (numF <= 0) {
      System.out.println("Nenhum professor do sexo feminino");
    } else {
      System.out.println(numF+" Professores do sexo feminino");
      medf = medf/numF;
      System.out.println("A média salarial é R$"+df.format(medf));
    }
  }
}
