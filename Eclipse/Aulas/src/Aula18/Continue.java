package Aula18;

import java.util.Scanner;

class Continue {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    for(int i=0;i<=10;i++) {
      if (i%2==0){
        continue;
      } 
      System.out.println(i+"");
    } 
  }
}