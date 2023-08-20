package secao5;

import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cod, qt;
        double total=0;
        System.out.println("Digite o código do produto");
        System.out.println("Codigo \t Produto \t\t      Preço");
        System.out.println("  1 \t Cachorro Quente \tR$4,00");
        System.out.println("  2 \t X-Salada \t\t    R$4,50");
        System.out.println("  3 \t X-Bacon \t\t    R$5,00");
        System.out.println("  4 \t Torrada \t\t    R$2,00");
        System.out.println("  5 \t Refrigerante \t    R$1,50");
        System.out.printf("Código>> ");
        cod = sc.nextInt();
        System.out.printf("Digite a Quantidade: ");
        qt = sc.nextInt();
        if (cod==1){
            total = qt*4;
        } else if (cod==2) {
            total = qt*4.5;
        }else if (cod==3) {
            total = qt*5;
        }else if (cod==4) {
            total = qt*2;
        }else if (cod==5) {
            total = qt*1.5;
        }
        System.out.println();
        System.out.printf("O valor total é R$%.2f",total);


    }
}
