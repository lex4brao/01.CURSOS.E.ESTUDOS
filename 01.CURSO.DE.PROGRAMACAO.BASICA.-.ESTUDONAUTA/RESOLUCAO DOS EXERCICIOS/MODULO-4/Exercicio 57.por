programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	vet[10], p
    escreva("\nFazendo o sorteio de 10 valores\n")
    para(p=0;p<u.numero_elementos(vet);p++) {
      vet[p]= sorteia(1,100)
      escreva("[", p, "]= ", vet[p], " - ")
    }
    escreva("\n\nMostrando os valores em ordem decrescente\n")
    para(p=(u.numero_elementos(vet)-1);p>=0;p--) {
      escreva("[", p, "]= ", vet[p], " - ")      
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */