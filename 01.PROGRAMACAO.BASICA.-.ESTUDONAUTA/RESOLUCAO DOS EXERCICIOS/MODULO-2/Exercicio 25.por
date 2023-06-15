programa
{
  
  funcao inicio()
  {
    inteiro	a, b, c, mai, men, mei

    escreva("\n-------------------")
    escreva("\n ORDEM CRESCENTE")
    escreva("\n-------------------")
    escreva("\n Digite um numero")
    escreva("\n>> ")
    leia(a)
    escreva("\nDigite outro numero")
    escreva("\n>> ")
    leia(b)
    escreva("\nDigite mais um numero")
    escreva("\n>> ")
    leia(c)

    se(a>b) {
      se(c>a) {
        mai = c
        mei= a
        men= b
      }senao se(c>b) {
        mai = a
        mei = c
        men= b 
      } senao {
        mai = a
        mei= b
        men= c
      }
    }senao se(c > b) {
      mai= c
      mei= b
      men= a
    }senao se(c > a) {
      mai = b
      mei = c
      men = a
    } senao {
      mai = b
      mei = a
      men = c
    }

    escreva("\n", men)
    escreva("\n", mei)
    escreva("\n", mai)

    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 695; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */