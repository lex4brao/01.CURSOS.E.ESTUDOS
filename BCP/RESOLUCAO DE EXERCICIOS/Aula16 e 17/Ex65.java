package Aula17;

import java.util.Scanner;
import java.text.DecimalFormat;

class Ex65 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0,000.00");

    int i=1;
    double temp=0, maior=0, menor=0, media=0, soma=0;
    String resp=" ";
    System.out.println("Derpartamento de Metereologia");
    System.out.println("Cadastro de Temperatura");
    do {
      System.out.print(i+"º Cadastro: ");
      temp = scan.nextDouble();
      soma+=temp;
      if (i==1){
        maior = temp;
        menor = temp;
      } 
      if (temp>maior){
        maior=temp;
      } 
      if (temp<menor){
        menor=temp;
      } 
      i++;
      System.out.println("Deseja continuar [S]im ou [N]ão");
      resp = scan.next();
      while (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N")) {
        System.out.print("Resposta inválida digite S pra sim e N para não: ");
        resp = scan.next();
      } 
    } while(resp.equalsIgnoreCase("s"));
    media = soma/(i-1);
    System.out.println("A temperatura maxima cadastrada é: "+maior);
    System.out.println("A temperatura minima cadastrada é: "+maior);
    System.out.println("A temperatura média do cadastro é: "+media);
  }
}
 