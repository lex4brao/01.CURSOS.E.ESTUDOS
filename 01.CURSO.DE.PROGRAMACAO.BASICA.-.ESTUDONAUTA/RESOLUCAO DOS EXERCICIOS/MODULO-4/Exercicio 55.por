programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	vet[10], p
    escreva("\nO dobro do anterior ")
    escreva("\nDigite o primeiro valor ")
    escreva("\n>> ")
    leia(vet[0])
    para(p=0;p<(u.numero_elementos(vet)-1);p++) {
      vet[p+1]= (vet[p]*2)
    }
    para(p=0;p<(u.numero_elementos(vet));p++) {
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
 * @POSICAO-CURSOR = 364; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */