programa
{
  
  funcao inicio()
  {
    inteiro	x
    escreva("\nDigite quandos Elementos da sequencia Fibonacci você deseja ver:  ")
    leia(x)
    fibonacci(x)
    escreva("\n\n")
  }

  funcao fibonacci(inteiro n)
  {
    inteiro	n1=0, n2=1, n3=0
    escreva("\nSequencia FIBONACCI")
    escreva("\n\t", n1, "\t", n2)
    para(inteiro	p=3;p<=n;p++) {
      n3=n1+n2
      escreva("\t", n3)
      n1=n2
      n2=n3
    }
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 417; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */