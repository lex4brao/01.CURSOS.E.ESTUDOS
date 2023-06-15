programa
{
    
  funcao inicio()
  {
    inteiro	n1, n2, n3, c, f
    escreva("\nDigite quantos elementos da sequencia FIBONACCI deseja")
    escreva("\n>> ")
    leia(f)
    n1=0
    n2=1
    escreva("\n", n1, " - ", n2)
    para(c=1;c<=(f-2);c++) {
      n3= n1+n2
      escreva(" - ", n3)
      n1=n2
      n2=n3
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 344; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */