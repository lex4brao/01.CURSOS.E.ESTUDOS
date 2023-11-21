package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double salarioMin, salarioF;
        System.out.println("Digite o salario do funcionario R$ ");
        salarioF = sc.nextDouble();
        System.out.println("Qual o valor do salário minimo R$ ");
        salarioMin = sc.nextDouble();
        System.out.println("O funcionario recebe "+df.format(salarioF/salarioMin));
    }
}
