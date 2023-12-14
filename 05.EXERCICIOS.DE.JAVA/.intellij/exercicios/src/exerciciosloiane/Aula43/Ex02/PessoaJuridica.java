package exerciciosloiane.Aula43.Ex02;

public class PessoaJuridica extends Contribuinte{
    private String cnpj;

    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, Double rendaBruta, String cnpj) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double caldImposto() {
        return this.getRendaBruta()*0.1;
    }
}
