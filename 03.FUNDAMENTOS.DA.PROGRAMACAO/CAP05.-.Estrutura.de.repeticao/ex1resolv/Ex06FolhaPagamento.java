package CAP05.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06FolhaPagamento {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("\n*** Folha de pagamento ***\n\n");
    System.out.print("Quantos funcionários deseja cadastrar ");
    int numFunc = sc.nextInt();
    double salMin = 1300;
    int[] cod = new int[numFunc];
    int[] horaTrab = new int[numFunc];
    String[] turno = new String[numFunc];
    String[] categ = new String[numFunc];
    double[] valorHora = new double[numFunc];
    double[] salarioB = new double[numFunc];
    double[] aux = new  double[numFunc];
    double[] salarioL = new double[numFunc];
    for (int i = 0; i < numFunc; i++) {
      System.out.println("\n---- Cadastro "+(i+1)+" ----");
      cod[i] = i+1;
      System.out.print("Horas trabalhadas: ");
      horaTrab[i] = sc.nextInt();
      do {
        System.out.print("Turno [M]atutino, [V]espertino, [N]oturno: ");
        turno[i] = sc.next();
        if (!turno[i].equalsIgnoreCase("M")
                &&!turno[i].equalsIgnoreCase("V")&&!turno[i].equalsIgnoreCase("N")){
          System.out.println("Voce digitou turno inexistente\n");
        }
      } while (!turno[i].equalsIgnoreCase("M")
              &&!turno[i].equalsIgnoreCase("V")&&!turno[i].equalsIgnoreCase("N"));
      do {
        System.out.print("Categora [O]prario [G]erente: ");
        categ[i] = sc.next();
        sc.nextLine();
        if (!categ[i].equalsIgnoreCase("O")&&!categ[i].equalsIgnoreCase("G")){
          System.out.println("Voce digitou categoria inexistente\n");
        }
      }while (!categ[i].equalsIgnoreCase("O")&&!categ[i].equalsIgnoreCase("G"));

      valorHora[i] = calcValorHora(categ[i], turno[i], salMin);
      salarioB[i] = horaTrab[i]*valorHora[i];
      aux[i] = valorAux(salarioB[i]);
      salarioL[i] = salarioB[i]+aux[i];

    }
    System.out.println("\n\n**** Resultados *****");
    for (int i = 0; i < numFunc; i++) {
      System.out.println("Fun:"+cod[i]+" | HoraTrab:"+horaTrab[i]+" | Turno:"+turno[i]+" | Cat:"+categ[i]+" | ValorHora: " +
              valorHora[i]+" | SalB:"+salarioB[i]+" | Aux:"+aux[i]+" | SalL:"+salarioL[i]);
    }
  }

  private static double valorAux(double salarioB) {
    double perc;
    if (salarioB<=300){
      perc = 0.2;
    } else if (salarioB>300&&salarioB<=600) {
      perc = 0.15;
    } else {
      perc = 0.05;
    }
    return salarioB*perc;
  }

  private static double calcValorHora(String categ, String turno, double salMin) {
    double perc;
    if (categ.equalsIgnoreCase("G")){
      perc = (turno.equalsIgnoreCase("N")?0.18:0.15);
    } else {
      perc = (turno.equalsIgnoreCase("N")?0.13:0.1);
    }
    return salMin*perc;
  }
}
