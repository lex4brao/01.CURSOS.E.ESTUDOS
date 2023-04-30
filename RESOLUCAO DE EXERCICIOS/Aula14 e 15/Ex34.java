package Aula15;

import java.util.Scanner;

class Ex34 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("CSI - Investigando um crime");
    System.out.println("Você telefonou para a vítima?");
    System.out.println("[S] para Sim");
    System.out.println("[N] para Não");
    String resp= scan.next();
    int contador=0;
    if (resp.equalsIgnoreCase("s")){
      ++contador;
    } 
    System.out.println("Esteve no local do crime?");
    System.out.println("[S] para Sim");
    System.out.println("[N] para Não");
    resp= scan.next();
    if (resp.equalsIgnoreCase("s")){
      ++contador;
    } 
    System.out.println("Mora perto da vítima?");
    System.out.println("[S] para Sim");
    System.out.println("[N] para Não");
    resp= scan.next();
    if (resp.equalsIgnoreCase("s")){
      ++contador;
    } 
    System.out.println("Devia para a vítima?");
    System.out.println("[S] para Sim");
    System.out.println("[N] para Não");
    resp= scan.next();
    if (resp.equalsIgnoreCase("s")){
      ++contador;
    } 
    System.out.println("Já trabalhou com a vítima?");
    System.out.println("[S] para Sim");
    System.out.println("[N] para Não");
    resp= scan.next();
    if (resp.equalsIgnoreCase("s")){
      ++contador;
    } 
    System.out.print("O entrevistado  ");
    switch(contador){
      case 2: System.out.println("Suspeito");
        break;
      case 3:
      case 4: System.out.println("Cumplice");
        break;
      case 5: System.out.println("O Assasino");
        break;
      default: System.out.println("Inocente");
    }
  }
}

