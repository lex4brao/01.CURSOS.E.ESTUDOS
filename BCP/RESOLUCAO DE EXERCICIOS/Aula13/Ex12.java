package Aula13;
import java.util.Scanner;

class Ex12 {
 public static void main (String[] args) {
  Scanner scan = new Scanner(System.in);

  System.out.print("Qual sua Altura?: ");
  double alt = scan.nextDouble();
  double peso = (72.7*alt)-58;

  System.out.println("Seu peso ideal é "+peso+"Kg");
 } 
}