package aula71;

public class CalcNaoEstatico {
    public final double PI=3.1416;
    public double Area(double raio){
        return PI*Math.pow(raio,2);
    }
    public double Volume(double raio){
        return ((4/3)*PI*Math.pow(raio,3));
    }
}
