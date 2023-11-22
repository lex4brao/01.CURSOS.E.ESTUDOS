package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite um numero: ");
    int n1 = sc.nextInt();
    System.out.print("Digite outro numero: ");
    int n2 = sc.nextInt();
    System.out.println("\nMenu - Digite a opção desejada ");
    System.out.println("[1] - Potencia entre os numeros");
    System.out.println("[2] - Raiz quadrada dos numeros");
    System.out.println("[3] - Raiz cubica");
    int op = sc.nextInt();
    double resultado = 0;
    switch (op){
      case 1:
        System.out.println(n1+"elevado a"+n2+" é "+Math.pow(n1, n2));
        break;
      case 2:
        System.out.println("A raiz quadada de "+n1+" é "+Math.sqrt(n1));
        System.out.println("A raiz quadada de "+n2+" é "+Math.sqrt(n2));
        break;
      case 3:
        System.out.println("A raiz cubica de "+n1+" é "+Math.cbrt(n1));
        System.out.println("A raiz cubica de "+n2+" é "+Math.cbrt(n2));
      default:
        System.out.println("Opçao Invalida");
    }
  }
}
