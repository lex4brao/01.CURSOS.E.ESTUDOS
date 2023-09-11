package secao04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        int horasTrabalhadas, nunFucionario;
        double valorHora;

        System.out.print("Digite o numero do funcionario: ");
        nunFucionario = sc.nextInt();
        System.out.print("Digite quantas horas foram trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.print("Qual o valor da hora trabalhada R$: ");
        valorHora = sc.nextDouble();
        System.out.println();
        System.out.println("Funcionario Numero: "+nunFucionario);
        System.out.println("O Salario do funcionario será R$:"+df.format(horasTrabalhadas*valorHora));

    }
}
