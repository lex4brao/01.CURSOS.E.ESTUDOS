programa
{
  inclua biblioteca Matematica --> m
  funcao inicio()
  {
    real	sal, aumento
    escreva("\nCalculadora de reajuste salarial")
    escreva("\nQual o salario do funcionario")
    escreva("\n>> R$")
    leia(sal)
    escreva("\nQuanto (%) será o aumento salarial")
    escreva("\n(%)>> ")
    leia(aumento)
    escreva("\n")
    escreva("\nO novo salário do funcionário será de R$", m.arredondar(sal*(1+(aumento/100)), 2))
    escreva("\n\n")
  }
}