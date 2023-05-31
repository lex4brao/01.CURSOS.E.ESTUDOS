programa
{
    
  funcao inicio()
  {
    inteiro	c=1, n=0, sp=0, si=0
    enquanto(c<=5) {
      escreva("\nDigite o ", c, "º nuemros")
      escreva("\n>>> ")
      leia(n)
      se(n%2==0) {
        sp = sp+n
      }senao {
        si = si+n
      }
      c++
    }
    escreva("\nA soma dos valores pares é ", sp)
    escreva("\nA soma dos valores impares é ", si)
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */