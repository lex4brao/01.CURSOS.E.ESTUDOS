programa
{
  inclua biblioteca Matematica --> m
  funcao inicio()
  {
    real v
    escreva("\nCalculadora de desconto")
    escreva("\nDigite o valor do protudo")
    escreva("\n>> R$")
    leia(v)
    escreva("\n")
    escreva("\nCom 5% de desconto o valor do produto é R$", m.arredondar(v*0.95, 2))
    escreva("\n\n")
  }
}