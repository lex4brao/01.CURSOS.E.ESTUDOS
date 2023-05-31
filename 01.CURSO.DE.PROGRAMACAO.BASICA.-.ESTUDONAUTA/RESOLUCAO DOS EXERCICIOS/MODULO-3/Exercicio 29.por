programa
{
  inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	ini, fim, inc, cont
    escreva("\n-----------------------------")
    escreva("\n\tContador V1.0")
    escreva("\n-----------------------------")
    escreva("\nDigite o inicio da contagem")
    escreva("\n>> ")
    leia(ini)
    escreva("\nDigite o incremento da contagem")
    escreva("\n>> ")
    leia(inc)
    escreva("\nDigite o fim da contagem")
    escreva("\n>> ")
    leia(fim)

    cont = ini
    escreva("\t")
    enquanto(cont<=fim) {
      escreva(cont, " - ")
      cont+= inc
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 515; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */