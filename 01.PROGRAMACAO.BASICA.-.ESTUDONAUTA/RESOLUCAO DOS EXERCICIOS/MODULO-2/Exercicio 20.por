programa
{
  inclua biblioteca Calendario --> c  
  funcao inicio()
  {
    inteiro din
    escreva("\n---------------------------------------")
    escreva("\n CINEMA KINA DA ESFERA")
    escreva("\n---------------------------------------")
    escreva("\nO filme inicias as 04: 00hrs")
    escreva("\nO ingresso é R$75,00")
    escreva("\nQual o valor em dinheiro ")
    escreva("\n>> R$")
    leia(din)
    se(c.hora_atual(falso)<= 2) {
      escreva("\nO filme irá começar as 4:00hrs")
      se(din>= 75) {
        escreva("\nSeu ingresso está disponivel seu troco é R$", din-75)
      } senao {
        escreva("\nInfelizmente o valor não é suficiente para comprar o ingresso")
      }
    } senao {
      escreva("\nInfelizmente a seção já começou, não podemos vender ingresso")
    }
    
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */