package Secao5;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("Descobrindo o Quadrante");
    System.out.print("Digite a coordenada de x: ");
    double x = sc.nextDouble();
    System.out.print("Digite a coordenada de y: ");
    double y = sc.nextDouble();
    if ((x>=0)&&(y>=0)){
      System.out.println("Primeiro quadrante");
    } else if ((x>=0)&&(y<=0)) {
      System.out.println("Segundo quadrante");
    } else if ((x<=0)&&(y<=0)) {
      System.out.println("Terceiro quadrante");
    } else if ((x<=0)&&(y>=0)) {
      System.out.println("Quarto quadrante");
    }
  }
}
