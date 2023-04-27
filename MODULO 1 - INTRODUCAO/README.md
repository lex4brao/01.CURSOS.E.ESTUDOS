# MÓDULO 1 - INTRODUÇÃO

## Aula 1

### A linguagem Java
As principais caracteristicas da linguagem são:
  - Simples
  - Orientada a Objetos
  - Distribuída
  - Multithreades
  - Dinâmica
  - Arquitetura neutra
  - Portável
  - Ótima Performace
  - Robusta
  - Segura

O código java passa por 3 estágios, Codigo Fonte, Código compilado no JavaC (Java Compiler)  que transforma Codigo bytecode que é executado na JVM (Java virtual machina)

### As Aplicações do Java
  - JavaSE
    - Java EE (servidores)
    - Java FX (Desktops)
  - JavaME
    - Embedded, Embarcados
    - Tv, Blu-ray (Ginga TV é em java)
    - Mobile
    - Cartãos
  
Vinicus Senger (Referencias em Embarcados)

### Revista Java (Legado)
  ##### [Java Magazine](https://www.devmedia.com.br/revista-java-magazine/edicoes)
  ##### [easy Java Magazine](https://www.devmedia.com.br/revista-easy-java-magazine)
  ##### [SQL Magazine](https://www.devmedia.com.br/revista-easy-java-magazine)

### Livros
  #### Java Como Programar - Deitel

## Aula 2, 3, 4 

### O Que é necessário para programar
Para aprender a programar em java é necessário ter instalado o JDK (Java Development Kit) eu vou utilizar a versão 17 que é o a ultima versão LTS (Long Term Support) disponivel atualmente 
  ##### [DOWNLOAD AQUI](https://www.oracle.com/java/technologies/downloads/#jdk17-windows)

### Configurando o JDK
Vamos adicionar o JDK na váriaveis de ambiente do windows, nas Variáveis do sistema adicione uma nova variável chamada ```%JAVA_HOME``` como nome da variável, normalmente o JDK fica instalado na pasta "C:\Program Files\Java\jdk-17" e o caminho da pasta será o valor da variável
Adicionando o JDK na variável Path, abra a variável e click em novo, e adiciona o valor ```%JAVA_HOME%\bin```, e pronto agora no cmd vamos verificar se está tudo certo, aperte as teclas ```Win+R``` para abrir o executar, e digite cmd abrindo o CMD use os comandos

```
java --version
```

###### Este será o resultado
```
java 17.0.7 2023-04-18 LTS
Java(TM) SE Runtime Environment (build 17.0.7+8-LTS-224)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.7+8-LTS-224, mixed mode, sharing)
```

###### Logo após use o comando
```
javac --version 
```

###### Este será o resultado
```
javac 17.0.7
```