package exerciciosloiane.Aula43.Ex02;

public class PessoaFisica extends Contribuinte {
    private String cpf;

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, Double rendaBruta, String cpf) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double caldImposto() {
        double renda = getRendaBruta();
        if(renda<=1400){
            return 0;
        }
        if (renda>1400&&renda<=2100){
            return (renda*0.1+100);
        }
        if (renda>2100&&renda<=2800){
            return (renda*0.15+270);
        }
        if (renda>2800&&renda<=3600){
            return (renda*0.25+500);
        }
        if (renda>3600){
            return (renda*0.3+700);
        }
        return 0;

    }
}
