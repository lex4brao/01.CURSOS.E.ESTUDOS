package Aula17;

import java.util.Scanner;

class Ex42 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    double pop1 = 80000, pop2=200000;
    int count=0;

    System.out.println("A populaçao do Pais 1 é de 80.000 habitantes");
    System.out.println("Com uma taxa de crescimento de 3% ao ano");
    System.out.println("A populaçao do Pais 2 é de 200.000 habitantes");
    System.out.println("Com uma taxa de crescimento de 1,5% ao ano");
    while(pop1<=pop2){
    pop1 = pop1*1.03;
    pop2 = pop2*1.015;
    count++;
    }
  System.out.println("A população do Pais 1 alcançará o Pais 2 em "+count+" anos");
  }
}
