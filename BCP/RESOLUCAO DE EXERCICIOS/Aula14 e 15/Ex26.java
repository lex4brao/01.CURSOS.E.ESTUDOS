package Aula15;

import java.util.Scanner;

class Ex26 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Qual o valor da hora trabalhada R$:");
    double valorhora= scan.nextDouble();
    System.out.print("Quantas horas você trablha mensalmente: ");
    double horatrbalho=scan.nextDouble();

    double salario=valorhora*horatrbalho;
    double imposto=0;
    
    if (salario>900&&salario<=1500){;
      imposto = salario*0.05;
    } else if (salario>1500 && salario<=2500){;
      imposto = salario*0.1;
    } else if (salario>2500){;
      imposto = salario*0.2;
    } 
    
    double sindicato = salario*0.03;
    double inss = salario*0.1;
    System.out.println("Salario Bruto R$"+salario);
    System.out.println("(-) IR R$"+imposto);
    System.out.println("(-) Sindicato R$"+sindicato);
    System.out.println("(-)Inss R$"+inss);
    System.out.println("FGTS R$:"+(salario*0.11));
    System.out.println("Salario liquido será R$"+(salario-(imposto+inss+sindicato)));

  }
}

