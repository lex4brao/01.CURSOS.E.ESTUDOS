package CAP04.ex2prop;

import java.util.Scanner;

public class Ex20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a idade: ");
    int id = sc.nextInt();
    if (id >= 5 && id <= 7) {
      System.out.println("Infantil");
    } else if (id >= 8 && id <= 10) {
      System.out.println("Juvenil");
    } else if (id >= 11 && id <= 15) {
      System.out.println("Adolescente");
    } else if (id >= 16 && id <= 30) {
      System.out.println("Adulto");
    } else if (id > 30) {
      System.out.println("Senhor");
    } else {
      System.out.println("Não tem categoria");
    }
  }
}
