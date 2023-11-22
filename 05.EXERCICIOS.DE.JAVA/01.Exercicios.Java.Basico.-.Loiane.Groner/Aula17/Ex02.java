package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean valido = false;
    String nome, senha;
    do {
      System.out.print("Digite o nome de usuario: ");
      nome = sc.next();
      System.out.print("Digite a senha: ");
      senha = sc.next();
      if (!nome.equalsIgnoreCase(senha)){
        System.out.println("Usuario cadastrado: ");
        valido = true;
      } else {
        System.out.println("Usuario e senha iguais não é permitido ");
      }
    }while (!valido);
  }
}
