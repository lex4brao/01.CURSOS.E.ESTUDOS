package CAP04.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println("Colocando 3 numeros em ordem");
        System.out.println("Digite o primeiro numero ");
        int n1 =sc.nextInt();
        System.out.println("Digite o segundo numero ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro numero ");
        int n3 = sc.nextInt();;
        if ((n1<n2)&&(n1<n3)){
            if (n2<n3){
                System.out.println("A ordem é "+n1+" - "+n2+" - "+n3);
            }
            else {
                System.out.println("A ordem é "+n1+" - "+n3+" - "+n2);
            }
        } else if ((n2<n1)&&(n2<n3)) {
            if (n1<n3){
                System.out.println("A ordem é "+n2+" - "+n1+" - "+n3);
            }else {
                System.out.println("A ordem é "+n2+" - "+n3+" - "+n1);
            }
        } else if ((n3<n1)&&(n3<n2)) {
            if (n1<n2){
                System.out.println("A ordem é "+n3+" - "+n1+" - "+n2);
            }else {
                System.out.println("A ordem é "+n3+" - "+n2+" - "+n1);
            }
        }
    }
}
