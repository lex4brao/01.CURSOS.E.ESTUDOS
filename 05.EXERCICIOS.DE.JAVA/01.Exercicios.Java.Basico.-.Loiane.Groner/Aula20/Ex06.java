package exerciciosloiane.Aula20;

import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[][] jogo = new String[3][3];
    boolean fim = false;
    int jogada = 1;
    int linha, coluna;
    boolean jogadaInvalida = false;

    for (int i = 0; i < jogo.length; i++) {
      for (int j = 0; j < jogo[0].length; j++) {
        jogo[i][j] = "-";
      }
    }

    System.out.println("\t\t ***** Jogo da Velha ******");
    System.out.println("Jogador 1 = \"X\"");
    System.out.println("Jogador 2 = \"0\"");
    System.out.println();
    System.out.println();

    while (!fim) {
      System.out.println("   1   2   3 ");
      for (int i = 0; i < jogo.length; i++) {
        System.out.print(i + 1 + " ");
        for (int j = 0; j < jogo[0].length; j++) {
          if (j == 1) {
            System.out.printf(" | %s | ", jogo[i][j]);
          } else {
            System.out.print(jogo[i][j]);
          }
        }
        System.out.println();
      }
      System.out.println();
      System.out.println();
      if (jogada % 2 != 0) {
        System.out.println("Jogador 1");
        do {

          do {
            System.out.print("Linha: ");
            linha = sc.nextInt();
            if (linha < 1 || linha > 3) {
              System.out.println("Posição Invalida\n");
            }
          } while (linha < 1 || linha > 3);

          do {
            System.out.print("Coluna: ");
            coluna = sc.nextInt();
            if (coluna < 1 || coluna > 3) {
              System.out.println("Posição Invalida\n");
            }
          } while (coluna < 1 || coluna > 3);
          if (jogo[linha-1][coluna-1]=="-") {
            jogadaInvalida = false;
            jogo[--linha][--coluna] = "X";
          } else {
            System.out.println("Posição ocupada digite novamente \n");
            jogadaInvalida = true;
          }
        } while (jogadaInvalida);
          jogada++;

      }

       else if (jogada % 2 == 0) {
        System.out.println("Jogador 2");
        do {

          do {
            System.out.print("Linha: ");
            linha = sc.nextInt();
            if (linha < 1 || linha > 3) {
              System.out.println("Posição Invalida\n");
            }
          } while (linha < 1 || linha > 3);

          do {
            System.out.print("Coluna: ");
            coluna = sc.nextInt();
            if (coluna < 1 || coluna > 3) {
              System.out.println("Posição Invalida\n");
            }
          } while (coluna < 1 || coluna > 3);
          if (jogo[linha-1][coluna-1]=="-") {
            jogadaInvalida = false;
            jogo[--linha][--coluna] = "O";
          } else {
            System.out.println("Posição ocupada digite novamente \n");
            jogadaInvalida = true;
          }
        } while (jogadaInvalida);
          jogada++;

      }
      System.out.println();
      System.out.println();
      if ((jogo[0][0]=="X"&&jogo[0][1]=="X"&&jogo[0][2]=="X")||(jogo[1][0]=="X"&&jogo[1][1]=="X"&&jogo[1][2]=="X")||
              (jogo[2][0]=="X"&&jogo[2][1]=="X"&&jogo[2][2]=="X")||(jogo[0][0]=="X"&&jogo[1][0]=="X"&&jogo[2][0]=="X")||
              (jogo[0][1]=="X"&&jogo[1][1]=="X"&&jogo[2][1]=="X")||(jogo[0][2]=="X"&&jogo[1][2]=="X"&&jogo[2][1]=="X")||
              (jogo[0][0]=="X"&&jogo[1][1]=="X"&&jogo[2][2]=="X")||(jogo[0][2]=="X"&&jogo[1][0]=="X"&&jogo[2][2]=="X")){
        System.out.println("\n\n Jogador 1 Venceu\n\n");
        fim = true;
      } else if ((jogo[0][0]=="O"&&jogo[0][1]=="O"&&jogo[0][2]=="O")||(jogo[1][0]=="O"&&jogo[1][1]=="O"&&jogo[1][2]=="O")||
              (jogo[2][0]=="O"&&jogo[2][1]=="O"&&jogo[2][2]=="O")||(jogo[0][0]=="O"&&jogo[1][0]=="O"&&jogo[2][0]=="O")||
              (jogo[0][1]=="O"&&jogo[1][1]=="O"&&jogo[2][1]=="O")||(jogo[0][2]=="O"&&jogo[1][2]=="O"&&jogo[2][1]=="O")||
              (jogo[0][0]=="O"&&jogo[1][1]=="O"&&jogo[2][2]=="O")||(jogo[0][2]=="O"&&jogo[1][0]=="O"&&jogo[2][2]=="O")) {
        System.out.println("\n\n Jogador 2 Venceu\n\n");
        fim = true;

      }
      if (jogada>9){
        System.out.println("\n\n Jogo Empatado");
        fim=true;
      }
      }
      System.out.println("   1   2   3 ");
      for (int i = 0; i < jogo.length; i++) {
        System.out.print(i + 1 + " ");
        for (int j = 0; j < jogo[0].length; j++) {
          if (j == 1) {
            System.out.printf(" | %s | ", jogo[i][j]);
          } else {
            System.out.print(jogo[i][j]);
          }
        }
        System.out.println();
      }
      System.out.println();
    }
  }

