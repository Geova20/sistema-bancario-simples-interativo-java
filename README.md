# Desafio Java: Conta Bancária

## Descrição

Este projeto é um desafio prático em Java do curso "Java: Criando a sua primeira aplicação" da Formação "Java e Orientação a Objetos" do ONE | Fase 3 - Especialização Back-End,
que simula um sistema simples de manipulação de saldo bancário. O usuário pode realizar as seguintes operações:

* **Consultar saldo:** Exibe o saldo atual da conta.
* **Transferir valor:** Permite transferir um valor para outra conta, verificando se há saldo suficiente.
* **Receber valor:** Permite adicionar um valor ao saldo da conta.

## Como executar o projeto

Para executar o projeto e experimentar as funcionalidades do sistema de manipulação de saldo, siga estes passos:

**1. Instalação do Java:**

* Se você ainda não possui o Java instalado em seu computador, faça o download da versão mais recente do Java SE Development Kit (JDK) para o seu sistema operacional no site oficial da Oracle: [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/).
* Siga as instruções de instalação do JDK.

**2. Baixe o código:**

* Acesse o repositório do projeto no GitHub: [https://github.com/Geova-20/sistema-bancario-simples-interativo-java.git](https://github.com/Geova20/sistema-bancario-simples-interativo-java.git)
* Clique no botão verde "Code" e escolha a opção "Download ZIP".
* Descompacte o arquivo ZIP em uma pasta de sua preferência.

**3. Execute o projeto:**

* **Opção 1: Executar pelo terminal:**
    * Abra um terminal ou prompt de comando e navegue até a pasta onde você descompacou o projeto.
    * Execute os seguintes comandos:
        ```bash
        javac Desafio.java Scanner.java
        java Desafio
        ```
* **Opção 2: Executar em um IDE (como Eclipse ou IntelliJ):**
    * Importe o projeto para o seu IDE.
    * Configure o caminho para o JDK no IDE.
    * Execute o projeto a partir do IDE.

**4. Interaja com o sistema:**

* O programa irá exibir um menu com as opções disponíveis: consultar saldo, transferir valor e receber valor.
* Digite o número da opção desejada e pressione Enter para realizar a operação.
* Siga as instruções do programa para inserir os valores necessários.

## Funcionalidades

* **Entrada de dados:** O programa utiliza a classe `Scanner` para receber a entrada do usuário.
* **Condicionais:** O programa utiliza condicionais (`if`, `else if`, `else`) para controlar o fluxo de execução e realizar as operações de acordo com a opção escolhida pelo usuário.
* **Operações matemáticas:** O programa utiliza operadores matemáticos para realizar as operações de transferência e recebimento de valores.
* **Saída de dados:** O programa utiliza a função `System.out.println()` para exibir mensagens e resultados para o usuário.

## Aprendizados

* **Introdução à programação em Java:** Este projeto permitiu explorar conceitos básicos da linguagem Java, como variáveis, tipos de dados, operadores, condicionais e entrada/saída de dados.
* **Lógica de programação:** O desenvolvimento do projeto exigiu a aplicação de lógica de programação para solucionar problemas e implementar as funcionalidades desejadas.
* **Boas práticas de programação:** O projeto incentivou a utilização de boas práticas de programação, como a organização do código, a utilização de nomes descritivos para variáveis e funções, e a criação de comentários para documentar o código.

## Tecnologias Utilizadas

* **Java:** Linguagem de programação utilizada para desenvolver o projeto.
* **Scanner:** Classe da biblioteca padrão do Java utilizada para receber a entrada do usuário.
* **System.out.println():** Função da biblioteca padrão do Java utilizada para exibir mensagens e resultados para o usuário.

## Observações

* Este projeto é um exemplo simples e serve como base para o aprendizado de conceitos básicos de programação em Java.
* O código pode ser adaptado e expandido para incluir novas funcionalidades e atender a diferentes necessidades.

## Autor

[Geová](https://www.linkedin.com/in/geov%C3%A1-junior-hermenegildo/)

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](https://github.com/Geova20/sistema-bancario-simples-interativo-java/blob/master/LICENSE) para mais detalhes.
