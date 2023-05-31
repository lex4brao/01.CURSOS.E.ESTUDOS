programa
{
    
  funcao inicio()
  {
    real	n1, n2
    escreva("\nQual a primeira nota do aluno")
    escreva("\n>> ")
    leia(n1)
    escreva("\nQual a Segunda nota do aluno")
    escreva("\n>> ")
    leia(n2)
    escreva("\nA média do aluno é ", (n1+n2)/2)
    se(((n1+n2)/2)>=7)
      {
        escreva("\nPARABENS ESTÁ ACIMA DA MÉDIA")
      }
    escreva("\n\n")
  }
}