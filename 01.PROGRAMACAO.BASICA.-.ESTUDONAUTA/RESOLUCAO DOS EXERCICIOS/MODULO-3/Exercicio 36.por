programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	sort, c=1, c_tot, sort5=0, sort3=00
    escreva("\nVocê deseja sortear quantos numeros")
    escreva("\n>> ")
    leia(c_tot)
    escreva("\nSorteio ",  c_tot, " valores")
    enquanto(c<=c_tot) {
      sort = u.sorteia(0,10)
      escreva("...", sort, "  ")
      se(sort>5) {
        sort5 ++
      }
      se(sort%3==0) {
        sort3++
      }
    	 c++
    }
    escreva("\nForam sorteados ", c_tot, " valores")
    escreva("\n", sort5, " são valores maiores que 5")
    escreva("\n", sort3, " são valores multiplos de 3")
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 334; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */