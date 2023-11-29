package CAP04.ex1resolv;

import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o codigo do Cargo: ");
    int cod = sc.nextInt();
    System.out.print("Digite o Salario R$: ");
    double salario = sc.nextDouble();
    double novoSalario;
    switch (cod){
      case 1:
        System.out.println("Escriturário");
        novoSalario = salario*1.5;
        System.out.println("O salario agora será R$"+novoSalario);
        break;
      case 2:
        System.out.println("Secretário");
        novoSalario = salario*1.35;
        System.out.println("O salario agora será R$"+novoSalario);
        break;
      case 3:
        System.out.println("Caixa");
        novoSalario = salario*1.2;
        System.out.println("O salario agora será R$"+novoSalario);
        break;
      case 4:
        System.out.println("Gerente");
        novoSalario = salario*1.1;
        System.out.println("O salario agora será R$"+novoSalario);
        break;
      case 5:
        System.out.println("Diretor");
        novoSalario = salario*1;
        System.out.println("Não terá aumento R$"+novoSalario);
        break;
      default:
        System.out.println("Código inválido");
        break;
    }
  }
}
