package Aula17;

import java.util.Scanner;

class Ex40 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    String usuario=" ", senha=" ";
    do {
      System.out.println("Digite o nome de usuário");
      usuario = scan.next();
      System.out.println("Digite a senha");
      senha = scan.next();

      if (usuario.equalsIgnoreCase(senha)){
        System.out.println("Senha igual o nome de usuário");
        System.out.println("Digite um novo nome de usuário e senha\n");
      } else {
        System.out.println("Usuario e senha Validos");
      } 
    } while(usuario.equalsIgnoreCase(senha));

  }
}