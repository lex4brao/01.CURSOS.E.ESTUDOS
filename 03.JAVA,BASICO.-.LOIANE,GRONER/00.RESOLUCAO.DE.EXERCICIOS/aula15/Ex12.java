package aula15;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int horas;
        double valorHora, salario, ir, pIR=0, inss, sind, fgts, salarioL;
        System.out.println("Calculo Folha de Pagamento");
        System.out.printf("Quantas horas o funcionário trabalhou: ");
        horas = sc.nextInt();
        System.out.printf("Qual o valor da hora trabalhada R$:");
        valorHora = sc.nextDouble();
        salario = horas*valorHora;
        if (salario<=900){
            pIR = 0;
        } else if (salario>900&&salario<=1500) {
            pIR = 0.05;
        }  else if (salario>1500&&salario<=2500) {
            pIR = 0.1;
        }  else if (salario>2500) {
            pIR = 0.2;
        }
        System.out.println("Salário Bruto "+horas+"*"+valorHora+" R$:"+salario);
        ir = salario*pIR;
        System.out.println("(-)Imposto de renda R$"+ir);
        inss = salario*0.1;
        System.out.println("(-)INSS R$"+inss);
        sind = salario*0.03;
        System.out.println("(-) Sindicato R$"+sind);
        fgts = salario*0.11;
        System.out.println("FGTS R$"+fgts);
        salarioL = salario-(ir+inss+sind);
        System.out.println("Salário liquido R$"+salarioL);

    }
}
