package aula70e71.circuloV2;

public class Calculadora {
    public final double PI=3.14159;
    public double Circunferencia(double raio){
        return 2*PI*raio;
    }
    public double Volume(double raio){
        return 4*PI*Math.pow(raio,3)/3;
    }

}
