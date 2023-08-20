package secao8;

import secao8.ex02.Funcionario;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        double aumento;

        System.out.println("Digite os dados do funcionário");
        System.out.printf("Nome: ");
        funcionario.name = sc.nextLine();
        System.out.printf("Salario R$:");
        funcionario.salario = sc.nextDouble();
        System.out.printf("Imposto R$:");
        funcionario.taxa = sc.nextDouble();

        System.out.println("O salario liquido do funcionário é R$"+funcionario.SalarioLiquido());
        System.out.println();
        System.out.println("Qual a porcentagem(%) de aumento do funcionário: ");
        aumento = sc.nextDouble();
        funcionario.Aumento(aumento);
        System.out.println("O salario liquido do funcionário é R$"+funcionario.SalarioLiquido());
    }
}
