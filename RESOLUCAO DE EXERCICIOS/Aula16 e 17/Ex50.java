package Aula17;

import java.util.Scanner;

class Ex50 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int i=0, tabuada=0;
    System.out.println("Gerador de tabuada");
    System.out.println("Digite o qual tabuada deseja: ");
    tabuada = scan.nextInt();
    for(i=0;i<=10;i++) {
      System.out.println(i+"*"+tabuada+"="+(i*tabuada));
    } 

  }
}
 