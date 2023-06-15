programa
{
    
  funcao inicio()
  {
    cadeia	nome
    inteiro	idade
    real	sal
    escreva("\n\t CADASTRO DE FUNCIONÁRIO")
    escreva("\n--------------------------------------")
    escreva("\nNome do funcionario:\t")
    leia(nome)
    escreva("Idade do funcionario:\t")
    leia(idade)
    escreva("Salário do funcionario:\t")
    leia(sal)
    escreva("\n\n-------------------------------------------")
    escreva("\n\t Ficha do funcionário")
    escreva("\n\n-------------------------------------------")
    escreva("\nNome: \t\t", nome)
    escreva("\nIdade: \t\t", idade, " anos")
    escreva("\nSalário: \tR$", sal)
    escreva("\n\n")
  }
}