programa
{
    
  funcao inicio()
  {
    cadeia	nome, nomen="", nomev=""
    inteiro	id, c=0, novo=0, velho=0, soma=0
    enquanto(verdadeiro) {
      escreva("\nCadastro de Amigos - Digite ACABOU para parar")
      escreva("\nNome: ")
      leia(nome)
      se(nome=="acabou" ou nome=="ACABOU") {
        escreva("\nVocê finalizou o programa\n")
        pare
      }
      escreva("Idade: ")
      leia(id)

      se(c==0) {
        novo=id
        velho=id
        nomen=nome
        nomev=nome
      }senao {
        se(id>=velho) {
          velho=id
          nomev=nome
        }
        se(id<=novo) {
          novo=id
          nomen=nome
        }
      }
      c++
      soma+=id
    }
    escreva("\nVocê cadastrou ", c, " amigos")
    escreva("\nO amigo mais velho é ", nomev, " com ", velho, " anos")
    escreva("\nO amigo mais novo é ", nomen, " com ", novo, " anos")
    escreva("\nA média da idade entre os amigos é ", soma/c)
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 971; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */