package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite um numero: ");
    int n1 = sc.nextInt();
    System.out.print("Digite outro numero: ");
    int n2 = sc.nextInt();
    System.out.println("\nMenu - Digite a opção desejada ");
    System.out.println("[1] - Média dos numeros");
    System.out.println("[2] - Diferença");
    System.out.println("[3] - multiplicação");
    System.out.println("[4] - divisão");
    int op = sc.nextInt();
    double resultado = 0;
    switch (op){
      case 1:
        resultado =(n1+n2)/2;
        System.out.println("A média é "+resultado);
        break;
      case 2:
        if (n1>n2){
          resultado = n1-n2;
          System.out.println("A diferença é "+resultado);
        } else if (n2>n1) {
          resultado = n2-n1;
          System.out.println("A diferença é "+resultado);
        }
        break;
      case 3:
        resultado = n1*n2;
        System.out.println("A multiplicação é "+resultado);
        break;
      case 4:
        resultado = n1/n2;
        System.out.println("A divisão é "+resultado);
        break;
      default:
        System.out.println("Opção invalida");
        break;
    }
  }
}
