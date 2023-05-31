programa
{
    
  funcao inicio()
  {
    inteiro	c=1, c_tot, id, idv=0, idn=0
    cadeia	nome, nomev=" ", nomen=" "
    escreva("\nQuantas pessoas você deseja cadastrar? ")
    escreva("\n>>> ")
    leia(c_tot)
    enquanto(c<=c_tot) {
      escreva("\n----------------------------------")
      escreva("\nCadastro de pessoas ", c, " de ", c_tot)
      escreva("\n----------------------------------")
      escreva("\nNome:  ")
      leia(nome)
      escreva("Idade:  ")
      leia(id)
      se(c==1) {
        idv=id
        idn=id
        nomev=nome
        nomen=nome
      }senao {
        se(id>idv) {
          idv=id
          nomev=nome
        }
        se(id<idn) {
          idn=id
          nomen=nome
        }
      }
      c++
    }
    escreva("\n-------------------------------------------------------------------")
    escreva("\nA pessoa mais velha cadastrada é ", nomev, " com ", idv, " anos")
    escreva("\nA pessoa mais nova cadastrada é ", nomen, " com ", idn, " anos")
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 989; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */