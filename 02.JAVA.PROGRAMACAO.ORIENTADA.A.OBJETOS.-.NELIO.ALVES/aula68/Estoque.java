package secao8;

public class Estoque {
    public String name;
    public double valor;
    public double qtd;


    public double total(){
        return qtd*valor;
    }
    public double addProduto(int qtd){
        return this.qtd += qtd;
    }

    public double delProduto(int qtd){
        return this.qtd -= qtd;
    }
    public String toString(){
        return name+" Qtd: "+qtd+" Valor: "+valor+" Total: "+total();
    }
}
