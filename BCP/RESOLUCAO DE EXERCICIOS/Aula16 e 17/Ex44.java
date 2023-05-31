package Aula17;

import java.util.Scanner;

class Ex44 {
  public static void main (String[] args) {
    //Scanner scan = new Scanner(System.in);
    for(int i=0;i<=20;i++) {
      System.out.println(""+i);
    } 
    System.out.println(" ");
    for(int i=0;i<=20;i++) {
      if (i==0){
        System.out.print(i);
      } else {
        System.out.print(" - "+i);
      } 
    } 

  }
}
 