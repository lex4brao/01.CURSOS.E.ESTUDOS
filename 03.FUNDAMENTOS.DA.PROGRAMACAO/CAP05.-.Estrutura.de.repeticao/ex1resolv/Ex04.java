package CAP05.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    String cidade;
    int nVeiculos, nAcidente;
    int maior=0, menor=0;
    double medVeiculos=0, medAcidente=0;
    double somaVeiculos=0, somaAcidente=0, contAcidente=0;
    String cidMenor="", cidMaior="";

    System.out.println("****Analizando dados de Transito****");
    for (int i = 1; i <=5; i++) {
      System.out.println("---- Cadastro cidade "+i+" ----");
      System.out.print("Cidade: ");
      cidade = sc.nextLine();
      System.out.print("Numero de Veiculos: ");
      nVeiculos = sc.nextInt();
      System.out.print("Numero de Acidentes: ");
      nAcidente = sc.nextInt();
      if (i==1){
        maior = nAcidente;
        cidMaior = cidade;
        menor = nAcidente;
        cidMaior = cidade;
      }
      if (nAcidente> maior){
        maior = nAcidente;
        cidMaior = cidade;
      }
      if (nAcidente< menor){
        menor = nAcidente;
        cidMenor = cidade;
      }
      somaVeiculos+=nVeiculos;

      if (nVeiculos<20000){
        somaAcidente+= nAcidente;
        contAcidente++;
      }
      sc.nextLine();
      System.out.println();
    }
    medVeiculos = somaVeiculos/5;
    medAcidente = somaAcidente/contAcidente;

    System.out.println("A cidade com menor indice é acidente é");
    System.out.println("\t"+cidMenor+" com "+menor+" acidentes");
    System.out.println();
    System.out.println("A cidade com maior indice de acidente é");
    System.out.println("\t"+cidMaior+" com "+maior+" acidentes");
    System.out.println();
    System.out.println("A média de veiculos de todas as cidades é "+medVeiculos);
    System.out.println();
    System.out.println(contAcidente+" Cidades tem menos de 20.000 veiculos");
    System.out.println("A média de acidente nessas cidade é "+medAcidente);
    System.out.println();
    System.out.println();
  }
}
