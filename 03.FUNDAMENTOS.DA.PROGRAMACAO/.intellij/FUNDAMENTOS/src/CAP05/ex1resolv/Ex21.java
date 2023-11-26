package CAP05.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    int num;
    int soma = 0, cont = 0;
    int maior = (int) Double.MIN_VALUE;
    int menor = (int) Double.MAX_VALUE;
    int somaPar = 0, contPar = 0;
    int contImp = 0;

    System.out.println("\nDigite um numero ou 0 pra sair");
    do {
      System.out.print((cont+1)+"º valor: ");
      num = sc.nextInt();
      if (num !=0){
        cont++;
        soma += num;
        maior = (num>maior)?num:maior;
        menor = (num<menor)?num:menor;
        if (num%2==0){

        }
      }
    }while (num!=0);
    System.out.println("\n\n**** Resultados ****");
    System.out.println("cont = " + cont);
    System.out.println("soma = " + soma);
    System.out.println("Media = "+(soma/cont));
    System.out.println("maior = " + maior);
    System.out.println("menor = " + menor);
  }
}
