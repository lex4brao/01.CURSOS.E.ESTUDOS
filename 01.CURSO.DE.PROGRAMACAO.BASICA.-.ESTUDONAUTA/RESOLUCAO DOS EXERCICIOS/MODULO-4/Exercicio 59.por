programa
{
    inclua biblioteca Util --> u
    inclua biblioteca Tipos --> t
    inclua biblioteca Matematica --> m
  funcao inicio()
  {
    inteiro	p, soma=0
    real  notas[6],	med 
    escreva("\n------------------------")
    escreva("\n  Desempenho de Alunos")
    escreva("\n------------------------")
    para(p=0;p<u.numero_elementos(notas);p++) {
      escreva("\nDigite a nota do ", p+1, "º Aluno: ")
      leia(notas[p])
      soma+= notas[p]
    }
    med=t.inteiro_para_real(soma)/u.numero_elementos(notas)
    escreva("\n------------------------")
    escreva("\n Desempenho da turma")
    escreva("\n------------------------")
    escreva("\nA média da turma é ", m.arredondar(med,2))
    escreva("\nOs alunos que estão acima da média são ")
    para(p=0;p<u.numero_elementos(notas);p++) {
      se(notas[p]>med) {
        escreva("\nAluno [", p+1,"]")
      }
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 909; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */