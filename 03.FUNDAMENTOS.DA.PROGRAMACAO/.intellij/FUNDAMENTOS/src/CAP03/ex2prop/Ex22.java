package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Digite o numero de lados de um poligono");
        double lados = sc.nextDouble();
        double diag = lados*((lados-3)/2);
        System.out.println("O poligono tem "+df.format(diag));
    }
}
