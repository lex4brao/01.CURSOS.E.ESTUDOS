package aula13;

import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int horas;
        double vhora, ir, inss, sind, salB, salL;
        System.out.println("Calculo de Salário");
        System.out.printf("Quantas horas você trabalhou: ");
        horas= sc.nextInt();
        System.out.printf("Qual o valor da hora trabalhada: ");
        vhora = sc.nextDouble();
        System.out.println();
        salB = horas*vhora;
        System.out.printf("Salário bruto R$:%.2f\n",salB);
        ir = salB*0.11;
        System.out.println("DESCONTOS");
        System.out.printf("Imposto de Renda R$:%.2f\n",ir);
        inss = salB*0.08;
        System.out.printf("Inss R$:%.2f\n",inss);
        sind = salB*0.05;
        System.out.printf("Sindicato R$:%.2f\n", sind);
        salL = salB-(ir+inss+sind);
        System.out.println();
        System.out.printf("Salário Liquido R$:%.2f\n", salL);

    }
}
