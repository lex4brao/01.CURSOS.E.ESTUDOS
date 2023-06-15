programa
{
  inclua biblioteca Calendario --> c  
  funcao inicio()
  {
    inteiro	ano_nas
    escreva("\n-----------------------")
    escreva("\n   Serviço Militar V1.0")
    escreva("\n-----------------------")
    escreva("\nEm que ano você nasceu [AAAA]")
    escreva("\n>> ")
    leia(ano_nas)
    se(c.ano_atual()-ano_nas>=18) {
      escreva("\nVocé já é maior de 18 anos espero que você tenha se alistado")
    } senao {
      escreva("\nVocê ainda não completou 18 anos você poderá se alistar em ", ano_nas+18)
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */