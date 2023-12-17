package Secao5;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite um numero de 0 até 100:  ");
    int numb = sc.nextInt();
    if ((numb>=0)&&(numb<=25)){
      System.out.print("Intervalo de 0 até 25");
    } else if ((numb>25)&&(numb<=50)) {
      System.out.print("Intervalo de 25 até 50");
    } else if ((numb>50)&&(numb<=75)) {
      System.out.print("Intervalo de 50 até 75");
    } else if ((numb>75)&&(numb<=100)) {
      System.out.print("Intervalo de 75 até 100");
    } else {
      System.out.print("Numero invalido");
    }


  }
}
