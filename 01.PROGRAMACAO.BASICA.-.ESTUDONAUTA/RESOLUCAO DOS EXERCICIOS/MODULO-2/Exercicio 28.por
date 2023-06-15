programa
{
    
  funcao inicio()
  {
    real mm
    inteiro	op

    escreva("\n----------------------------")
    escreva("\nConversor de medidas V2.0")
    escreva("\n----------------------------")
    escreva("\nDigite a medida de milimetros")
    escreva("\n>> ")
    leia(mm)
    escreva("\nDigite escolha a unidade de converção")
    escreva("\n\t [1] Polegadas")
    escreva("\n\t [2] Pés")
    escreva("\n\t [3] Jardas")
    escreva("\n>> ")
    leia(op)

    escolha(op) 
    {
      caso 1:
        escreva("\n", mm, "mm é ", (mm*0.0393701), "polegadas")
      pare
      caso 2:
        escreva("\n", mm, "mm é ", (mm*0.00328084), " pés")
      pare
      caso 3:
        escreva("\n", mm, "mm é ", (mm*0.0010936133333333), "jardas")
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
 * @POSICAO-CURSOR = 648; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */