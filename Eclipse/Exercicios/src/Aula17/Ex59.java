package Aula17;

import java.util.Scanner;

class Ex59 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int i=0, qtd=0, alunos=0, soma=0,media=0;
    System.out.println("Cadastro de turmas");
    System.out.print("Qual a quantidade de turmas que deseja cadastrar: ");
    qtd = scan.nextInt();
    for(i=1;i<=qtd;i++) {
      System.out.println("Digite a quantidade de Alunos da "+i+" turma:");
      alunos = scan.nextInt();
      if (alunos>40){
        while (alunos>40) {
          System.out.println("A turma pode conter no maximo 40 alunos");
          System.out.println("Digite a quantidade de Alunos da "+i+" turma:");
          alunos = scan.nextInt();  
        } 
        soma+= alunos;
      } 
    } 
    System.out.println("Cadastro concluido você cadastrou "+soma+" alunos");
     System.out.println("Em "+qtd+" turmas");


  }
}
 