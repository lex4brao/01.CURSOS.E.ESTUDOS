package Aula15;

import java.util.Scanner;

class Ex29 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o primeiro lado do trianculo : ");
    int lado1= scan.nextInt();
    System.out.print("Digite o segundoo lado do trianculo : ");
    int lado2= scan.nextInt();
    System.out.print("Digite o terceiro lado do trianculo : ");
    int lado3= scan.nextInt();
    
    if (((lado1+lado2)>lado3)&&((lado1+lado3)>lado2)&&((lado2+lado3)>lado1)){;
      if (lado1==lado2&&lado1==lado3&&lado2==lado3){;
        System.out.println("É um triangulo Equilatero");
      } else if (lado1!=lado2&&lado1!=lado3&&lado2!=lado3){;
        System.out.println("É um triangulo Escaleno");
      } else if (lado1==lado2||lado1==lado3||lado2==lado3){;
        System.out.println("É um triangulo Isósceles");
      } 
    } else {;
      System.out.println("Os lados não formam um triângulo");
    } 

  }
}

