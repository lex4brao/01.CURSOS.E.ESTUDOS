programa
{
    
  funcao inicio()
  {
    inteiro	c=1, c_tot, toth=0, totm=0
    cadeia	nome, nvelha=" ", nnova=" ", nvelho=" ", nnovo=" "
    inteiro	id, ivelha=0, inova=0, ivelho=0, inovo=0
    caracter	sx
    escreva("\nQuantas pessoas deseja cadastrar? ")
    escreva("\n>>> ")
    leia(c_tot)
    escreva("\n")
    enquanto(c<=c_tot) {
      escreva("\nCadastro ", c, " de ", c_tot)
      escreva("\n-----------------------------")
      escreva("\nNome: ")
      leia(nome)
      escreva("Idade: ")
      leia(id)
      escreva("Sexo[H/M]: ")
      leia(sx)
      se(sx=='m' ou sx=='M') {
        se(totm==0) {
          nvelha=nome
          nnova=nome
          ivelha=id
          inova=id
        }senao {
          se(id>ivelha) {
            ivelha=id
            nvelha=nome
          }
          se(id<inova) {
            inova=id
            nnova=nome
          }
        }
        totm++
      }senao se(sx=='h' ou sx=='H') {
        se(toth==0) {
          nvelho=nome
          nnovo=nome
          ivelho=id
          inovo=id
        }senao {
          se(id>ivelho) {
            ivelho=id
            nvelho=nome
          }
          se(id<inovo) {
            inovo= id
            nnovo=nome
          }
        }        
        toth++
      }
      c++
    }
    escreva("\nForam cadastradas ", totm, " mulheres")
    escreva("\nA mulher mais velha é ", nvelha, " com ", ivelha, " anos")
    escreva("\nA mulher mais nova é ", nnova, " com ", inova, " anos")
    escreva("\n\nForam cadastrados ", toth, " homens")
    escreva("\nO homem mais velhor é ", nvelho, " com ", ivelho, " anos")
    escreva("\nO homem mais novo é ", nnovo, " com ", inovo, " anos")
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1712; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */