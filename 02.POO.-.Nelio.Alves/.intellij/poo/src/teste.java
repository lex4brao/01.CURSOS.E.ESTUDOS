import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4;
        int soma;
        System.out.println("Digite 4 valores diferentes: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        soma = n1+n2+n3+n4;
        System.out.println("A soma dos valores é "+soma);
    }
}
