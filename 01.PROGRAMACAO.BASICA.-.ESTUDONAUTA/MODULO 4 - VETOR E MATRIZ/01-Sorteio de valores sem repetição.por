programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	vet[6],p=0, aux
    logico	repetido
    enquanto(p<u.numero_elementos(vet)) {
      vet[p]=sorteia(1,60)
      repetido=falso
      para(aux=0;aux<p;aux++) {
        se(vet[p]==vet[aux]) {
          repetido=verdadeiro
          pare
        }
      }
      se(nao(repetido)) {
        p++
      }
    }
    para(p=0;p<u.numero_elementos(vet);p++) {
      escreva(vet[p], "\t")
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vet, 6, 12, 3}-{p, 6, 19, 1}-{aux, 6, 24, 3}-{repetido, 7, 11, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */