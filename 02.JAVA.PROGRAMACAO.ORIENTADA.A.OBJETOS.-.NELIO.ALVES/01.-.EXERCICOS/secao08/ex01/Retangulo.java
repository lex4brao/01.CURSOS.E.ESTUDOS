package secao08.ex01;

public class Retangulo {
    public double altura;
    public double largura;

    public double Area(){
        return altura*largura;
    }
    public double Perimetro(){
        return ((altura*2)+(largura*2));
    }
    public double Diagonal(){
        return Math.sqrt((altura*altura)*(largura*largura));
    }
    public String toString(){
        return "Area: "
                +String.format("%.3f\n",Area())
                +"Perimetro: "
                +String.format("%.3f\n",Perimetro())
                +"Diagonal: "
                +String.format("%.3f\n",Diagonal());
    }
}
