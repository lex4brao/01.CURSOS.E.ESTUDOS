programa
{
    
  funcao inicio()
  {
    inteiro	n1, n2
    escreva("\n-------------------------")
    escreva("\n ORDEM CRESCENTE")
    escreva("\n-------------------------")
    escreva("\nDigite um numero ")
    escreva("\n>> ")
    leia(n1)
    escreva("\nDigite outro numero")
    escreva("\n>> ")
    leia(n2)
    escreva("\n\nA ordem crescente nos numeros é")
    se(n1>n2) {
      escreva("\n\t", n2)
      escreva("\n\t", n1)
    }senao se(n1<n2) {
      escreva("\n\t", n1)
      escreva("\n\t", n2)
    } senao {
      escreva("\n", n1, " e ", n2, " são iguais")
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 543; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */