programa
{
   inclua biblioteca Tipos --> t 
  funcao inicio()
  {
    inteiro	c=1, np=0, sp=0, ni=0, si=0, n
    enquanto(c<=5) {
      escreva("\nDigite o ", c, "º valor")
      escreva("\n>>> ")
      leia(n)
      se(n%2==0) {
        sp=sp+n
        np++
      }senao se(n%2!=0) {
        si = si+n
        ni ++
      }
      c++
    }
    
    escreva("\nForam digitados ", np, " numeros pares e a média dele é ", sp/t.inteiro_para_real(np))
    escreva("\nForam digitados ", ni, " numeros impares e a média dele é ", si/t.inteiro_para_real(ni))
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 499; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */