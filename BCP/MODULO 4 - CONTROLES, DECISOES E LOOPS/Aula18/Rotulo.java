package Aula18;

import java.util.Scanner;

class Rotulo {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    for(int i=0;i<=4;i++) {
      rotulo1:{
        rotulo2:{
          rotulo3:{
            if (i==1){
              break rotulo1;
            } 
            if (i==2){
              break rotulo2;
            } 
            if (i==3){
              break rotulo3;
            } 
            System.out.println("Rotulo 3");
          }
          System.out.println("Rotulo 2");
        }
        System.out.println("Rotulo 1");
      }
      System.out.println(i);
    } 
  }
}