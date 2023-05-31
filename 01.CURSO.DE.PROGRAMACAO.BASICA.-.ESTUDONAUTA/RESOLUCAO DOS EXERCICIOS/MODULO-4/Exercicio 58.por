programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	vet[15], p
    escreva("\nMostrando 15 valores da sequencia FIBONACCI")
    vet[0]=0
    vet[1]=1
    para(p=2;p<u.numero_elementos(vet);p++) {
      vet[p]=vet[p-1]+vet[p-2]
    }
    escreva("\n")
    para(p=0;p<u.numero_elementos(vet);p++) {
      escreva("[", p, "]= ", vet[p], " ")
    }
    escreva("\n\n")
  }
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */