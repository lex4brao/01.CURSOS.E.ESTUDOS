package secao8.ex01;

public class Retangulo {
    public double base;
    public double altura;
    public double Area(){
        return base*altura;
    }
    public double Perimetro(){
        return 2*(base+altura);
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
    }
}
