package CAP04.ex1resolv;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("Escolha qual operação deseja fazer");
    System.out.println("\t[1] - Fazer uma soma");
    System.out.println("\t[2] - Rais quadrada ");
    System.out.print("OP>>  ");
    int op = sc.nextInt();
    if (op==1){
      System.out.print("Valor 1: ");
      int n1 = sc.nextInt();
      System.out.print("Valor 2: ");
      int n2 = sc.nextInt();
      int soma = n1+n2;
      System.out.println("soma = " + soma);
    } else if (op==2) {
      System.out.print("Valor: ");
      int numb = sc.nextInt();
      double raiz = Math.sqrt(numb);
      System.out.println("raiz = " + raiz);
      
    }
  }
}
