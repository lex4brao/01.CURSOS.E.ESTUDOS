package Aula13;
import java.util.Scanner;
class Ex13 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Qual o Valor da sua hora trabalhada R$:");
    double valorhora = scan.nextDouble();
    System.out.print("Quantas horas você trabalha por mês:");
    double horas = scan.nextDouble();
    double salario = valorhora*horas;
    double imposto = salario*0.11;
    double inss = salario*0.08;
    double sindicato = salario*0.05;
    double liquido = salario-(imposto+inss+sindicato);

    System.out.println("Seu salário bruto é R$"+salario); 
    System.out.println("O desconto do INSS é R$"+inss); 
    System.out.println("O desconto do sindicato é R$"+sindicato); 
    System.out.println("Seu salário liquido é R$"+liquido); 

  }
}