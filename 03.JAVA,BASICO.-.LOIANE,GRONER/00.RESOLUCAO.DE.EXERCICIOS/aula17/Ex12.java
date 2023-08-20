package aula17;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tab;
        System.out.println("Gerador de tabuada");
        System.out.printf("Deseja a tabuada de qual valor: ");
        tab = sc.nextInt();
        for (int i=0;i<=10;i++){
            System.out.println(i+" * "+tab+" = "+(i*tab));
        }
    }
}
