programa
{
    
  funcao inicio()
  {
    real	n1, n2
    caracter	op
    escreva("\n------------------")
    escreva("\nCalculadora V1.0")
    escreva("\n------------------")
    escreva("\nEscolha a Operação")
    escreva("\n\t [1] [+] - Soma")
    escreva("\n\t [2] [-] - Subtração")
    escreva("\n\t [3] [*] - Multiplicação")
    escreva("\n\t [4] [/] - Divisão")
    escreva("\nDigite sua escolha >>> ")
    leia(op)
    escreva("\nDigite o primeiro numero")
    escreva("\n>>")
    leia(n1)
    escreva("\nDigite o segundo numero")
    escreva("\n>>")
    leia(n2)

    escolha(op) 
    {
      caso '1': caso '+':
        escreva("\n", n1, " + ", n2, " = ", n1+n2)
      pare
      caso '2': caso '-':
        escreva("\n", n1, " - ", n2, " = ", n1-n2)
      pare
      caso '3': caso '*':
        escreva("\n", n1, " * ", n2, " = ", n1*n2)
      pare
      caso '4': caso '/':
        escreva("\n", n1, " / ", n2, " = ", n1/n2)
      pare
    }

    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 980; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */