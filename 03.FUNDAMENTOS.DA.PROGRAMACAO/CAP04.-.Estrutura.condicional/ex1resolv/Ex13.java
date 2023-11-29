package CAP04.ex1resolv;

import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escolha a opção desejada");
    System.out.println("[1] - Imposto");
    System.out.println("[2] - Aumento de salário");
    System.out.println("[3] - Classificação");
    System.out.print(">> ");
    int op=sc.nextInt();
    System.out.print("Digite o salário R$:");
    double salario = sc.nextDouble();
    switch (op){
      case 1:

        if (salario<500){
          System.out.println("O imposto é de R$"+(salario*0.05));
        } else if (salario>=500&&salario<=850) {
          System.out.println("O imposto é de R$"+(salario*0.10));
        } else if (salario>850) {
          System.out.println("O imposto é de R$"+(salario*0.15));
        }
        break;
      case 2:

        if (salario<450){
          System.out.println("O novo salário será R$"+(salario+100));
        } else if (salario>=450&&salario<750) {
          System.out.println("O novo salário será R$"+(salario+75));
        } else if (salario>=750&&salario<=1500) {
          System.out.println("O novo salário será R$"+(salario+50));
        } else if (salario>1500){
          System.out.println("O novo salário será R$"+(salario+25));
        }
        break;
      case 3:

        if (salario<=700){
          System.out.println("Funcionário mal remunerado");
        } else {
          System.out.println("Funcionário bem remunerado");
        }
    }
  }
}
