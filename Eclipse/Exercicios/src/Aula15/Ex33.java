package Aula15;

import java.util.Scanner;

class Ex33 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um numero: ");
    double valor1= scan.nextInt();
    System.out.print("Digite outro numero: ");
    double valor2= scan.nextInt();
    System.out.println("Qual operação deseja realizar: ");
    System.out.println("[+] Soma");
    System.out.println("[-] Subtração");
    System.out.println("[*] Multiplicação");
    System.out.println("[/] Divisão");
    System.out.print("Digite o simbolo da operação: ");
    String op = scan.next();
    double resultado = 0;
    switch (op){
      case "+": resultado=valor1+valor2; 
        System.out.println(""+valor1+" + "+valor2+" = "+resultado);
        break;
      case "-": resultado=valor1-valor2; 
        System.out.println(""+valor1+" - "+valor2+" = "+resultado);
        break;
      case "*": resultado=valor1*valor2; 
        System.out.println(""+valor1+" * "+valor2+" = "+resultado);
        break;
      case "/": resultado=valor1/valor2; 
        System.out.println(""+valor1+" / "+valor2+" = "+resultado);
        break;
      default : System.out.println("Opção invalida"); break;
    }
      if (resultado%2==0){
        System.out.println("O resultado é um numero par");
      } else {
        System.out.println("O resultado é um numero impar");
      } 
      if (resultado>0){
        System.out.println("O resultado é um valor positivo");
      } else {
        System.out.println("O resultado é um valor negativo");
      } 
  }
}

