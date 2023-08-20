package secao6;

import java.util.Scanner;
public class L1Ex02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=1,y=1;
        while (x!=0 && y!=0){
            System.out.printf("x=");
            x = sc.nextInt();
            System.out.printf("y=");
            y = sc.nextInt();
            if (x>0 && y>0){
                System.out.println("Quadrante 1");
            } else if (x>0 && y<0) {
                System.out.println("Quadrante 2");
            } else if (x<0 && y<0) {
                System.out.println("Quadrante 3");
            } else if (x<0 && y>0) {
                System.out.println("Quadrante 4");
            }
        }
    }
}
