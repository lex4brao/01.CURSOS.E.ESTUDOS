programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	vet[10], p, aux, pb //pb = posição bubbble
    para(p=0;p<u.numero_elementos(vet);p++) {
      vet[p]= sorteia(1,40)
    }

    //Bubble-sort
    para(p=0;p<(u.numero_elementos(vet)-1);p++) {
      para(pb=p+1;pb<u.numero_elementos(vet);pb++) {
        se(vet[p]>vet[pb]) {
          aux=vet[pb]
          vet[pb]=vet[p]
          vet[p]=aux
        }
      }
    }
    
    // escrevendo o vetor
    para(p=0;p<u.numero_elementos(vet);p++) {
      escreva(vet[p],"\t")
    }
    escreva("\n")
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 415; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vet, 6, 12, 3}-{p, 6, 21, 1}-{aux, 6, 24, 3}-{pb, 6, 29, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */