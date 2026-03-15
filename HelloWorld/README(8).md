# Relatório do Projeto — Hello Kotlin, Hello Mobile Android World

**Curso:** ____________________________________  
**Aluno(s):** __________________________________  
**Data:** ______________________________________  
**URL do Repositório:** ______________________________________

---

## 1. Introdução

### 1.1. Objetivo do trabalho, problema e objetivos
Este trabalho teve como principal objetivo desenvolver uma aplicação móvel Android simples, utilizando **Kotlin** e **XML Views**, como forma de consolidar os conhecimentos iniciais de desenvolvimento para dispositivos móveis.

A proposta centrou-se na criação de uma aplicação introdutória, capaz de apresentar elementos gráficos básicos e demonstrar a estrutura essencial de um projeto Android. Para isso, foi implementada uma interface com diferentes componentes visuais, nomeadamente textos, uma imagem e um calendário, permitindo compreender a ligação entre o código Kotlin e os ficheiros XML de layout.

Os principais objetivos do trabalho foram:
- compreender a organização de um projeto Android Studio;
- criar uma interface gráfica recorrendo a XML;
- utilizar uma `Activity` em Kotlin como ponto de entrada da aplicação;
- testar a aplicação em diferentes orientações de ecrã;
- aplicar boas práticas básicas de estruturação e execução de um projeto móvel.

---

## 2. Visão Geral do Sistema

### 2.1. Descrição de alto nível da solução, principais funcionalidades e casos de uso
A solução desenvolvida consiste numa aplicação Android simples denominada **Hello World V2**. A aplicação apresenta um ecrã principal com uma barra superior com o nome da app, uma mensagem de boas-vindas, um subtítulo identificativo, uma imagem ilustrativa e um componente de calendário.

Embora se trate de uma aplicação introdutória, a solução já demonstra vários conceitos importantes do desenvolvimento móvel, como a definição de layouts, utilização de recursos gráficos, gestão de strings em ficheiros próprios e adaptação da interface à orientação do dispositivo.

As principais funcionalidades implementadas foram:
- apresentação do nome da aplicação no topo do ecrã;
- exibição de uma mensagem principal de boas-vindas;
- inclusão de uma imagem através dos recursos `drawable`;
- utilização de um `CalendarView` interativo;
- adaptação do layout para modo **portrait** e **landscape**.

Casos de uso principais:
- abrir a aplicação e visualizar o ecrã inicial;
- consultar visualmente os elementos da interface;
- observar a reorganização dos componentes ao rodar o dispositivo.

---

## 3. Arquitetura e Decisões de Design

### 3.1. Estrutura da pasta do projeto, padrões de design e justificação das decisões
O projeto segue a estrutura típica de uma aplicação Android criada no Android Studio. Os elementos principais encontram-se organizados da seguinte forma:

- `app/src/main/java/.../MainActivity.kt` — classe principal da aplicação;
- `app/src/main/res/layout/activity_main.xml` — layout principal em modo vertical;
- `app/src/main/res/layout-land/activity_main.xml` — layout alternativo para modo horizontal;
- `app/src/main/res/drawable/` — recursos gráficos, incluindo a imagem utilizada;
- `app/src/main/res/values/strings.xml` — textos da aplicação;
- `app/src/main/AndroidManifest.xml` — configuração principal da aplicação.

Ao nível do design, foi adotada uma abordagem simples e adequada ao objetivo pedagógico do trabalho. A interface foi construída com **ConstraintLayout**, por permitir posicionar os elementos de forma flexível e eficiente. Esta escolha facilita a adaptação da interface a diferentes dimensões e orientações de ecrã.

As decisões principais foram:
- usar uma única `Activity`, por se tratar de uma aplicação introdutória;
- separar interface e lógica, mantendo o layout em XML e o comportamento em Kotlin;
- utilizar ficheiros de recursos (`strings`, `drawable`, `layout`) para melhor organização;
- criar uma versão específica do layout para `landscape`, melhorando a experiência visual nessa orientação.

---

## 4. Implementação

### 4.1. Módulos implementados, principais componentes, algoritmos e trechos relevantes
A implementação do projeto foi intencionalmente simples, focando-se nos elementos essenciais de uma primeira aplicação Android.

#### MainActivity
A classe `MainActivity` é a atividade principal da aplicação. Nela, é definido o ficheiro de layout a utilizar com `setContentView(...)`. Além disso, foi usado `enableEdgeToEdge()` para permitir uma melhor integração com o ecrã completo do dispositivo, e foi também tratado o ajuste dos `window insets`, de forma a evitar sobreposição com barras do sistema.

De forma resumida, a `MainActivity` executa as seguintes ações:
- inicia a aplicação;
- carrega o layout principal;
- ajusta os espaçamentos face às barras do sistema;
- escreve uma mensagem de registo no arranque da atividade.

#### Interface gráfica
O layout principal inclui os seguintes componentes:
- **TextView** superior com o nome da aplicação;
- **TextView** com a mensagem “Hello Android World!”;
- **TextView** secundário com o texto “My First App”;
- **ImageView** para apresentação de uma imagem;
- **CalendarView** para exibição de um calendário interativo.

#### Adaptação a landscape
Foi criado um ficheiro alternativo em `layout-land`, permitindo reorganizar os componentes quando o dispositivo é colocado na horizontal. Esta separação demonstra uma prática importante em Android: criar diferentes interfaces para diferentes contextos de utilização.

#### Recursos utilizados
Os textos foram definidos no ficheiro `strings.xml`, o que melhora a manutenção e permite futura internacionalização. A imagem utilizada foi adicionada à pasta `drawable`, sendo depois referenciada no `ImageView`.

---

## 5. Testes e Validação

### 5.1. Estratégia de testes, casos de teste, cenários e resultados
A validação da aplicação foi realizada através de execução no ambiente Android Studio, com observação direta do comportamento da interface.

Foram considerados os seguintes cenários de teste:

**Teste 1 — Arranque da aplicação**  
Objetivo: verificar se a app abre corretamente.  
Resultado: a aplicação inicia sem erros e apresenta o ecrã principal.

**Teste 2 — Visualização dos componentes**  
Objetivo: confirmar a presença e legibilidade dos textos, imagem e calendário.  
Resultado: todos os componentes são apresentados corretamente.

**Teste 3 — Mudança de orientação**  
Objetivo: validar o funcionamento do layout em modo horizontal.  
Resultado: a interface adapta-se ao ficheiro `layout-land`, reorganizando os elementos.

**Teste 4 — Carregamento da imagem**  
Objetivo: verificar se o recurso gráfico é corretamente apresentado.  
Resultado: a imagem é carregada a partir da pasta `drawable` sem falhas.

**Teste 5 — Execução sem falhas de compilação**  
Objetivo: confirmar que o projeto compila corretamente.  
Resultado: compilação e execução bem-sucedidas.

De forma global, os testes confirmaram que os objetivos principais do trabalho foram cumpridos.

---

## 6. Instruções de Utilização

### 6.1. Requisitos para executar, configuração e passos de execução
Para executar o projeto, são necessários os seguintes requisitos:
- Android Studio instalado;
- JDK compatível com o projeto;
- emulador Android configurado ou dispositivo físico;
- Gradle configurado automaticamente pelo Android Studio.

Passos de execução:
1. Abrir o projeto no Android Studio.
2. Aguardar pela sincronização do Gradle.
3. Selecionar um dispositivo virtual ou físico.
4. Executar a aplicação através da opção **Run**.
5. Observar o ecrã principal e testar a rotação do dispositivo para validar o layout alternativo.

---

## 7. Engenharia de Prompts

### 7.1. Prompts usados com ferramentas de IA, objetivo e exemplos
Ao longo do desenvolvimento, ferramentas de IA podem ser utilizadas como apoio à aprendizagem, à organização do projeto e à redação técnica. Neste contexto, a utilização teve como objetivo principal:
- esclarecer dúvidas sobre Kotlin e XML;
- apoiar a estruturação do relatório;
- sugerir melhorias de organização do projeto;
- auxiliar na interpretação dos requisitos do trabalho.

Exemplos de prompts utilizados ou passíveis de utilização neste contexto:
- “Explica a função de uma Activity em Android com Kotlin.”
- “Mostra como organizar um layout simples em ConstraintLayout.”
- “Cria um relatório em português de Portugal para um projeto Android Hello World.”
- “Explica a diferença entre `layout` e `layout-land` em Android.”

A IA foi usada como ferramenta de apoio, não substituindo a implementação, a validação nem a compreensão dos conteúdos por parte do autor.

---

## 8. Trabalho de Agente Autónomo

### 8.1. Como ferramentas de IA contribuíram para planeamento, documentação, testes e deteção de erros
O recurso a ferramentas de IA contribuiu sobretudo em tarefas de apoio, nomeadamente:
- estruturação do relatório final;
- esclarecimento de dúvidas técnicas iniciais;
- revisão textual e melhoria da redação;
- apoio na identificação de possíveis erros de configuração ou layout.

A implementação do projeto, a criação dos ficheiros, a organização da interface e a execução final ficaram dependentes da intervenção humana, tendo a IA funcionado como suporte complementar.

---

## 9. Verificação de Artefactos Gerados por IA

### 9.1. Como foi verificada e validada a correção de código e/ou designs produzidos por IA
Todos os conteúdos sugeridos com apoio de IA foram verificados manualmente antes de serem considerados válidos. Essa verificação incluiu:
- leitura e análise do código sugerido;
- comparação com os requisitos do enunciado;
- execução prática no Android Studio;
- correção manual de trechos quando necessário;
- validação visual da interface após compilação.

Desta forma, garantiu-se que a versão final do trabalho corresponde ao comportamento esperado e não depende de saídas automáticas não verificadas.

---

## 10. Colaboração Humana vs. IA

### 10.1. Identificar o que foi maioritariamente humano e o que foi assistido por IA
No desenvolvimento deste trabalho, as tarefas maioritariamente humanas foram:
- criação e gestão do projeto no Android Studio;
- organização prática dos ficheiros;
- execução, teste e validação da aplicação;
- decisões visuais e funcionais finais;
- preparação do repositório GitHub.

As tarefas assistidas por IA incluíram:
- apoio na explicação de conceitos;
- sugestões de estrutura para o relatório;
- apoio na redação e reformulação de texto;
- auxílio pontual na interpretação de erros ou dúvidas.

Assim, a contribuição da IA foi de natureza assistiva, enquanto a responsabilidade pela versão final permaneceu com o autor.

---

## 11. Considerações Éticas e Responsáveis sobre IA

### 11.1. Reflexão sobre riscos, limitações, enviesamentos e resultados inadequados
A utilização de IA no contexto académico deve ser acompanhada de espírito crítico. Estas ferramentas podem produzir respostas úteis, mas também podem gerar conteúdo incorreto, incompleto ou desajustado ao enunciado do trabalho.

Entre os principais riscos identificam-se:
- aceitação de respostas sem validação;
- geração de código que aparenta estar correto, mas contém erros;
- simplificação excessiva de conceitos técnicos;
- produção de texto genérico ou pouco adaptado ao projeto real.

Para mitigar estes riscos, foi adotada uma abordagem de verificação manual contínua, garantindo que todas as sugestões fossem analisadas antes da sua integração no trabalho.

---

## Desenvolvimento do Projeto

O desenvolvimento do projeto decorreu de forma faseada. Primeiro, foi criado o projeto base no Android Studio. De seguida, foi definida a interface principal em XML, com os elementos pedidos. Posteriormente, foi estabelecida a ligação com a `MainActivity` em Kotlin, permitindo a execução da aplicação. Após isso, foram adicionados os recursos gráficos e testado o comportamento em diferentes orientações. Por fim, foi feita a validação global da aplicação e preparada a documentação para o repositório.

---

## 12. Controlo de Versões e Histórico de Commits

### 12.1. Como o controlo de versões foi usado e regras para um histórico limpo
O controlo de versões é fundamental para acompanhar a evolução do projeto e manter um histórico organizado das alterações realizadas.

Neste trabalho, o repositório GitHub pode ser utilizado para:
- registar as várias fases de desenvolvimento;
- documentar mudanças realizadas no layout, código e recursos;
- manter um histórico rastreável;
- facilitar a apresentação e entrega do projeto.

Boas práticas recomendadas para os commits:
- fazer commits frequentes e com alterações coerentes;
- utilizar mensagens curtas mas descritivas;
- evitar commits com mudanças excessivamente misturadas;
- manter uma sequência lógica de evolução do projeto.

Exemplos de mensagens adequadas:
- `Criação inicial do projeto HelloWorld`
- `Adicionado layout principal em XML`
- `Inserida imagem e CalendarView`
- `Criado layout alternativo para landscape`
- `Atualizado relatório do projeto`

---

## 13. Dificuldades e Lições Aprendidas

### 13.1. Principais desafios, aprendizagens e ideias obtidas
Durante a realização do trabalho, os principais desafios estiveram relacionados com:
- compreensão inicial da estrutura de um projeto Android;
- posicionamento correto dos componentes no `ConstraintLayout`;
- adaptação do layout a diferentes orientações;
- organização dos recursos gráficos e textuais.

As principais aprendizagens foram:
- perceber a separação entre interface e lógica;
- compreender a importância dos recursos em Android;
- aprender a testar layouts em vários contextos;
- reconhecer o valor da validação prática em emulador ou dispositivo.

Este trabalho serviu como base importante para projetos móveis futuros mais completos.

---

## 14. Melhorias Futuras

### 14.1. Possíveis extensões, optimizações e funcionalidades adicionais
Como evolução futura, esta aplicação poderá ser melhorada com:
- adição de mais ecrãs e navegação entre atividades;
- inclusão de botões com ações interativas;
- personalização visual mais avançada;
- suporte a mais idiomas;
- melhor adaptação a tablets e outros tamanhos de ecrã;
- integração com armazenamento local ou base de dados;
- substituição do calendário por funcionalidades mais específicas do contexto da aplicação.

Estas melhorias permitiriam transformar a aplicação introdutória num projeto móvel mais completo e funcional.

---

## 15. Declaração de Utilização de IA (Obrigatória)

### 15.1. Lista de ferramentas de IA utilizadas e confirmação de responsabilidade humana
Ferramentas de IA utilizadas no apoio ao trabalho:
- ChatGPT — apoio à explicação de conceitos, estruturação do relatório e revisão textual.

Declaração:  
A utilização de ferramentas de IA neste trabalho teve um caráter exclusivamente assistivo. Todo o conteúdo final foi revisto, validado e assumido pelo autor. A responsabilidade pelo código, pela documentação, pelos testes e pela versão final submetida é inteiramente humana.

---

## Conclusão

O projeto **Hello World V2** permitiu consolidar os primeiros conceitos de desenvolvimento Android com Kotlin e XML. Apesar de simples, a aplicação demonstra conhecimentos fundamentais sobre estrutura de projeto, construção de interfaces, utilização de recursos e adaptação a diferentes orientações de ecrã. O trabalho constituiu uma base importante para aplicações futuras mais complexas e serviu também para praticar documentação técnica e organização de um repositório GitHub.
