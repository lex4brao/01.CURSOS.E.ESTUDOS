programa
{
    
  funcao inicio()
  {
    inteiro	c=1, ctot, peso_ref, peso, s_peso=0, sh=0, sm=0
    caracter sx	
    escreva("\nQuantas pessoas deseja cadastrar ")
    escreva("\n>> ")
    leia(ctot)
    escreva("\nQual o peso de referencia")
    escreva("\n>> ")
    leia(peso_ref)

    enquanto(c<=ctot) {
      escreva("\nCadastro ", c, " de ", ctot)
      escreva("\nSexo[H/M]:  ")
      leia(sx)
      escreva("Peso[Kg]:  ")
      leia(peso)
      se(peso>peso_ref) {
        s_peso++
        se(sx=='H' ou sx=='h') {
          sh++
        }senao se(sx=='m' ou sx=='M') {
          sm++
        }
      }
      c++
    }
    escreva("\nForam cadastradas ", s_peso, " pessoas acima do peso ")
    escreva("\n", sh, " Homens estão acima do peso ")
    escreva("\n", sm, " Mulheres estão acima do peso ")
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 418; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */