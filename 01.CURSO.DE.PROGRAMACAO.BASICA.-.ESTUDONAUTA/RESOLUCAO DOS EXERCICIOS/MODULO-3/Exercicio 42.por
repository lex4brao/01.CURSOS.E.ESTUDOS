programa
{
	inclua biblioteca Tipos --> t
    
  funcao inicio()
  {
    cadeia	nome
    inteiro	c=0, cm=0, ch=0, maiorh=0, m1300=0, somah=0, sal
    caracter	resp, sx
    enquanto(verdadeiro) {
      escreva("\nCadastro de Funcionário")
      escreva("\nNome: ")
      leia(nome)
      escreva("Sexo[H/M]: ")
      leia(sx)
      escreva("Salario: R$")
      leia(sal)
      se(sx=='m' ou sx=='M') {
        cm++
        se(sal<=1300) {
          m1300++
        }
      }
      se(sx=='h' ou sx=='H') {
        se(ch==0) {
          maiorh=sal
        }senao {
          se(maiorh<sal) {
            maiorh=sal
          }
        }
        ch++
        somah+=sal
      }
      c++
      escreva("\nDeseja continuar [S/N]:  ")
      leia(resp)
      se(resp=='n' ou resp=='N') {
        pare
      }
    }
    escreva("\n======RESULTADOS========")
    escreva("\n", c, " Funcionários foram cadastrados")
    escreva("\n", cm, " são funcionárias Mulheres")
    escreva("\n", ch, " são funcionários Homens")
    escreva("\nO maior salarios entre os homens é R$", maiorh)
    escreva("\nA média de salários entre os homens é R$", somah/t.inteiro_para_real(ch))
    escreva("\n", m1300, " Mulheres Recebem acima de R$1300,00")
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1188; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */