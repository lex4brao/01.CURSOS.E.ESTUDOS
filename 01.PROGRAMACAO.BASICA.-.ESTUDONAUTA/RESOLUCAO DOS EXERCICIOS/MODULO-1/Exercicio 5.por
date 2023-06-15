programa
{
  inclua biblioteca Matematica --> m  
  funcao inicio()
  {
    real n1, n2
    escreva("\nDigite a primeira nota")
    escreva("\n>> ")
    leia(n1)
    escreva("\nDigite a segunta nota")
    escreva("\n>> ")
    leia(n2)
    escreva("\n\n A média do aluno é ", m.arredondar((n1+n2)/2, 2))
    escreva("\n\n")
  }
}
