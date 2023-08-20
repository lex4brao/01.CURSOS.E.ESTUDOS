package aula15;

import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double salario, percentual=0, novoSalario=0;
        System.out.println("Ajuste salárial");
        System.out.printf("Digite o salário do funcionário R$:");
        salario = sc.nextDouble();
        if (salario<=280){
            percentual= 0.2;
        } else if (salario>280&&salario<=700) {
            percentual=0.15;
        } else if (salario>700&&salario<=1500) {
            percentual=0.1;
        } else if (salario>1500) {
            percentual=0.05;
        }
        System.out.println("O salário terá "+(percentual*100)+"% de aumento");
        System.out.println("O salario terá R$"+(salario*percentual)+" de aumento");
        novoSalario = salario*(1+percentual);
        System.out.println("O salario novo será de R$"+novoSalario);

    }
}
