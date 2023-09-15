package secao09;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String nome, opcao;
        double saldo;
        Conta conta;

        System.out.println("Entre com os dados da conta");
        System.out.print("Numero da conta: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Deseja fazer deposito inicial [S]im ou [N]ao:  ");
        opcao = sc.next();
        if (opcao.equalsIgnoreCase("s")){
            System.out.print("Qual o valor R$: ");
            saldo = sc.nextDouble();
            conta = new Conta(numero, nome, saldo);
        } else {
            conta = new Conta(numero, nome);
        }
        System.out.println("Dados da Conta: "+ conta);
        System.out.println();
        System.out.print("Entre com o valor do Deposito: ");
        saldo = sc.nextDouble();
        conta.Deposito(saldo);
        System.out.println("Dados da Conta: "+ conta);
        System.out.println();
        System.out.print("Entre com o valor do Saque: ");
        saldo = sc.nextDouble();
        conta.Saque(saldo);
        System.out.println("Dados da Conta: "+ conta);
        saldo = sc.nextDouble();

    }
}
