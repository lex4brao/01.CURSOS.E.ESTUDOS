package exerciciosloiane.Aula46;

public class Quadrado extends Figura2D implements DimensaoSuperficial{

    public Quadrado(String nome, String cor, int comprimento, int largura) {
        super(nome, cor, comprimento, largura);
    }


    @Override
    public double Area() {
        return this.getComprimento()*getLargura();
    }
}
