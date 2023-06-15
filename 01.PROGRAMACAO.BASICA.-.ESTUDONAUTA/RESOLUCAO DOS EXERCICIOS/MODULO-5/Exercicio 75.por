programa
{
  inclua biblioteca Util --> u
  inteiro	p=0
  funcao inicio()
  {
    escreva("\n------------------------")
    escreva("\n ANÁLISE DE VETOR")
    escreva("\n------------------------")
    vetor()
    escreva("\n\n")
  }
  funcao vetor()
  {
    inteiro	v[10]
    escreva("\n")
    para(p=0;p<u.numero_elementos(v);p++) {
      v[p]= sorteia(1,100)
      escreva(v[p],"\t")
    }
    maior(v)
    menor(v)
  }
  
  funcao maior(inteiro	vet[])
  {
    inteiro	mai=0
    para(p=0;p<u.numero_elementos(vet);p++) {
      se(p==0) {
        mai=vet[p]
      }senao {
        se(vet[p]>mai) {
          mai=vet[p]
        }
      }
    }
    escreva("\nO maior valor do vetor é ", mai)
    escreva("\nNa(s) posição(ões): \n")
    para(p=0;p<u.numero_elementos(vet);p++) {
      se(vet[p]==mai) {
        escreva("\t", p)
      }
    }
  }

  funcao menor(inteiro	vet[])
  {
    inteiro	men=0
    para(p=0;p<u.numero_elementos(vet);p++) {
      se(p==0) {
        men=vet[p]
      }senao {
        se(vet[p]<men) {
          men=vet[p]
        }
      }
    }
    escreva("\nO menor valor do vetor é ", men)
    escreva("\nNa(s) posição(ões): \n")
    para(p=0;p<u.numero_elementos(vet);p++) {
      se(vet[p]==men) {
        escreva("\t", p)
      }
    }
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 415; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */