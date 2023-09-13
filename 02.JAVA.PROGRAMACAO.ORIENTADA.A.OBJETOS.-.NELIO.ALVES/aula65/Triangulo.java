package aula65;

public class Triangulo {
    public double a;
    public double b;
    public double c;
    public double Area (){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
