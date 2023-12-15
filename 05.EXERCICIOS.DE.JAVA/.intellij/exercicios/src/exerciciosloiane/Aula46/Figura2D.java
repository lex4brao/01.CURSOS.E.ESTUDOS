package exerciciosloiane.Aula46;

public class Figura2D extends FiguraGeometrica{
    private int comprimento;
    private int largura;

    public Figura2D(String nome, String cor, int comprimento, int largura) {
        super(nome, cor);
        this.comprimento = comprimento;
        this.largura = largura;
    }



    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
}
