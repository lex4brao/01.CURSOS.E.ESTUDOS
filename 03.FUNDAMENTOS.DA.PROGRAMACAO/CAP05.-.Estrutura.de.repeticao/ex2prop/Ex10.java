package CAP05.ex2prop;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("Quantos numeros deseja cadastrar: ");
    int qtd = sc.nextInt();
    int num, qtdP = 0, qtI = 0;
    int soma = 0;
    for (int i = 1; i < qtd; i++) {
      num = rand.nextInt(100)+1;
      System.out.println(i+"º valor: "+num);
      qtdP = (num%2==0)? (qtdP+num): qtdP;
      qtI = (num%2!=0)? (qtI+num):qtI;
      soma+=num;
    }
    System.out.println();
    System.out.println("soma = " + soma);
    System.out.println("Soma pares = " + qtdP);
    System.out.println("Soma impares = " + qtI);
  }
}
