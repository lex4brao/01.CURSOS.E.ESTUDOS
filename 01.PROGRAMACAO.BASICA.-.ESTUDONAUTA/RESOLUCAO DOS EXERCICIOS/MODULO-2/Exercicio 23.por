programa
{
  inclua biblioteca Calendario --> c  
  funcao inicio()
  {
    inteiro	ano_nas, id
    escreva("\n------------------------------")
    escreva("\n Serviço Militar V2.0")
    escreva("\n------------------------------")
    escreva("\nEm que ano você nasceu [AAAA]")
    escreva("\n>> ")
    leia(ano_nas)
    id = c.ano_atual() - ano_nas
    se(id>18) {
      escreva("\nEspero que você tenha se Alistado")
      escreva("\nVoce deveria ter se Alistado em ", ano_nas+18)
    }senao se(id<18) {
      escreva("\nVocê ainda nao completou 18 anos")
      escreva("\nVocê deverá se Alistar em ", ano_nas+18)
    } senao {
      escreva("\nVocê tem 18 anos completos")
      escreva("\n Aliste-se o mais breve possivel")
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 759; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */