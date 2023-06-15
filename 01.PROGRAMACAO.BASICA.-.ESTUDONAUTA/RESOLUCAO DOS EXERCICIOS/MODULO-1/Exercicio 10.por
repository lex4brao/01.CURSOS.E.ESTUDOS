programa
{
   inclua biblioteca Tipos --> t 
   inclua biblioteca Matematica --> m
  funcao inicio()
  {
    inteiro	ano_cig, qtd_cig, t_cig 
    real temp_cig
    escreva("\nCalculadora de cigarro")
    escreva("\nQuantos cigarros voce fuma por dia?")
    escreva("\n>> ")
    leia(qtd_cig)
    escreva("\nHá quantos anos você fuma?")
    escreva("\n>> ")
    leia(ano_cig)
    t_cig = (qtd_cig*365)*ano_cig
    escreva("\n")
    escreva("\nAtualmente você já fumou ", t_cig, " cigarros")
    temp_cig = m.arredondar(((t.inteiro_para_real(t_cig)*10)/(365*(24*60))), 2)
    escreva("\nVocê já perdeu ", temp_cig, " anos de vida")
    escreva("\n\n")
  }
}
