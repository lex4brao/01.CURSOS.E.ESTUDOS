package secao8.ex03;

public class Aluno {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double NotaFinal(){
        return nota1+nota2+nota3;
    }
    public String Situacao(){
        if (NotaFinal()<60){
            return "REPROVADO";
        } else {
            return "APROVADO";
        }
    }
    public double Falta(){
        if (NotaFinal()<60){
            return 60-NotaFinal();
        } else {
            return 0;
        }
    }
}
