package secao06.estruturafor;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;
        System.out.print("Os divisores de qual numero deseja ver: ");
        numb = sc.nextInt();
        for (int i=1;i<=numb;i++){
            if (numb%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
