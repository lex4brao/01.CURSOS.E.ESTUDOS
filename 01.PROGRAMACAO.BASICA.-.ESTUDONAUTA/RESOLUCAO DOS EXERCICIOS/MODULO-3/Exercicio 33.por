programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro c=1, sort, soma=0, tot
    escreva("\nQuantos numeros você deseja sortear")
    escreva("\n>>> ")
    leia(tot)
    enquanto(c<=tot) {
      sort = u.sorteia(1, 10)
      escreva("\n", c, "º numero soreteado é ", sort)
      soma = soma + sort
      c++
    }
    escreva("\n\nA soma dos numeros sorteados é ", soma)
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 240; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */