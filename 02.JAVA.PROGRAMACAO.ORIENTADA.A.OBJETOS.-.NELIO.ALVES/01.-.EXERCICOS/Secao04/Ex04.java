package secao4;

import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int func, hora;
        double valor, salario;
        System.out.println("Calculo de Salario");
        System.out.printf("Digite o numero do funcionário: ");
        func = sc.nextInt();
        System.out.printf("Digite o numero de horas trabalhadas: ");
        hora = sc.nextInt();
        System.out.printf("Digite o valor da hora trabalhada R$:");
        valor = sc.nextDouble();
        salario = hora*valor;
        System.out.println("-----------------");
        System.out.println("Funciário: "+func);
        System.out.printf("Salario: R$:%.2f\n",salario);
        System.out.println("-----------------");

    }
}
