# 02 HTML e CSS Básico

## Aula 1 - Estrutura do Html

### Tags

Tags servem para marcamos o conteúdo no Html. Geralmente abrimos e fechamos a tag após o conteudo ```<h1>Titulo</h1>```
O Html é case insensitive, mas é uma boa prática escrever as tags com letras minúsculas ```<html>```

### Atributos

Os atributos dão informaçoes extras sobre uma tag pra o browser, os atributos são colocados dentro da abertura da tag.

### Pratica criando um link

1. Crie uma pasta chamada chamada pratica1
2. Crie um arquivo chamado indes.html dentro da pasta
3. Dentro do arquivo vamos criar um link para pagina do Google com a tag:

```
<a> Google </a>
```
A tag para link é a tag ```<a>``` porém só abrindo a tag colocando o conteudo e fechando a tag não direcionará o browser para a pagina do google pra isso precisamos colocar um atributo na tag ```<a>``` veja:

```html
<a href="http://google.com>Google</a>
```
com o atributo href podemos direcionar o browser para a pagina do google

### Praque servem as Tags?

- Conteudo
  Elas servem para inserirmos conteúdos como textos, imagens, videos entre outros em nossa pagina, assim como passar informações para o Browser como o titulo do site, linguagens entre outros

- Semântica
  Para dar sentido ao conteúdo da pagina assim que beneficia principalmente aos leitores de tela(acessibilidade) e leitores de códigos como os mecânismos de busca dos Google por exemplo

- Interação com o Css e o Javascript
  É através das tags que conseguimos selecionar elementos da pagina para mudar seu estilo ou comportamento

## Aula 2  - Tags mais comuns

- p
  Marca um paragrafro

- h1, h2, h3, h4, h5, h6
  Marcam os diferentes níveis de titulos

- a
  Marca um link

### Pratica 2

1. Crie uma pasta chamada pratica2
2. Crie um documento chamado index.html dentro da pasta
3. Utilizando as tags de titulos faça o titulo principal coloque o conteúdo: "Curso Online de Html e Css"
4. Faça um subtitulo com o conteúdo "Html"
5. Faça um paragrafo com o conteúdo "Curso de Html, aprenda do zero"
6. Faça um link com para "/hml" com o conteúdo "Curso de Html"
7. Faça o mesmo para Css, subtitulo, paragrafo e link

```html
<h1>Curso Online de Html e Css</h1>
<h2>Html</h2>
<p>Curso de Html, aprenda do zero</p>
<a href="/html">Curso de Html</a>
<p></p>
<h2>Css</h2>
<p>Curso de Css, aprenda do zero</p>
<a href="/css">Curso de Css</a>
```
Uma observação importante é que podemos colocar tags dentro de tags como por exemplo o link dentro do paragrafo

```html
<p><a href="teste">Click Aqui</a> e acesse o curso</p>
```

## Aula 3 - Estrutura inicial do Html

### !DOCTYPE
DOCTYPE é a tag que especifica o tipo do documento sempre começamos um documento html com essa tag, alem disso mostra que é um documento desenvolvido apartir da versão HTML5
```<!DOCTYPE html>```

### Html
A tag html é a tag raiz ela que inicia nosso site pois dentro dela estará todo o conteudo do nosso site, a tag html tem o atributo ```lang``` é com esse atributo que determinamos o idioma do nosso site em nosso caso é o "pt-br"

```html 
<html lang="pt-br">
  Conteudo do Site
</html>
```

### Head
A tag head é a "cabeça" do nosso documento html é através dela que passamos as informações da nossa pagina para o Browser, como o titulo da pagina que aparecerá na aba do browser como o icone do site entre outras informações como tipo de caracteres e adaptações a diferentes tipos de telas

```html
<head>
  <meta charset="UTF-8"> <!-- Tag para determinar os caracteres da pagina e a acentuação apareça sem erros -->
  <title>Titulo da pagina</title> <!-- Taga para determinar o titulo da pagina que aparecerá no browser -->
</head>
```

### Body
Todo o Conteudo visivel no nosso site, este é o corpo do nosso documento html, colocamos os titulos paragrafos links e tudo mais

```html
<body>
  <h1>Titulo do site</h1>
  <p>Este é o corpo do documento html</p>
</body>
```