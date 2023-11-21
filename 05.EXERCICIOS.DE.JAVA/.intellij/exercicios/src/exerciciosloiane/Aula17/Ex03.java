package exerciciosloiane.Aula17;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean naoValido = true;
    String nome;
    do {
      System.out.print("\nDigite seu nome: ");
      nome = sc.nextLine();
      if (nome.length()>3){
        naoValido = false;
      } else {
        System.out.println("\t\tO nome deve ter mais que 3 letras");
      }
    } while (naoValido);

    naoValido = true;
    int idade;
    do {
      System.out.print("Digite sua idade: ");
      idade = sc.nextInt();
      if (idade>0&&idade<150){
        naoValido = false;
      } else {
        System.out.println("\t\tA idade deve ser entre 0 a 150 anos");
      }
    }while (naoValido);

    naoValido = true;
    double salario;
    do {
      System.out.print("Digite seu salario R$");
      salario = sc.nextDouble();
      if (salario>=0){
        naoValido = false;
      } else {
        System.out.println("O salario deve ser maior que 0");
      }
    }while (naoValido);

    naoValido = true;
    String sexo;
    do {
      System.out.print("Sexo [M/F]: ");
      sexo = sc.next();
      if (sexo.equalsIgnoreCase("m")||sexo.equalsIgnoreCase("f")){
        naoValido = false;
      } else {
        System.out.println("Sexo inválido");
      }
    }while (naoValido);
  }
}
