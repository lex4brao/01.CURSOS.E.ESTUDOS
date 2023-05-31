programa
{
    
  funcao inicio()
  {
    inteiro	fim, cont=0
    escreva("\n---------------------")
    escreva("\nJogo do  Boom")
    escreva("\n---------------------")
    escreva("\nDigite o fim da contagem")
    escreva("\n>> ")
    leia(fim)

    enquanto(cont<=fim) {
      se(cont%4==0 e cont>0) {
        escreva("BOOM!!!!\n")
      } senao {
        escreva(cont, " - ")
      }  
      cont++
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */