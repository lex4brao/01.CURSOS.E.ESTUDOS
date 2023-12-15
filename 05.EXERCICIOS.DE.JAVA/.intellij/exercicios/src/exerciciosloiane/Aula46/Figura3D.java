package exerciciosloiane.Aula46;

public class Figura3D extends FiguraGeometrica {
    private int altura;

    public Figura3D(String nome, String cor, int altura) {
        super(nome, cor);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
