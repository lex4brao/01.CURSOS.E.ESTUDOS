programa
{
    
  funcao inicio()
  {
    real km
    escreva("\n---------------------")
    escreva("\n EXPRESSO CATALOCO")
    escreva("\n---------------------")
    escreva("\nQual a distancia da sua viagem em km")
    escreva("\n>> ")
    leia(km)
    se(km<200) {
      escreva("\nVocê irá percorrer ", km, "km sua passagem é R$", km*0.5)
    }senao {
      escreva("\nVocê irá percorrer ", km, "km sua passagem é R$", km*0.35)
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */