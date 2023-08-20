package aula17;

public class Ex04 {
    public static void main(String[] args) {
        double a, b;
        int count=0;
        a=80;
        b=200;
        do {
            a= a*1.03;
            b= b*1.015;
            count++;
        }while (a<b);
        System.out.println("Em "+count+" anos");
        System.out.printf("O pais A terá %.2f mil habitantes\n",a);
        System.out.printf("O pais B terá %.2f mil habitantes",b);
    }
}
