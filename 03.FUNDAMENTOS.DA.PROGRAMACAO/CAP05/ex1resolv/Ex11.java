package CAP05.ex1resolv;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("Verificador de numeros primos");
    System.out.print("Digite o numero que deseja verificar: ");
    int numb = sc.nextInt();
    int qtd = 0;
    for (int i = 1; i <=numb ; i++) {
        qtd = (numb%i==0)?(qtd+1):qtd;
    }
    if (qtd>2){
      System.out.println("O numero não é primo é divisivel por: ");
      for (int i = 1; i <=numb; i++) {
        if (numb%i==0){
          System.out.print("  "+i);
        }
      }
    } else {
      System.out.println("O numero é primo");
    }
  }
}
