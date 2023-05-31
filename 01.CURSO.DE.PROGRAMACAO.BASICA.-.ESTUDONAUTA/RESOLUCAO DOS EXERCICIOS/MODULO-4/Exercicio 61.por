programa
{
    inclua biblioteca Util --> u
    inclua biblioteca Texto --> txt
  funcao inicio()
  {
    cadeia	vet[10]
    inteiro	p, tot5=0, totpl=0, tots=0
    caracter	pl=' '
    escreva("\n------------------------------")
    escreva("\n  Cadastro de nome de Amigos")
    escreva("\n------------------------------")
    para(p=0;p<u.numero_elementos(vet);p++) {
      escreva("\nDigide o ", p+1, "º nome:  ")
      leia(vet[p])
    }
    escreva("\n------------------------------------------------")
    escreva("\n  Analizando nomes que tem menos de 5 letras")
    escreva("\n------------------------------------------------")
    para(p=0;p<u.numero_elementos(vet);p++) {
      vet[p] = txt.caixa_alta(vet[p])
      se(txt.numero_caracteres(vet[p])<5) {
        escreva("\n   - ", vet[p])
        tot5++
      }
    }
    escreva("\n\nTotal de ", tot5, " amigos\n")
    escreva("\n------------------------------------------------")
    escreva("\n  Analizando nomes que começam com vogal")
    escreva("\n------------------------------------------------")
    para(p=0;p<u.numero_elementos(vet);p++) {
      pl= txt.obter_caracter(vet[p],0)
      se((pl=='A') ou (pl=='E') ou (pl=='I') ou (pl=='O') ou (pl=='U')) {
        escreva("\n   - ", vet[p])
      }
    }
    escreva("\n\nTotal de ", totpl, " amigos\n")
    escreva("\n------------------------------------------------")
    escreva("\n  Analizando nomes que contem a letra S")
    escreva("\n------------------------------------------------")
    para(p=0;p<u.numero_elementos(vet);p++) {
      se(txt.posicao_texto("S", vet[p], 0)!=-1) {
        escreva("\n   - ", vet[p])
        tots++
      }
    }
    escreva("\n\nTotal de ", tots, " amigos\n")
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 119; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */