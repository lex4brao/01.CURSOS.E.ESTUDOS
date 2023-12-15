package exerciciosloiane.Aula46;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
    private Circulo circulo;


    public Cilindro(String nome, String cor, int altura, int comprimento, int largura) {
        super(nome, cor, altura);
        this.circulo = new Circulo(nome, cor, comprimento, largura);
    }

    @Override
    public double Area() {
        return circulo.Area();
    }

    @Override
    public double Volume() {
        return getAltura()*Area();
    }
}
