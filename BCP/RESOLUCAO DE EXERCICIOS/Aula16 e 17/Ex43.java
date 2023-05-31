package Aula17;

import java.util.Scanner;

class Ex43 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    double pop1 = 80000, pop2=200000, taxa1=0, taxa2=0;
    int count=0;

    System.out.println("A populaçao do Pais 1 é de 80.000 habitantes");
    System.out.println("Qual a taxa de crescimento ao ano: ");
    taxa1 = scan.nextDouble();
    System.out.println("A populaçao do Pais 2 é de 200.000 habitantes");
    System.out.println("Qual a taxa de crescimento ao ano: ");
    taxa2 = scan.nextDouble();
    while(pop1!=pop2){
    pop1 = pop1*(1+(taxa1/100));
    pop2 = pop2*(1+(taxa2/100));
    count++;
    }
  System.out.println("Para as populações dos paises se igualarem é necessário "+count+" anos");
  }
}
