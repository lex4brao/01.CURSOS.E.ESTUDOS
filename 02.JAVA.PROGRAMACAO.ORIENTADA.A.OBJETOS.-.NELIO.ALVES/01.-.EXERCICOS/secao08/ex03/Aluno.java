package secao08.ex03;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double Media(){
        return ((nota1+nota2+nota3)/3);
    }
    public double pontosFaltando(){
        if (Media()<70){
            return (70-Media());
        } else {
            return 0;
        }
    }

}
