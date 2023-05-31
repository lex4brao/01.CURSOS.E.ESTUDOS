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
    par(v)
    impar(v)
  }
  
  funcao par(inteiro	vet[])
  {
    inteiro	spar=0
    para(p=0;p<u.numero_elementos(vet);p++) {
      se(vet[p]%2==0) {
        spar++
      }
    }
    escreva("\nO vetor tem ", spar, " numeros pares nas posições:\n")
    para(p=0;p<u.numero_elementos(vet);p++) {
      se(vet[p]%2==0) {
        escreva("\t", p)
      }
    }
  }

  funcao impar(inteiro	vet[])
  {
    inteiro	simp=0
    para(p=0;p<u.numero_elementos(vet);p++) {
      se(vet[p]%2!=0) {
        simp++
      }
    }
    escreva("\nO vetor tem ", simp, " numeros pares nas posições:\n")
    para(p=0;p<u.numero_elementos(vet);p++) {
      se(vet[p]%2!=0) {
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
 * @POSICAO-CURSOR = 1072; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vet, 25, 21, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */