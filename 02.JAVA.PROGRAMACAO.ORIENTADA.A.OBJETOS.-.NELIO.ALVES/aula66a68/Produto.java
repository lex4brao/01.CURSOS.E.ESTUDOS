package aula66a68;

public class Produto {
    public String nome;
    public double preco;
    public int qtd;

    public double totalValorEstoque (){
        return preco*qtd;
    }
    public void addProduto (int qtd){
        this.qtd += qtd;
    }
    public void removeProduto (int qtd){
        this.qtd -= qtd;
    }
    public String toString(){
        return "Dados do produto: "
                +nome
                +" R$"
                +String.format("%.2f",preco)
                +", "
                +qtd
                +" und, Total R$:"
                +String.format("%.2f",preco*qtd);
    }
}
