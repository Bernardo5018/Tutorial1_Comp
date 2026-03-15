# Portefólio de Projetos — Computação Móvel e Kotlin

**Curso:** LEIC  
**Aluno:** Bernardo Rocha  
**Data:** 15/03/2026  
**URL do Repositório:** ______________________________________

---

## 1. Introdução

Este ficheiro reúne, num único documento, a documentação dos vários projetos desenvolvidos no âmbito das primeiras atividades de **Computação Móvel** e **Kotlin**. A junção destes projetos num só ficheiro permite apresentar o trabalho de forma mais organizada no GitHub, facilitando a consulta global das aplicações e exercícios realizados. O conteúdo foi consolidado a partir dos quatro relatórios enviados: o projeto **Hello World V2**, a app opcional de **informação do dispositivo Android**, o projeto **TP1 / Primeiros Exercícios em Kotlin**, e uma **aplicação Android com navegação em catálogo e detalhe**. fileciteturn0file3 fileciteturn0file0 fileciteturn0file2 fileciteturn0file1

No conjunto, estes trabalhos permitiram consolidar competências fundamentais, como:
- desenvolvimento de interfaces Android com **Kotlin** e **XML Views**;
- estruturação de projetos no **Android Studio** e em **Kotlin puro**;
- utilização de componentes gráficos, layouts e navegação entre ecrãs;
- aplicação de conceitos de programação orientada a objetos;
- organização de documentação técnica para apresentação em GitHub. fileciteturn0file3 fileciteturn0file0 fileciteturn0file2 fileciteturn0file1

---

## 2. Visão Geral dos Projetos

### 2.1 Hello World V2

Este projeto corresponde a uma aplicação Android introdutória, desenvolvida em **Kotlin**, com interface definida em **XML**. A aplicação apresenta um ecrã principal com elementos visuais básicos, incluindo textos, imagem e um calendário, servindo para compreender a estrutura inicial de uma app Android e a ligação entre a `MainActivity` e os ficheiros de layout. Também inclui adaptação entre **portrait** e **landscape**. fileciteturn0file3

### 2.2 System Info App (Opcional)

A segunda aplicação consiste numa versão opcional do tutorial, cujo objetivo é apresentar no ecrã informações reais do dispositivo Android, como fabricante, modelo, marca, versão do Android, SDK e outros dados recolhidos através da classe `Build`. Trata-se de uma app simples com um único ecrã, mas bastante útil para consolidar a ligação entre interface gráfica e dados do sistema. fileciteturn0file0

### 2.3 TP1 — Primeiros Exercícios em Kotlin / Virtual Library

Este projeto reúne vários exercícios introdutórios em Kotlin e uma aplicação de consola chamada **Virtual Library**. Os exercícios incluem geração de quadrados perfeitos, uma calculadora com operações aritméticas, lógicas e binárias, e uma simulação de saltos sucessivos. Já a **Virtual Library** aplica conceitos de orientação a objetos, com classes abstratas, herança, encapsulamento e gestão simples de livros e membros. fileciteturn0file2

### 2.4 Aplicação Android com AI / Catálogo e Detalhe

Este projeto corresponde a uma aplicação Android mais estruturada, com navegação entre ecrãs, lista de elementos e visualização de detalhe. A solução foi organizada de forma modular, recorrendo a componentes como adapters, modelos de dados, navegação e bibliotecas como **Retrofit** para comunicação com API e **Coil** para carregamento de imagens. O objetivo principal foi consolidar o desenvolvimento de aplicações móveis mais completas e organizadas. fileciteturn0file1

---

## 3. Arquitetura e Organização

Os projetos apresentam diferentes níveis de complexidade, mas seguem uma lógica comum de organização modular e separação de responsabilidades. Nos projetos Android, a estrutura base assenta em ficheiros como `MainActivity.kt`, `activity_main.xml`, `AndroidManifest.xml`, e recursos em `res/values` e `res/drawable`. No caso da aplicação com catálogo e detalhe, a organização estende-se a adapters, modelos e componentes de rede. fileciteturn0file3 fileciteturn0file0 fileciteturn0file1

No projeto **TP1**, a estrutura foi organizada por **packages**, separando cada exercício e o módulo **Virtual Library**, com classes como `Book`, `DigitalBook`, `PhysicalBook`, `Library` e `Main.kt`. Esta abordagem facilitou a manutenção do código e a aplicação de princípios de programação orientada a objetos. fileciteturn0file2

Em termos de design, foram adotadas decisões adequadas ao nível de cada trabalho:
- uso de uma única `Activity` nos projetos introdutórios Android;
- separação entre interface e lógica, mantendo layouts em XML e comportamento em Kotlin;
- utilização de `ConstraintLayout` para posicionamento flexível dos componentes;
- modularização por packages, classes e camadas nos projetos mais completos. fileciteturn0file3 fileciteturn0file0 fileciteturn0file2 fileciteturn0file1

---

## 4. Implementação dos Projetos

### 4.1 Hello World V2

A implementação deste projeto centrou-se na criação de uma interface simples com:
- um cabeçalho com o nome da aplicação;
- uma mensagem principal de boas-vindas;
- um subtítulo identificativo;
- uma imagem em `drawable`;
- um `CalendarView` interativo.

Foi ainda criado um layout alternativo para orientação horizontal, demonstrando adaptação da interface a diferentes contextos de utilização. fileciteturn0file3

### 4.2 System Info App

Nesta aplicação, a `MainActivity` recolhe automaticamente dados do dispositivo Android através da classe `Build`, formata a informação numa string multilinha e apresenta-a no ecrã. Entre os dados mostrados encontram-se o fabricante, o modelo, a marca, o tipo de build, o utilizador, a versão do SDK, a versão do Android e o identificador de display. fileciteturn0file0

### 4.3 TP1 / Virtual Library

O TP1 foi dividido em três exercícios base e um módulo principal de biblioteca virtual:
- **Exercício 1:** geração dos 50 primeiros quadrados perfeitos usando arrays e transformações com Kotlin;
- **Exercício 2:** calculadora em consola com operadores aritméticos, lógicos e binários;
- **Exercício 3:** cálculo da sequência de alturas de saltos com redução progressiva;
- **Virtual Library:** sistema simples de gestão de livros e membros com recurso a herança e classes abstratas. fileciteturn0file2

### 4.4 Aplicação com Catálogo e Detalhe

Nesta aplicação Android foram implementados:
- um ecrã principal com lista de elementos;
- um ecrã de detalhe;
- adapters para ligação entre dados e interface;
- classes de modelo;
- comunicação remota com API através de **Retrofit**;
- carregamento de imagens com **Coil**.

Esta implementação permitiu consolidar práticas mais avançadas de desenvolvimento Android, nomeadamente modularização, navegação e consumo de dados estruturados. fileciteturn0file1

---

## 5. Testes e Validação

Os testes realizados variaram conforme o tipo de projeto. Nas aplicações Android, a validação foi feita sobretudo através de execução no **Android Studio**, com testes em emulador ou dispositivo físico. Foram verificados o arranque da aplicação, o carregamento do layout, a correta apresentação dos elementos visuais, a navegação entre ecrãs e a adaptação à orientação do dispositivo. fileciteturn0file3 fileciteturn0file0 fileciteturn0file1

No projeto **TP1**, a validação foi efetuada em consola, com observação direta dos resultados produzidos pelos exercícios e pelo sistema da biblioteca. Foram testados cenários como operações inválidas, divisão por zero, empréstimo de livros sem cópias disponíveis e pesquisa por autor. fileciteturn0file2

De forma global, os testes confirmaram que os projetos cumprem os objetivos principais propostos em cada exercício ou tutorial. fileciteturn0file3 fileciteturn0file0 fileciteturn0file2 fileciteturn0file1

---

## 6. Instruções de Utilização

Para executar os projetos Android, é necessário ter:
- **Android Studio** instalado;
- **Android SDK** configurado;
- emulador Android ou dispositivo físico;
- suporte para **Kotlin** e sincronização correta do **Gradle**. fileciteturn0file3 fileciteturn0file0 fileciteturn0file1

Para executar o projeto **TP1**, são necessários:
- **Java JDK**;
- **Kotlin** configurado;
- **Maven**;
- ambiente como **IntelliJ IDEA** ou equivalente. fileciteturn0file2

Passos gerais:
1. abrir o projeto no ambiente adequado;
2. sincronizar dependências;
3. compilar o projeto;
4. executar no emulador, dispositivo ou consola, conforme o caso;
5. validar o comportamento esperado. fileciteturn0file3 fileciteturn0file0 fileciteturn0file2 fileciteturn0file1

---

## 7. Uso de IA e Estratégia de Apoio

Nos vários relatórios, a IA foi usada como ferramenta de apoio à aprendizagem, à organização dos projetos e à redação da documentação. O apoio incidiu em tarefas como explicação de conceitos de Kotlin e Android, estruturação dos relatórios, esclarecimento de dúvidas sobre layouts, manifest, navegação, organização por packages e reformulação de texto para apresentação no GitHub. fileciteturn0file3 fileciteturn0file0 fileciteturn0file2 fileciteturn0file1

Em todos os casos, os conteúdos gerados com apoio de IA foram revistos e adaptados manualmente, sendo a responsabilidade final do trabalho mantida pelo estudante. Esta utilização foi assumida como assistiva e não como substituição da implementação, da validação nem da compreensão dos conteúdos. fileciteturn0file3 fileciteturn0file0 fileciteturn0file2 fileciteturn0file1

---

## 8. Controlo de Versões

Todos os projetos foram preparados para integração com **Git** e **GitHub**, permitindo guardar versões, registar alterações e documentar a evolução do desenvolvimento. As boas práticas recomendadas incluem commits frequentes, mensagens claras e separação lógica por funcionalidade ou correção. fileciteturn0file3 fileciteturn0file0 fileciteturn0file2 fileciteturn0file1

A centralização destes trabalhos num único ficheiro também facilita a apresentação do portefólio no repositório, tornando mais simples a leitura dos vários projetos desenvolvidos. fileciteturn0file2 fileciteturn0file1

---

## 9. Dificuldades e Aprendizagens

Ao longo destes trabalhos, as principais dificuldades estiveram relacionadas com:
- adaptação inicial ao Android Studio e à estrutura dos projetos Android;
- ligação entre XML e Kotlin;
- organização correta de packages, classes e ficheiros;
- interpretação de erros de compilação ou configuração;
- estruturação clara da documentação para GitHub. fileciteturn0file3 fileciteturn0file0 fileciteturn0file2 fileciteturn0file1

Entre as principais aprendizagens, destacam-se:
- compreensão da estrutura base de uma aplicação Android;
- uso de componentes visuais e layouts adaptáveis;
- acesso a informação do sistema com Kotlin;
- aplicação de herança, encapsulamento e classes abstratas;
- importância dos testes, da revisão manual e da documentação técnica. fileciteturn0file3 fileciteturn0file0 fileciteturn0file2 fileciteturn0file1

---

## 10. Melhorias Futuras

Como evolução futura, os projetos podem ser melhorados com:
- interfaces gráficas mais sofisticadas;
- melhor adaptação a tablets e diferentes tamanhos de ecrã;
- adição de pesquisa, filtros ou favoritos;
- persistência de dados;
- testes automatizados;
- melhor tratamento de erros e funcionamento offline;
- inclusão de mais funcionalidades interativas e organização visual por secções. fileciteturn0file3 fileciteturn0file0 fileciteturn0file2 fileciteturn0file1

Estas melhorias permitiriam transformar os projetos atuais em soluções mais completas, robustas e próximas de aplicações reais. fileciteturn0file1 fileciteturn0file2

---

## 11. Conclusão

A junção destes projetos num só ficheiro mostra a evolução progressiva do trabalho desenvolvido em **Kotlin** e **Android**, desde exercícios introdutórios até aplicações móveis mais estruturadas. No seu conjunto, os projetos permitiram consolidar bases importantes de programação, orientação a objetos, interfaces gráficas, navegação, organização modular e documentação técnica. fileciteturn0file3 fileciteturn0file0 fileciteturn0file2 fileciteturn0file1

Este documento serve assim como um **README/relatório global**, adequado para apresentação no GitHub, reunindo de forma clara os principais aspetos dos trabalhos realizados. fileciteturn0file2 fileciteturn0file1
