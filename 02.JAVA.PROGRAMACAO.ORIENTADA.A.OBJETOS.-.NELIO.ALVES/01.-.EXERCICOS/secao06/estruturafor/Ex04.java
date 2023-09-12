package secao06.estruturafor;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd;
        double numb, divisor;
        System.out.print("Quantas divisões deseja fazer: ");
        qtd = sc.nextInt();
        for (int i=0;i<qtd; i++){
            System.out.print("Digite um numero: ");
            numb = sc.nextDouble();
            System.out.print("Digite o divisor: ");
            divisor = sc.nextDouble();
            if (divisor==0){
                System.out.println("Divisão impossivel");
            } else {
                System.out.println(numb+" / "+divisor+" = "+(numb/divisor));
            }
            System.out.println();
        }
    }
}
