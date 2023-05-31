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
          aux=vet[p]
          vet[p]=vet[pb]
          vet[pb]=aux
        }
      }
    }

    // escrevendo o vetor
    para(p=0;p<u.numero_elementos(vet);p++) {
      escreva(vet[p],"\t")
    }
    //busca binária
    inteiro	chave, ini=0, fim=(	u.numero_elementos(vet)-1), meio=0
    escreva("\n\nDigite o numero que deseja encontrar:  ")
    leia(chave)
    enquanto(ini<=fim) {
      meio=(ini+fim)/2
      se(vet[meio]==chave) {
        pare
      }senao se(vet[meio]<chave) {
        ini=meio+1
      }senao {
        fim=meio-1
      }
    }
    se(vet[meio]==chave) {
      escreva("\nO numero ", chave, " está na posição ", meio)
    }senao {
      escreva("\nNão encontrei o valor ", chave)
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1061; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {ini, 27, 19, 3}-{fim, 27, 26, 3}-{meio, 27, 60, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */