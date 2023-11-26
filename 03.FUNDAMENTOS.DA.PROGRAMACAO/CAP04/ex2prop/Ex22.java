package CAP04.ex2prop;

import java.util.Scanner;

public class Ex22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Classificação de pessoas");
    System.out.print("Idade: ");
    int idade = sc.nextInt();
    System.out.print("Peso: ");
    double peso = sc.nextDouble();
    int classif = 0;
    if (idade<20){
      if (peso<60){
        classif = 9;
      } else if (peso>=60&&peso<=90) {
        classif = 8;
      } else if (peso>90) {
        classif = 7;
      }
    } else if (idade>=20&&idade<=50) {
      if (peso<60){
        classif = 6;
      } else if (peso>=60&&peso<=90) {
        classif = 5;
      } else if (peso>90) {
        classif = 4;
      }
    } else if (idade>50) {
      if (peso<60){
        classif = 3;
      } else if (peso>=60&&peso<=90) {
        classif = 2;
      } else if (peso>90) {
        classif = 1;
      }
    }
    System.out.println("A pessoa cadastrada está no grupo "+classif);

  }
}
