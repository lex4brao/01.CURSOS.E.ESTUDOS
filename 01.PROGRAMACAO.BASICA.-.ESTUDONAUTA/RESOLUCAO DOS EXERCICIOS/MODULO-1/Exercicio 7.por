programa
{
  inclua biblioteca Matematica --> m  
  funcao inicio()
  {
    real b, a
    escreva("\nCalculo de gasto de tinta")
    escreva("\nQual o comprimeito da parede")
    escreva("\n>> ")
    leia(b)
    escreva("\nQual a altura da parede")
    escreva("\n>> ")
    leia(a)
    escreva("\nA parede tem ", b*a, "m²")
    escreva("\nSerá necessário ", m.arredondar((b*a)/2, 1), " litros de tinta para pintar a parede")
    escreva("\n\n")
  }
}
