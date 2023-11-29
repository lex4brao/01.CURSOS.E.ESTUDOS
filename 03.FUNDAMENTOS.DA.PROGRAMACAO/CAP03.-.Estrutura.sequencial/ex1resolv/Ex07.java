package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.##");
        double salario, iR=0.10;
        double novoSalario;
        System.out.printf("Digite o salario do funcionario R$");
        salario = sc.nextDouble();
        novoSalario = (salario+50)-(salario*iR);
        System.out.printf("O funcionario irá receber R$"+df.format(novoSalario));

    }
}
