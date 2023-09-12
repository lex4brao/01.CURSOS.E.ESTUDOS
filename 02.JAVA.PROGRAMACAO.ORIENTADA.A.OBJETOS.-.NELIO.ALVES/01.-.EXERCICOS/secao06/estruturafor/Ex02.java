package secao06.estruturafor;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd, numb, dentro=0, fora=0;
        System.out.print("Quantos numeros deseja cadastrar: ");
        qtd = sc.nextInt();
        for (int i=1;i<=qtd;i++){
            System.out.print("["+i+"]: ");
            numb = sc.nextInt();
            if (numb>=10 && numb<=20){
                dentro++;
            }else {
                fora++;
            }
        }
        System.out.println(dentro+" numeros estão dentro do intervalo de 10 até 20");
        System.out.println(fora+" numeros estão fora do intervalo de 10 até 20");
    }
}
