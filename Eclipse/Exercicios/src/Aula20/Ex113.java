package Aula20;

import java.util.Scanner;

public class Ex113 {
	 public static void main (String[] args) {
		    Scanner scan = new Scanner(System.in);

		    int i, j, jogada=1, linha, coluna;
		    char sinal;
		    char[][] tabuleiro = new char[3][3];
		    System.out.print("Jogo da Velha\n");
		    for(i=0;i<tabuleiro.length;i++) {
		      for(j=0;j<tabuleiro[i].length;j++) {
		        tabuleiro[i][j]= ' ';
		        if (j==(tabuleiro[i].length-1)){
		          System.out.print(" "+tabuleiro[i][j]);
		        } else {
		          System.out.print(" "+tabuleiro[i][j]+" |");          
		        } 
		      }
		      if (i==(tabuleiro.length-1)){
		        System.out.println(" ");
		      }  else {
		        System.out.println("\n------------");
		      } 
		    } 
		    System.out.println("Jogador 1 = X");
		    System.out.println("Jogador 2 = 0");
		    do {
		      System.out.println("\nJogada "+jogada);
		      if (jogada%2!=0){
		        sinal = 'X';
		        System.out.println("Jogador 1, digite linha e coluna da jogada");
		        do {
		          System.out.print("Linha: ");
		          linha = scan.nextInt();
		          if (linha<1 || linha>3){
		            System.out.print("Linha Inválida");
		          } 
		        } while(linha<1 || linha>3);

		        
		        do {
		          System.out.print("coluna: ");
		          coluna = scan.nextInt();
		          if (coluna<1 || coluna>3){
		            System.out.print("coluna Inválida");
		          } 
		        } while(coluna<1 || coluna>3);
		        linha--;
		        coluna--;
		        if(tabuleiro[linha][coluna]!=' ') {
		          System.out.println("Posição já usada");
		        }else {
		          tabuleiro[linha][coluna] = sinal;
		          jogada++;
		        } 
		      } else{
		        sinal = '0';
		        System.out.println("Jogador 2, digite linha e coluna da jogada");
		        do {
		          System.out.print("Linha: ");
		          linha = scan.nextInt();
		          if (linha<1 || linha>3){
		            System.out.print("Linha Inválida");
		          } 
		        } while(linha<1 || linha>3);

		        
		        do {
		          System.out.print("coluna: ");
		          coluna = scan.nextInt();
		          if (coluna<1 || coluna>3){
		            System.out.print("coluna Inválida");
		          } 
		        } while(coluna<1 || coluna>3);
		        linha--;
		        coluna--;
		        if(tabuleiro[linha][coluna]!=' ') {
		          System.out.println("Posição já usada");
		        }else {
		          tabuleiro[linha][coluna] = sinal;
		          jogada++;
		        } 
		      }; 

		      for(i=0;i<tabuleiro.length;i++) {
		      for(j=0;j<tabuleiro[i].length;j++) {
		        if (j==(tabuleiro[i].length-1)){
		          System.out.print(" "+tabuleiro[i][j]);
		        } else {
		          System.out.print(" "+tabuleiro[i][j]+" |");          
		        } 
		      }
		      if (i==(tabuleiro.length-1)){
		        System.out.println(" ");
		      }  else {
		        System.out.println("\n------------");
		      } 
		    } 
		    if ((tabuleiro[0][0]=='X' && tabuleiro[0][1]=='X' && tabuleiro[0][2]=='X')||(tabuleiro[1][0]=='X' && tabuleiro[1][1]=='X' && tabuleiro[1][2]=='X')||(tabuleiro[2][0]=='X' && tabuleiro[2][1]=='X' && tabuleiro[2][2]=='X')||(tabuleiro[0][0]=='X' && tabuleiro[1][1]=='X' && tabuleiro[2][2]=='X')||(tabuleiro[0][2]=='X' && tabuleiro[1][1]=='X' && tabuleiro[2][0]=='X')){
		      System.out.println("\n\nVITÓRIA DO JOGADOR 1");
		      break;
		    }  else if ((tabuleiro[0][0]=='0' && tabuleiro[0][1]=='0' && tabuleiro[0][2]=='0')||(tabuleiro[1][0]=='0' && tabuleiro[1][1]=='0' && tabuleiro[1][2]=='0')||(tabuleiro[2][0]=='0' && tabuleiro[2][1]=='0' && tabuleiro[2][2]=='0')||(tabuleiro[0][0]=='0' && tabuleiro[1][1]=='0' && tabuleiro[2][2]=='0')||(tabuleiro[0][2]=='0' && tabuleiro[1][1]=='0' && tabuleiro[2][0]=='0')){
		      System.out.println("\n\nVITÓRIA DO JOGADOR 2");
		      break;
		    } else if (jogada<10) {
		      System.out.println("DEU VELHA - JOGO EMPATADO");
		    } 
		    } while(jogada<=10);
		  }
}
