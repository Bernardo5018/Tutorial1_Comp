# Tutorial 1 – Hello Kotlin, Hello Mobile Android World!

**Curso:** LEIC
**Aluno:** Bernardo Rocha 
**Data:** 15/03/2026 
**Repository URL:** [Preencher]  

---

## 1. Introdução

Este relatório descreve o desenvolvimento do trabalho prático **TP1**, realizado no âmbito da unidade curricular de **Computação Móvel**, com recurso à linguagem **Kotlin**. O principal objetivo deste trabalho foi consolidar conceitos fundamentais de programação, desde estruturas básicas da linguagem até princípios de programação orientada a objetos.

O projeto inclui um conjunto de exercícios introdutórios e uma pequena aplicação de consola denominada **Virtual Library**, que simula a gestão de livros e membros de uma biblioteca. Através deste trabalho foi possível praticar a organização de código por packages, a criação de classes, herança, encapsulamento, estruturas de controlo, manipulação de arrays e interação com o utilizador em consola.

---

## 2. Visão Geral do Sistema

O sistema desenvolvido está dividido em duas partes principais:

1. **Exercícios iniciais em Kotlin**, destinados a explorar a sintaxe e funcionalidades base da linguagem.
2. **Módulo Virtual Library**, que representa a parte mais estruturada do trabalho e aplica conceitos de orientação a objetos.

De forma resumida, o projeto permite:

- gerar e apresentar sequências numéricas;
- efetuar operações aritméticas, lógicas e binárias com entrada do utilizador;
- calcular e mostrar alturas sucessivas de saltos com redução progressiva;
- gerir livros de uma biblioteca, incluindo empréstimos, devoluções, pesquisa por autor e registo de membros.

---

## 3. Arquitetura e Desenho

O projeto foi organizado por **packages**, de forma a separar claramente cada exercício e o módulo principal da biblioteca virtual.

### Estrutura principal

```text
TP1/
├── pom.xml
├── src/
│   └── main/
│       └── kotlin/
│           ├── Main.kt
│           └── cm/
│               ├── exer_1/
│               │   └── exer_1.kt
│               ├── exer_2/
│               │   └── exer_2.kt
│               ├── exer_3/
│               │   └── exer_3.kt
│               └── virtual_library/
│                   ├── book.kt
│                   ├── DigitalBook.kt
│                   ├── PhysicalBook.kt
│                   ├── Library.kt
│                   ├── LibrayManager.kt
│                   └── Main.kt
```

### Decisões de desenho

- **Separação por packages:** cada exercício foi isolado num package próprio para facilitar leitura e manutenção.
- **Classe abstrata `Book`:** usada como base para representar características comuns a todos os livros.
- **Herança:** as classes `DigitalBook` e `PhysicalBook` especializam a classe `Book`.
- **Encapsulamento:** o atributo de cópias disponíveis é controlado através de lógica própria.
- **Gestão centralizada:** a classe `Library` concentra as operações principais sobre livros e membros.

Esta estrutura permite um código mais modular, organizado e fácil de expandir no futuro.

---

## 4. Implementação

### 4.1 Exercício 1

No primeiro exercício foi feita a geração dos **50 primeiros quadrados perfeitos** usando três abordagens diferentes da linguagem Kotlin:

- `IntArray`
- `map` com intervalos
- `Array`

Este exercício permitiu praticar:

- criação de arrays;
- expressões lambda;
- transformação de coleções;
- apresentação de resultados com `joinToString`.

### 4.2 Exercício 2

O segundo exercício corresponde a uma **calculadora em consola**, capaz de processar diferentes tipos de operadores:

- aritméticos: `+`, `-`, `*`, `/`
- lógicos: `&&`, `||`, `!`
- deslocamentos binários: `shl`, `shr`

Foram também utilizados:

- leitura de dados com `Scanner`;
- estrutura `when` para seleção de operações;
- tratamento de exceções com `try/catch/finally`;
- formatação de resultados em decimal e hexadecimal.

### 4.3 Exercício 3

Neste exercício foi usada a função `generateSequence` para calcular a sequência de alturas de saltos sucessivos, assumindo uma redução de **60% por salto**. Apenas foram consideradas alturas iguais ou superiores a **1 metro**.

Este exercício serviu para aplicar:

- geração de sequências;
- filtragem de valores;
- limitação do número de elementos;
- formatação de saída.

### 4.4 Virtual Library

A parte principal do trabalho foi a implementação de um pequeno sistema de biblioteca virtual.

#### Classe `Book`

A classe abstrata `Book` representa um livro genérico e contém:

- título;
- autor;
- ano de publicação;
- número de cópias disponíveis.

Além disso, calcula automaticamente uma categoria temporal do livro:

- **Classic** – anterior a 1980;
- **Modern** – entre 1980 e 2010;
- **Contemporary** – posterior a 2010.

#### Classe `DigitalBook`

Representa livros digitais e acrescenta:

- tamanho do ficheiro;
- formato.

#### Classe `PhysicalBook`

Representa livros físicos e acrescenta:

- peso;
- indicação de capa dura.

#### Classe `Library`

Esta classe gere a coleção da biblioteca e disponibiliza operações como:

- adicionar livros;
- emprestar livros;
- devolver livros;
- mostrar catálogo;
- pesquisar por autor;
- registar membros;
- listar membros.

#### Classe `LibraryMember`

Foi utilizada uma `data class` para representar os membros da biblioteca de forma simples e adequada ao contexto.

#### Ficheiro `Main.kt` da biblioteca

O ficheiro principal demonstra o funcionamento do sistema ao:

- criar livros;
- adicionar livros à biblioteca;
- definir cópias disponíveis;
- efetuar empréstimos e devoluções;
- pesquisar por autor;
- registar membros.

---

## 5. Estratégia de Testes e Validação

A validação do projeto foi feita sobretudo através de **execução em consola** e observação direta dos resultados produzidos por cada módulo.

Foram verificados os seguintes cenários:

- geração correta dos quadrados perfeitos;
- execução correta das operações da calculadora;
- deteção de divisão por zero e entradas inválidas;
- geração correta da sequência de alturas no exercício 3;
- comportamento esperado da biblioteca ao emprestar e devolver livros;
- atualização correta do número de cópias disponíveis;
- pesquisa por autor e apresentação de membros registados.

### Casos limite considerados

- tentativa de divisão por zero;
- introdução de operador inválido na calculadora;
- tentativa de empréstimo de livro sem cópias disponíveis;
- definição de número negativo de cópias.

### Limitações conhecidas

- não existem testes automáticos com JUnit, apesar de o projeto possuir dependências preparadas para esse efeito;
- a pesquisa por autor faz correspondência direta, sem ignorar maiúsculas/minúsculas;
- o sistema da biblioteca é apenas demonstrativo e não utiliza persistência de dados.

---

## 6. Instruções de Utilização

### Requisitos

- Java JDK instalado;
- Kotlin configurado no projeto;
- Maven;
- IntelliJ IDEA recomendado.

### Como executar

1. Abrir o projeto no **IntelliJ IDEA**.
2. Garantir que o Maven sincroniza corretamente as dependências.
3. Executar o ficheiro pretendido, consoante o exercício ou módulo a testar.

### Exemplos

- Para testar os exercícios iniciais, executar:
  - `cm.exer_1.exer_1.kt`
  - `org.example.cm.exer_2.exer_2.kt`
  - `cm.exer_3.exer_3.kt`
- Para testar a biblioteca virtual, executar:
  - `cm.virtual_library.Main.kt`

---

## 7. Estratégia de Prompting

Durante o desenvolvimento, foram utilizados pedidos orientados para apoio em:

- estruturação do relatório;
- explicação de conceitos de Kotlin;
- organização do projeto por packages;
- descrição funcional do sistema para documentação de GitHub.

Os prompts utilizados focaram-se sobretudo em:

- transformar código e funcionalidades em texto descritivo;
- melhorar a clareza da documentação;
- adaptar a linguagem para português;
- estruturar o conteúdo segundo os tópicos pedidos pelo enunciado.

---

## 8. Fluxo de Trabalho Autónomo do Agente

A assistência automática foi utilizada como apoio à organização e redação, nomeadamente para:

- identificar os principais módulos do projeto;
- resumir o papel de cada ficheiro;
- converter informação técnica em linguagem apropriada para relatório;
- estruturar o documento final de forma coerente.

O agente contribuiu principalmente na parte de documentação, não substituindo a implementação nem a validação manual do projeto.

---

## 9. Verificação de Artefactos Gerados por IA

Todo o conteúdo gerado com apoio de IA foi revisto manualmente antes de ser incluído neste relatório.

A verificação incidiu sobre:

- correspondência entre a descrição e o código real do projeto;
- nomes corretos das classes e ficheiros;
- coerência técnica da explicação;
- adequação da linguagem ao contexto académico.

Sempre que necessário, o texto foi ajustado para refletir com precisão a implementação existente.

---

## 10. Avaliação Humana vs. Contribuição da IA

### Trabalho realizado principalmente pelo estudante

- implementação do código-fonte em Kotlin;
- definição da lógica dos exercícios;
- criação das classes da biblioteca virtual;
- execução, testes e validação do comportamento do programa;
- organização prática do projeto no ambiente de desenvolvimento.

### Trabalho assistido por IA

- apoio à redação do relatório;
- melhoria da estrutura textual para GitHub;
- reformulação e organização da documentação;
- apoio pontual na descrição das funcionalidades do projeto.

---

## 11. Riscos e Comportamento Responsável

A utilização de IA na documentação apresenta alguns riscos, nomeadamente:

- descrições demasiado genéricas;
- interpretação incorreta de partes do código;
- inclusão de afirmações que não correspondam exatamente à implementação.

Para reduzir estes riscos, foram adotadas as seguintes medidas:

- revisão manual de todo o conteúdo;
- comparação direta entre o relatório e os ficheiros do projeto;
- remoção ou correção de detalhes não confirmados no código.

Desta forma, procurou-se garantir rigor técnico e responsabilidade no uso da ferramenta.

---

## 12. Controlo de Versões e Histórico de Commits

O projeto foi preparado para integração com **GitHub**, permitindo versionamento e acompanhamento da evolução do trabalho.

O controlo de versões é importante para:

- registar alterações ao longo do desenvolvimento;
- manter histórico de progresso;
- facilitar correções e melhorias futuras;
- apoiar a documentação do processo de trabalho.

Idealmente, o histórico de commits deve refletir etapas como:

- criação da estrutura inicial do projeto;
- implementação dos exercícios;
- desenvolvimento da biblioteca virtual;
- revisão final e documentação.

---

## 13. Dificuldades e Lições Aprendidas

Ao longo do desenvolvimento, destacam-se as seguintes dificuldades:

- adaptação inicial à sintaxe de Kotlin;
- organização correta de packages e ficheiros;
- gestão de diferentes tipos de dados na calculadora;
- aplicação de herança e classes abstratas de forma correta;
- estruturação do projeto de forma clara para documentação.

Como principais aprendizagens, este trabalho permitiu consolidar:

- bases da linguagem Kotlin;
- utilização de coleções e estruturas funcionais;
- tratamento de exceções;
- princípios de programação orientada a objetos;
- importância de documentar corretamente um projeto técnico.

---

## 14. Melhorias Futuras

Como evolução futura do projeto, poderiam ser adicionadas as seguintes melhorias:

- testes automáticos com **JUnit**;
- interface gráfica em vez de apenas consola;
- persistência de dados em ficheiro ou base de dados;
- pesquisa de livros mais avançada;
- autenticação ou gestão real de utilizadores;
- melhoria da consistência de nomes de packages e ficheiros.

Estas extensões tornariam o projeto mais robusto e mais próximo de uma aplicação real.

---

## 15. Divulgação de Uso de IA (Obrigatório)

Durante a elaboração da documentação deste projeto foi utilizada inteligência artificial como ferramenta de apoio, nomeadamente para:

- estruturar o relatório;
- reformular texto técnico;
- melhorar a clareza da descrição das funcionalidades;
- organizar o conteúdo em formato adequado para GitHub.

A IA foi usada apenas como apoio. A responsabilidade final pelo conteúdo, pela revisão do texto e pela validação técnica do relatório permanece totalmente do estudante.

---

## Conclusão

O desenvolvimento deste trabalho permitiu aplicar, na prática, vários conceitos fundamentais de Kotlin e de programação orientada a objetos. Para além dos exercícios introdutórios, a implementação da **Virtual Library** mostrou como estruturar um pequeno sistema modular e funcional, com classes bem definidas e operações simples de gestão.

No seu conjunto, o projeto constituiu uma base importante para trabalhos futuros na área da computação móvel e do desenvolvimento em Kotlin.
