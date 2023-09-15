package aula70e71.circuloV3;

public class Calculadora {
    public static final double PI=3.14159;
    public static double Circunferencia(double raio){
        return 2*PI*raio;
    }
    public static double Volume(double raio){
        return 4*PI*Math.pow(raio,3)/3;
    }
}
