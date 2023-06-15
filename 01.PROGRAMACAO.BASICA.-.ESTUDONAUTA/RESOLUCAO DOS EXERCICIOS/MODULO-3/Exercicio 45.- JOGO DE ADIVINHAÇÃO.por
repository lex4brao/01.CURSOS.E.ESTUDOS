programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	n, sort, c=1
    escreva("\n---------------------")
    escreva("\nJOGO DA ADIVINHAÇÃO")
    escreva("\n---------------------")
    escreva("\nPensei em um numero entre 1 á 10")
    escreva("\nVocê tem 3 chances de acertar")
    sort = u.sorteia(1,10)
    faca {
      escreva("\n\nTentativa ", c, " de 3")
      escreva("\nDigite um numero: ")
      leia(n)
      se(n>sort) {
        escreva("E R R O U ! ! ! ! ")
        escreva("\nTente um numero menor")
      }senao se(n<sort) {
        escreva("E R R O U ! ! ! ! ")
        escreva("\nTente um numero maior")
      }senao {
        pare
      }
      c++
    } enquanto(c<=3)
    se(n==sort) {
      escreva("\n\nP A R A B E N S")
      escreva("\nVocê Aceitou o numero que eu pensei")
      escreva("\nVoce acertou na ", c, "º chance")
    }senao {
      escreva("\n\n---G A M E  O V E R-----")
      escreva("\nVoce não acertou o numero que eu pensei")
      escreva("\nO numero q eu pensei é ", sort)
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */