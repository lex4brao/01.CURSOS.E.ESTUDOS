programa
{
    inclua biblioteca Tipos --> t
  funcao inicio()
  {
    inteiro	n=0, c=0, soma=0, maior=0
    enquanto(n!=9999) {
      escreva("\nDigite um valor ou 9999 para parar")
      escreva("\n>> ")
      leia(n)
      se(n!=9999) {
        soma+=n
        se(c==0) {
          maior=n
        }senao se(n>maior) {
          maior=n
        }
        c++
      }
    }
    escreva("\nVocê parou o programa")
    escreva("\nForam digitados ", c, " valores")
    escreva("\nA soma dos valores digitados é ", soma)
    escreva("\nA média dos valores digitados é ", soma/t.inteiro_para_real(c))
    escreva("\nO maior valor divgitado é ", maior)
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 674; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */