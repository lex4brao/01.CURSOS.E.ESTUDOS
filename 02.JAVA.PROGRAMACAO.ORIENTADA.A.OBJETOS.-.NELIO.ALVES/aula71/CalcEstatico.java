package aula71;

public class CalcEstatico {
    public static final double PI=3.1416;

    public static double Area(double raio){
        return PI*Math.pow(raio,2);
    }
    public static double Volume(double raio){
        return ((4/3)*PI*Math.pow(raio,3));
    }
}
