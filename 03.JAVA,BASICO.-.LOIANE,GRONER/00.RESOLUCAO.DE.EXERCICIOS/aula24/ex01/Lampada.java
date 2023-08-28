package aula24.ex01;

public class Lampada {
    public String modelo;
    public String tensao;
    public int potencia;
    public String tipo;

    @Override
    public String toString() {
        return "Lampada" +
                "\nmodelo='" + modelo + '\'' +
                "\ntensao='" + tensao + '\'' +
                "\npotencia=" + potencia +"w"+
                "\ntipo='" + tipo + '\'';
    }
}
