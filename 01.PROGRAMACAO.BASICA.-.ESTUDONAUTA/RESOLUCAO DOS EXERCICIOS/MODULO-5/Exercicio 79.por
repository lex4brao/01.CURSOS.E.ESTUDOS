programa
{
  
  funcao inicio()
  {
    real	n1, n2, n3, n4
    escreva("\nDigite a nota do 1º Bimestre: ")
    leia(n1)
    escreva("\nDigite a nota do 2º Bimestre: ")
    leia(n2)
    escreva("\nDigite a nota do 3º Bimestre: ")
    leia(n3)
    escreva("\nDigite a nota do 4º Bimestre: ")
    leia(n4)
    escreva("\n\nA média do aluno é ", media (n1, n2, n3, n4))
    escreva("\nO aluno está ", situacao(media (n1, n2, n3, n4)))
    escreva("\n\n")
  }

  funcao real media(real n1, real n2, real n3, real n4)
  {
    retorne((n1+n2+n3+n4)/4)
  }

  funcao cadeia situacao(real med)
  {
    se(med<5) {
      retorne("REPROVADO")
    }senao se(med<7) {
      retorne("EM RECUPERAÇÃO")
    }senao {
      retorne("APROVADO - PARABÉNS")
    }
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 580; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */