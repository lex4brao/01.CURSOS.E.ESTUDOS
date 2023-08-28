package aula24.ex02;

public class Livro {
    public String titulo;
    public String autor;
    public int anoLancamento;
    public int numeroPaginas;

    @Override
    public String toString() {
        return "Livro{\n" +
                "\ntitulo='" + titulo + '\'' +
                "\nautor='" + autor + '\'' +
                "\nanoLancamento=" + anoLancamento +
                "\nnumeroPaginas=" + numeroPaginas +
                "\n}";
    }
}
