programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	n, c=0, maior=0, menor=0, cinco=0
    caracter resp
    faca {
      n=u.sorteia(1,10)
      escreva("\nSortiei o numero ", n)
      se(c==0) {
        maior=n
        menor=n
      }senao {
        se(n>maior) {
          maior=n
        }
        se(n<menor) {
          menor=n
        }
      }
      se(n==5) {
        cinco++
      }
      c++
      escreva("\nDeseja outro sorteio ?[S/N]=>  ")
      leia(resp)
    } enquanto(resp=='s' ou resp=='S')
    escreva("\nForam feito ", c, " sorteios")
    escreva("\nO maior numero sorteado é ", maior)
    escreva("\nO menor numero sorteado é ", menor)
    escreva("\nO numero 5 foir sorteado ", cinco, " vezes ")
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 769; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */