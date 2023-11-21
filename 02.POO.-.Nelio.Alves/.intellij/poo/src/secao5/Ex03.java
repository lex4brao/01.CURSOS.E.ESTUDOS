package secao5;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite um numero inteiro ");
    int n1 = sc.nextInt();
    System.out.print("Digite outro numero menor que o primeiro ");
    int n2 = sc.nextInt();
    if (n1%n2==0){
      System.out.print("\nO numeros são multipos ");
    } else {
      System.out.print("\nOs numeros não são multiplos");
    }
  }
}
