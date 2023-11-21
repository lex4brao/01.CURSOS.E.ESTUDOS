package CAP04.ex1resolv;

import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um valor para A: ");
    int a= sc.nextInt();
    System.out.print("Digite um valor para B: ");
    int b= sc.nextInt();
    System.out.print("Digite um valor para C: ");
    int c= sc.nextInt();
    System.out.print("Digite 1, 2 ou 3: ");
    int i = sc.nextInt();
    if (i==1){
      if (a<b&&a<c){
        if (b<c){
          System.out.println("Ordem crescente "+a+" - "+b+" - "+c);
        } else{
          System.out.println("Ordem crescente "+a+" - "+c+" - "+b);
        }
      } else if (b<a&&b<c) {
        if (a<c){
          System.out.println("Ordem crescente "+b+" - "+a+" - "+c);
        }else {
          System.out.println("Ordem crescente "+b+" - "+c+" - "+a);
        }
      } else if (c<a&&c<b){
        if (a<b){
          System.out.println("Ordem crescente "+c+" - "+a+" - "+b);
        } else {
          System.out.println("Ordem crescente "+c+" - "+b+" - "+a);

        }
      }
    } else if (i==2) {
      if (a>b&&a>c){
        if (b>c){
          System.out.println("Ordem decrescente "+a+" - "+b+" - "+c);
        } else {
          System.out.println("Ordem crescente "+a+" - "+c+" - "+b);
        }
      } else if (b>a&&b>c) {
        if (a>c){
          System.out.println("Ordem crescente "+b+" - "+a+" - "+c);
        } else {
          System.out.println("Ordem crescente "+b+" - "+c+" - "+a);
        }
      } else if (c>a&&c>b) {
        if (a>b){
          System.out.println("Ordem crescente "+c+" - "+a+" - "+b);
        }else {
          System.out.println("Ordem crescente "+c+" - "+b+" - "+a);
        }
      }
    } else if (i==3) {
      if (a>b&&a>c){
        System.out.println("Ordem aleatoria "+b+" - "+a+" - "+c);
      } else if (b>a&&b>c){
        System.out.println("Ordem aleatoria "+a+" - "+b+" - "+c);
      } else if (c>a&&c>b) {
        System.out.println("Ordem aleatoria "+a+" - "+c+" - "+b);
      }
    }

  }
}
