programa
{
  inclua biblioteca Texto --> txt  
  funcao inicio()
  {
    cadeia	est
   
    escreva("\n-----------------------")
    escreva("\n Sua Naturalidade ")
    escreva("\n-----------------------")
    escreva("\nDigite a sigla do estado em que você nasceu")
    escreva("\n>> ")
    leia(est)
    est = txt.caixa_baixa(est)
   
    se(est=="sp") {
      escreva("\nVocé é Paulista")
    }senao se(est=="rj") {
      escreva("\nVocé é fluminense")
    }senao se(est=="mg") {
      escreva("\nVocé é mineiro")
    }senao se(est=="es") {
      escreva("\nVocé é capixaba")
    }senao se(est=="go") {
      escreva("\nVocé é goiano")
    }senao se(est=="ma") {
      escreva("\nVocé é maranhense") 
    }senao se(est=="rs") {
      escreva("\nVocé é gaúcho")
    }senao se(est=="sc") {
      escreva("\nVocé é barriga-verde")
    }senao se(est=="ba") {
      escreva("\nVocé é baiano")
    } senao {
      escreva("\nEu ainda não conheço sua naturalidade")
    }

    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 994; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */