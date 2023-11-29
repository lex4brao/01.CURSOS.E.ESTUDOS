package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        int n1,n2;
        System.out.printf("Digite um numero ");
        n1 = sc.nextInt();
        System.out.printf("Digite outro numero ");
        n2 = sc.nextInt();
        System.out.println(n1+" - "+n2+" = "+(n1-n2));
    }
}
