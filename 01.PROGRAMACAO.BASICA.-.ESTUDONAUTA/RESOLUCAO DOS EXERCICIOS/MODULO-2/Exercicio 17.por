programa
{
    
  funcao inicio()
  {
    inteiro	ano
    escreva("\n--------------")
    escreva("\n É BISSEXTO?")
    escreva("\n--------------")
    escreva("\nDigite um ano ")
    escreva("\n>> ")
    leia(ano)
    se(((ano%4==0) e (ano%100!=0)) ou (ano%400==0) ) {
      escreva("\nO Ano é Bisexto")
    } senao {
      escreva("\nO Ano não é Bisexto")
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 389; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */