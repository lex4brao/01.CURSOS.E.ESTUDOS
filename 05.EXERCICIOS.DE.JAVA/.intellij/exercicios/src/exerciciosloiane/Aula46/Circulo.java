package exerciciosloiane.Aula46;

public class Circulo extends Figura2D implements DimensaoSuperficial{

    public Circulo(String nome, String cor, int comprimento, int largura) {
        super(nome, cor, comprimento, largura);
    }

    @Override
    public double Area() {
        return Math.PI*(((double) getComprimento() /2)*((double) getComprimento() /2));
    }
}
