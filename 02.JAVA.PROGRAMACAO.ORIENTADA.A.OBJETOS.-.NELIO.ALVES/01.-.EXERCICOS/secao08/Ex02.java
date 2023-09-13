package secao08;

import secao08.ex02.Funcionario;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("Entre com os dados do funcionário");
        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salario Bruto R$");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Taxa de imposto R$");
        funcionario.imposto = sc.nextDouble();

        System.out.println(funcionario);

        System.out.print("Qual a porcentagem de aumento do salário: ");
        double aumento = sc.nextDouble();
        funcionario.Aumento(aumento);

        System.out.println(funcionario);


    }
}
