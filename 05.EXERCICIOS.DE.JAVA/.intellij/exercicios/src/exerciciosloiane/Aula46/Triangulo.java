package exerciciosloiane.Aula46;

public class Triangulo extends Figura2D implements DimensaoSuperficial {


    public Triangulo(String nome, String cor, int comprimento, int largura) {
        super(nome, cor, comprimento, largura);
    }

    @Override
    public double Area() {
        return (0.5*getComprimento()*getLargura());
    }
}
