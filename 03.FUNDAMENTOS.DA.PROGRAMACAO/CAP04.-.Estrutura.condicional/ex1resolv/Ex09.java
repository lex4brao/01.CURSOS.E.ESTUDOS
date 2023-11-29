package CAP04.ex1resolv;

import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o dia: ");
    int dia = sc.nextInt();
    System.out.print("Mes: ");
    int mes = sc.nextInt();
    System.out.print("Ano: ");
    int ano = sc.nextInt();
    String nomeMes=" ";
    switch (mes){
      case 1:
        nomeMes = "Janeiro";
        break;
      case 2:
        nomeMes = "Fevereiro";
        break;
      case 3:
        nomeMes = "Março";
        break;
      case 4:
        nomeMes = "Abril";
        break;
      case 5:
        nomeMes = "Maio";
        break;
      case 6:
        nomeMes = "Junho";
        break;
      case 7:
        nomeMes = "Julho";
        break;
      case 8:
        nomeMes = "Agosto";
        break;
      case 9:
        nomeMes = "Setembro";
        break;
      case 10:
        nomeMes = "Outubro";
        break;
      case 11:
        nomeMes = "Novembro";
        break;
      case 12:
        nomeMes = "Dezembro";
        break;
    }
    System.out.println("Today is "+dia+" / "+nomeMes+" / "+ano);
  }
}
