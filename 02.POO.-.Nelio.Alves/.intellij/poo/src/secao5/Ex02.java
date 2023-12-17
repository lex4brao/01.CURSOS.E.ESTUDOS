package Secao5;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite um numero inteiro ");
    int numb = sc.nextInt();
    if (numb%2==0){
      System.out.print("\nO numero é par");
    } else {
      System.out.print("\nO numero é impar");
    }

  }
}
