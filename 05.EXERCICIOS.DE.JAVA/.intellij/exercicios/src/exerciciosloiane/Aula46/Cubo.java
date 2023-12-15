package exerciciosloiane.Aula46;

public class Cubo extends Figura3D implements DimensaoVolumetrica, DimensaoSuperficial{
    Quadrado quadrado;

    public Cubo(String nome, String cor, int altura, int largura, int comprimento) {
        super(nome, cor, altura);
        this.quadrado = new Quadrado(nome, cor, comprimento, largura);
    }


    @Override
    public double Volume() {
        return getAltura()*Area();
    }

    @Override
    public double Area() {
        return quadrado.Area();
    }
}
