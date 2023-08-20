package aula17;

import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nome, sexo;
        int idade;
        double  salario;
        System.out.println("Cadastro de funcionário");
        // nome
        do {
            System.out.printf("Nome: ");
            nome = sc.nextLine();
            if (nome.length()<3){
                System.out.println("Nome muito curto digite o nome correto");
            }
        } while (nome.length()<3);
        // idade
        do {
            System.out.printf("Idade: ");
            idade = sc.nextInt();
            if (idade<0 || idade>150){
                System.out.println("Idade inválida");
            }
        } while (idade<0 || idade>150);
        // sexo
        do {
            System.out.printf("Sexo: [M]asculino ou [F]eminino: ");
            sexo = sc.next();
            if(!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")){
                System.out.println("Sexo inválido");
            }
        }while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f"));
        // salario
        do {
            System.out.printf("Salário R$:");
            salario= sc.nextDouble();
            if (salario<=0){
                System.out.println("Salário inválido");
            }
        } while (salario<=0);
        System.out.println("Funcionário Cadastrado com Sucesso");
    }
}
