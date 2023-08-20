package aula20;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[][] jogo = new String[3][3];
        int linha=0, coluna=0, jogada=1;
        boolean ganhou=false;
        String sinal = " ";

        System.out.println("\tJogo da Velha");
        System.out.println("Jogador 1 = x");
        System.out.println("Jogador 2 = o");
        System.out.println();

        for (int i=0;i< jogo.length;i++){
            for (int j=0;j<jogo[i].length;j++){
                jogo[i][j]=" ";
            }
        }

        do {
            System.out.println("\t  1 2 3");
            for (int i=0;i< jogo.length;i++){
                System.out.print("\t"+(i+1)+" ");
                for (int j=0;j<jogo[i].length;j++){
                    if (j==2){
                        System.out.print(jogo[i][j]);
                    } else {
                        System.out.print(jogo[i][j]+"|");
                    }
                }
                System.out.println();
            }
            System.out.println();
            if (jogada%2!=0){
                System.out.println("Jogada do jogador 1");
                sinal = "x";
            } else {
                System.out.println("Jogada do jogador 2");
                sinal = "o";
            }
            do {
                System.out.printf("linha: ");
                linha = sc.nextInt();
                if (linha<1 || linha>3){
                    System.out.println("Linha invalida");
                }
            }while (linha<1 || linha>3);
            do {
                System.out.printf("Coluna: ");
                coluna = sc.nextInt();
                if (coluna<1 || coluna>3){
                    System.out.println("Coluna invalida");
                }
            }while(coluna<1 || coluna>3);
            linha --;
            coluna --;
            if (jogo[linha][coluna]=="x" || jogo[linha][coluna]=="o"){
                System.out.println("Posição já ocupada tente novamente");
            } else {
                jogo[linha][coluna]=sinal;
                jogada++;
            }
            if ((jogo[0][0]=="x"&&jogo[0][1]=="x"&&jogo[0][2]=="x")||(jogo[1][0]=="x"&&jogo[1][1]=="x"&&jogo[1][2]=="x")
            ||(jogo[2][0]=="x"&&jogo[2][1]=="x"&&jogo[2][2]=="x")||(jogo[0][0]=="x"&&jogo[1][0]=="x"&&jogo[2][0]=="x")
            ||(jogo[0][1]=="x"&&jogo[1][1]=="x"&&jogo[2][1]=="x")||(jogo[0][2]=="x"&&jogo[1][2]=="x"&&jogo[2][2]=="x")
            ||(jogo[0][0]=="x"&&jogo[1][1]=="x"&&jogo[2][2]=="x")||(jogo[0][2]=="x"&&jogo[1][1]=="x"&&jogo[2][0]=="x")){
                System.out.println();
                System.out.println("JOGADOR 1 - Venceu");
                ganhou=true;
            } else if ((jogo[0][0]=="o"&&jogo[0][1]=="o"&&jogo[0][2]=="o")||(jogo[1][0]=="o"&&jogo[1][1]=="o"&&jogo[1][2]=="o")
                    ||(jogo[2][0]=="o"&&jogo[2][1]=="o"&&jogo[2][2]=="o")||(jogo[0][0]=="o"&&jogo[1][0]=="o"&&jogo[2][0]=="o")
                    ||(jogo[0][1]=="o"&&jogo[1][1]=="o"&&jogo[2][1]=="o")||(jogo[0][2]=="o"&&jogo[1][2]=="o"&&jogo[2][2]=="o")
                    ||(jogo[0][0]=="o"&&jogo[1][1]=="o"&&jogo[2][2]=="o")||(jogo[0][2]=="o"&&jogo[1][1]=="o"&&jogo[2][0]=="o")) {
                System.out.println();
                System.out.println("JOGADOR 2 - Venceu");
                ganhou=true;
            }
        } while (!ganhou);
        System.out.println("\t  1 2 3");
        for (int i=0;i< jogo.length;i++){
            System.out.print("\t"+(i+1)+" ");
            for (int j=0;j<jogo[i].length;j++){
                if (j==2){
                    System.out.print(jogo[i][j]);
                } else {
                    System.out.print(jogo[i][j]+"|");
                }
            }
            System.out.println();
        }



    }
}
