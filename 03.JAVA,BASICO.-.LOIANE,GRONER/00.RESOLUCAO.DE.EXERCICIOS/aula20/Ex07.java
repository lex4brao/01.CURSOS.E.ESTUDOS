package aula20;

import java.util.Random;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc=new Scanner(System.in);
        String[][] jogo = new String[5][5];
        int linha=0, coluna=0, qtBombas=5, bomba=0, qtjogadas=5,jogada=1, pontos=0;

        for (int i=0;i< jogo.length;i++){
            for (int j=0;j<jogo[i].length;j++){
                jogo[i][j]=" ";
            }
        }

        do {
            linha = random.nextInt(5);
            coluna = random.nextInt(5);
            if ( jogo[linha][coluna]=="*"){
                continue;
            }else {
                jogo[linha][coluna]="*";
                bomba++;
            }

        }while (bomba<qtBombas);

        System.out.println("\t Jogo Campo minado ");
        do {
            System.out.println("\t  1 2 3 4 5");
            for (int i=0;i< jogo.length;i++){
                System.out.print("\t"+(i+1)+" ");
                for (int j=0;j<jogo[i].length;j++){
                    if (jogo[i][j]=="X"){
                        System.out.printf(jogo[i][j]+" ");
                    } else {
                        System.out.print("O ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Digite a linha e coluna do seu tiro");
            do {
                System.out.printf("linha: ");
                linha = sc.nextInt();
                if (linha<1 || linha>5){
                    System.out.println("Linha invalida");
                }
            }while (linha<1 || linha>5);
            do {
                System.out.printf("Coluna: ");
                coluna = sc.nextInt();
                if (coluna<1 || coluna>5){
                    System.out.println("Coluna invalida");
                }
            }while(coluna<1 || coluna>5);
            linha--;
            coluna--;
            if (jogo[linha][coluna]=="*"){
                System.out.println();
                System.out.println("Acertou uma bomba");
                System.out.println();
                break;
            } else if (jogo[linha][coluna]=="X") {
                System.out.println("Você já realizou essa jogada");
                System.out.println();
            } else if (jogo[linha][coluna]==" "){
                System.out.println("BOA você marcou 20 pontos");
                System.out.println();
                jogo[linha][coluna]="X";
                jogada++;
                pontos+=20;
            }
        }while (jogada<=qtjogadas);
        if (jogada<=qtjogadas){
            System.out.println("GAME OVER");
            System.out.println();
        } else {
            System.out.println("Você VENCEU");
            System.out.println();
        }
        for (int i=0;i< jogo.length;i++){
            System.out.print("\t"+(i+1)+" ");
            for (int j=0;j<jogo[i].length;j++){
                System.out.printf(jogo[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Você fez "+pontos+" pontos");
    }
}
