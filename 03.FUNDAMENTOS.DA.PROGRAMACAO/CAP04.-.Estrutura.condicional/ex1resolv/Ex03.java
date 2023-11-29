package CAP04.ex1resolv;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          DecimalFormat df = new DecimalFormat("###,###.##");
          System.out.print("Digite um numero: ");
          double n1 = sc.nextDouble();
          System.out.print("Digite outro numero: ");
          double n2 = sc.nextDouble();
          if (n1>n2){
            System.out.println("Maior = " + n1);
          } else if (n2>n1) {
            System.out.println("Maior = " + n2);
          } else if (n1==n2) {
            System.out.println("São iguais");
          }

  }
}
