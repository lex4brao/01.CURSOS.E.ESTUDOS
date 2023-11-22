package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Qual numero deseja fatorar: ");
    int numb = sc.nextInt();
    int fatorial = 1;
    for (int i = numb; i>0; i--){
      fatorial *= i;
    }
    System.out.println(numb+" != "+fatorial);

  }
}
