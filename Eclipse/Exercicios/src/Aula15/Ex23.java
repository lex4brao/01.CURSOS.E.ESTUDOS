package Aula15;

import java.util.Scanner;

class Ex23 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um numero:");
    double valor1= scan.nextDouble();
    System.out.print("Digite outro numero:");
    double valor2= scan.nextDouble();
    System.out.print("Digite mais um numero:");
    double valor3= scan.nextDouble();
    double a=0, b=0, c=0;
    if (valor1<valor2 && valor1<valor3){;
      if (valor2<valor3){;
        a=valor1;
        b=valor2;
        c=valor3;
      } else if (valor3<valor2){;
        a=valor1;
        b=valor3;
        c=valor2;
      }
    } else if (valor2<valor1 && valor2<valor3){;
      if (valor1<valor3){;
        a=valor2;
        b=valor1;
        c=valor3;
      } else if (valor3<valor1){;
        a=valor2;
        b=valor3;
        c=valor1;
      } 
    } else if (valor3<valor2 && valor3<valor1){;
      if (valor1<valor2){;
        a=valor3;
        b=valor1;
        c=valor2;
      } else if (valor2<valor1){;
        a=valor3;
        b=valor2;
        c=valor1;
      } 
    } 
    System.out.println("Os valores em ordem decrescente");
    System.out.println("É "+a+" - "+b+" - "+c);
  }

}