package Aula17;

import java.util.Scanner;

class Ex41 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome=" ", sexo=" ", estado=" ";
    int idade=0;
    double salario;
    System.out.println("Cadastro");
    do {
      System.out.print("Nome: ");
      nome = scan.next();
      if (nome.length()<3){
        System.out.println("O nome deve ter mais que 3 letras");
      } 
    }while(nome.length()<3);
    
    do {
      System.out.print("Idade: ");
      idade = scan.nextInt();
      if (idade<0 || idade>150){
        System.out.println("A idade é entre 0 até 150 anos");
      } 
    } while(idade<0 || idade>150);

    do{
      System.out.print("Salario: ");
      salario = scan.nextDouble();
      if(salario<0){
        System.out.println("O salário deve ser maior que 0");
      }
    } while(salario<0);

    
    do{
      System.out.print("Sexo[M/F]: ");
      sexo = scan.next();
      if ((!sexo.equalsIgnoreCase("m"))&&(!sexo.equalsIgnoreCase("f"))){
        System.out.println("O sexo deve ser [M] masculino ou [F] feminino");
      } 
    }while((!sexo.equalsIgnoreCase("m"))&&(!sexo.equalsIgnoreCase("f")));

    do{
      System.out.print("Estado Civil: ");
      estado= scan.next();
      if ((!estado.equalsIgnoreCase("s"))&&( !estado.equalsIgnoreCase("c"))&&( !estado.equalsIgnoreCase("v"))&&( !estado.equalsIgnoreCase("d"))){
        System.out.println("O estado civil é [s] solteiro, [c] casado, [v] viuvo, [d] divorciado");
      }
    }while(!estado.equalsIgnoreCase("s")&&( !estado.equalsIgnoreCase("c"))&&( !estado.equalsIgnoreCase("v"))&&( !estado.equalsIgnoreCase("d")));

    System.out.println("\n\nCadastro Concluido");
    System.out.println("Nome: "+nome);
    System.out.println("Idade: "+idade);
    System.out.println("Salario R$:"+salario);
    System.out.println("Sexo: "+sexo);
    System.out.println("Estado Civil: "+estado);
  }
}
