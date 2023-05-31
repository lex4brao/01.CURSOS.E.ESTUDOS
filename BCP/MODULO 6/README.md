## Aula 21
### Operadores Ternários
Operadores Ternários são uma forma concisa de expressar uma estrutura condicional em uma única linha de código. Ele permite tomar decisões com base em uma única condição e retornar um valor ou executar uma operação especifica, ou seja, quanto quando uma condicional se consiste somente do comando "if" e else, podemos utilizar um operador ternário reduzindo nossa condição em apenas uma linha de código
**Exemplo de estrutura condicional**
```
if(x%2==0){
  System.out.prinlnt("O valor "+x+" é par")
} else {
  System.out.prinlnt("O valor "+x+" é impar")
}
```

**Exemplo com operadores ternários**
```
 System.out.println((x%2==0)? "O valor "+x+" é par" : "O valor "+x+" é impar");
```
note que com o operador ternário em uma única linha de código montamos toda uma estrutura condicional


## Aula 22

### For each "Para cada"
O for each é uma estrutura de loop é muito utilizada com vetores e para entender utilizar bem esse comando é necessário entender o conceito de vetores e das estruturas de loop, o "FOR EACH" é uma forma mais concisa de escrever o comando for sem a necessidade de um contador por exemplo, porem o comando "for each" não é adequado para inserir dados no array(vetor) para esse propósito utilizasse o comando for convencional... vamos ao exemplo:
**For Convencional**
```
        int[] numeros = new int[10];

        for(int i=0;i<numeros.length;i++) {
            numeros[i]=i*2;    
        } 
        for(int i=0;i<numeros.length;i++) {
            System.out.println(numeros[i]);
        } 
```

**For Each**
```
 int[] numeros = { 0, 1, 2, 3, 4 };
        for (int numero : numeros) {
            System.out.println(numero);
        }
```
Podemos utilizar o For each para percorrer um vetor também como a soma de seus elementos

```
        for (int numero : numeros) {
            soma+= numero;
        }
        System.out.println(soma);
```
acho q a sintaxe do comando deixa claro como ele funciona onde a variável "numero" recebe o valor do elemento do vetor a cada volta passa para o próximo índice iniciando de 0 até o ultimo índice do vetor

## Aula 23
### Debug no Eclipse
