package exerciciosloiane.Aula46;

public class Piramide extends Figura3D implements DimensaoVolumetrica, DimensaoSuperficial{

private Triangulo triangulo;

    public Piramide(String nome, String cor, int altura, int comprimento, int largura) {
        super(nome, cor, altura);
        this.triangulo = new Triangulo(nome, cor, comprimento, largura);
    }

    @Override
    public double Volume() {
        return this.getAltura()*(Area()/3);
    }
    public double Area(){
        return triangulo.Area();
    }
}
