package secao09;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta;
        int numero, op;
        String nome, resp;
        double saldo;

        System.out.println("Cadastro da conta");
        System.out.printf("Numero(4 digitos): ");
        numero = sc.nextInt();
        System.out.printf("Nome do titular: ");
        sc.nextLine();
        nome = sc.nextLine();
        System.out.println("Deseja fazer um deposito inicial?");
        System.out.println("[S]im");
        System.out.println("[N]ão");
        System.out.printf(">>> ");
        resp = sc.next();
        //sc.nextLine();
        if (resp.equalsIgnoreCase("s")) {
            System.out.printf("Valor do deposito R$:");
            saldo = sc.nextDouble();
            conta = new Conta(numero, nome, saldo);
        } else {
            conta = new Conta(numero, nome);
        }
        System.out.println();
        System.out.println(conta);
        System.out.println();

        do {

            System.out.println("Digite a opção desejada");
            System.out.println("[1] Saldo");
            System.out.println("[2] Depósito");
            System.out.println("[3] Saque");
            System.out.printf(">>> ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println();
                    System.out.println(conta);
                    System.out.println();
                    break;
                case 2:
                    System.out.printf("Valor do depósito R$:");
                    saldo = sc.nextDouble();
                    conta.Deposito(saldo);
                    System.out.println();
                    System.out.println(conta);
                    System.out.println();
                    break;
                case 3:
                    System.out.printf("Valor do saque R$:");
                    saldo = sc.nextDouble();
                    if (conta.getSaldo() > saldo) {
                        conta.Saque(saldo);
                        System.out.println();
                        System.out.println(conta);
                        System.out.println();
                    } else {
                        System.out.println("Saldo insuficiente");
                        System.out.println();
                        System.out.println(conta);
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Opção INVÁLIDA");
                    continue;
            }
            System.out.printf("Deseja continuar? [S]im ou [N]ão: ");
            resp = sc.next();
        } while (!resp.equalsIgnoreCase("N"));


    }
}
