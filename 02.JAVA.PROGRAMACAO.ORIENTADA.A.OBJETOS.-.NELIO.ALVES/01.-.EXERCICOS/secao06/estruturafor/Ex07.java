package secao06.estruturafor;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;
        System.out.print("Até que numero deseja ver a sequencia: ");
        numb = sc.nextInt();
        for (int i=1;i<=numb;i++){
            System.out.print(i+" "+Math.pow(i,2)+" "+Math.pow(i,3));
            System.out.println("");
        }
    }
}
