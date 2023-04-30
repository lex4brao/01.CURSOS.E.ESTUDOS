package Aula15;

import java.util.Scanner;

class Ex30 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Resolvendo Equação de Segundo Grau");
    System.out.print("Ax²+Bx+C=0");
    System.out.print("\nDigite o valor de A : ");
    int a= scan.nextInt();
    if (a==0){
      System.out.println("Não é uma equação valida A=0");
      System.out.print("\nDigite o valor de A : ");
      a= scan.nextInt();
    }     
    System.out.print("Digite o valor de B : ");
    int b= scan.nextInt();
    System.out.print("Digite o valor de C : ");
    int c= scan.nextInt();
    double delta = (b*b)-(4*a*c);
    double x1=0, x2=0;
    if (delta<0){
      System.out.print("A equação não possui raizes reais");
    } else if (delta==0){
      System.out.println("A equação só possui uma raiz real");
    } else {
      x1= ((-(b))-Math.sqrt(delta))/(2*a);
      x2= ((-(b))+Math.sqrt(delta))/(2*a);
      System.out.println("O valor de x1 é "+x1);
      System.out.println("O valor de x2 é "+x2);
    }
  } 
}

