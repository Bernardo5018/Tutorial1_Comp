# Relatório do Projeto — Aplicação com AI

Curso: LEIC
aluno: Bernardo Rocha
Data: 10/03/2026
Repository URL: ____________________

# 1. Introdução

Este projeto foi desenvolvido no âmbito da aprendizagem de Computação Móvel / desenvolvimento Android, com o objetivo principal de construir uma aplicação móvel funcional utilizando Kotlin e Android Studio.

A aplicação tem como foco apresentar informação de forma simples, intuitiva e visualmente organizada, permitindo ao utilizador navegar pelos conteúdos e aceder ao detalhe de cada elemento. O projeto foi pensado para consolidar conceitos essenciais do desenvolvimento Android, incluindo navegação entre ecrãs, construção de interfaces gráficas, manipulação de dados e integração de bibliotecas de apoio modernas.

Os principais objetivos deste projeto são:
- Aplicar os conceitos fundamentais do desenvolvimento de aplicações Android
- Utilizar Kotlin como linguagem principal
- Criar uma interface gráfica organizada e funcional
- Implementar navegação entre diferentes ecrãs
- Consumir e apresentar dados estruturados de forma eficiente
- Melhorar as competências práticas em desenvolvimento de software móvel

# 2. Visão Geral do Sistema

A solução desenvolvida é uma aplicação móvel Android construída em Kotlin. O seu objetivo é proporcionar uma experiência de navegação do tipo catálogo, onde o utilizador pode visualizar uma lista de elementos e selecionar um deles para consultar informação mais detalhada.

Principais funcionalidades:
- Apresentação de uma lista de elementos
- Navegação entre ecrãs/fragments
- Visualização detalhada do elemento selecionado
- Integração com bibliotecas externas para carregamento de imagens e comunicação em rede
- Interface moderna e organizada

Casos de uso:
- O utilizador abre a aplicação e visualiza o ecrã principal
- O utilizador percorre os elementos disponíveis
- O utilizador seleciona um elemento da lista
- A aplicação navega para o ecrã de detalhe
- O utilizador consulta informação adicional sobre o elemento escolhido

# 3. Arquitetura e Design

A aplicação segue uma organização modular e estruturada, separando responsabilidades por diferentes ficheiros e componentes. Isto torna o código mais fácil de manter, compreender e expandir.

Decisões de arquitetura:
- Utilização de Kotlin como linguagem de implementação
- Android Studio como ambiente de desenvolvimento
- Utilização de fragments/navegação para organizar o fluxo entre ecrãs
- Separação entre lógica de interface, modelos de dados e acesso a dados
- Utilização do Retrofit para comunicação com a API
- Utilização do Coil para carregamento e apresentação de imagens

Visão geral da estrutura de pastas:
- `ui/` ou equivalente: componentes relacionados com a interface
- `data/` ou equivalente: modelos e lógica de rede
- `adapter/` ou equivalente: suporte à visualização de listas
- `navigation/`: recursos de navegação entre ecrãs
- `res/`: layouts, strings, cores e recursos gráficos

O design do projeto privilegia a simplicidade, a legibilidade e a compatibilidade com práticas comuns de desenvolvimento Android.

# 4. Implementação

A implementação foi dividida em vários componentes, cada um responsável por uma parte específica da aplicação.

Principais elementos implementados:
- Ecrã principal para visualização da lista
- Ecrã de detalhe para apresentação do conteúdo selecionado
- Adapter para associar os dados à lista ou RecyclerView
- Classes de modelo de dados
- Camada de comunicação com a API
- Suporte ao carregamento de imagens

Detalhes relevantes da implementação:
- Foi utilizada a linguagem Kotlin para toda a lógica da aplicação
- Foram utilizados layouts XML para a interface gráfica
- A navegação entre ecrãs foi implementada através dos mecanismos de navegação Android
- A obtenção dos dados foi tratada com Retrofit
- As imagens remotas foram carregadas de forma eficiente com Coil

Exemplo de responsabilidades implementadas:
- `MainActivity` ou fragment principal: inicializa e controla o fluxo principal
- Adapter: gere a apresentação dos elementos da lista
- Componente de detalhe: mostra informação específica do elemento escolhido
- Serviço de rede: faz os pedidos remotos
- Classes de modelo: representam a estrutura da informação recebida

Esta implementação permite que a aplicação se mantenha organizada e escalável.

# 5. Testes e Validação

Os testes foram realizados principalmente através de execução manual no emulador Android e/ou num dispositivo físico. O objetivo foi verificar se as funcionalidades implementadas se comportavam como esperado e se o fluxo de navegação se mantinha consistente.

Aspetos validados:
- Arranque correto da aplicação
- Apresentação correta da interface principal
- Navegação bem-sucedida entre ecrãs
- Carregamento correto dos dados
- Apresentação adequada de imagens e texto
- Estabilidade da aplicação durante a utilização normal

Cenários de teste:
- Abrir a aplicação a partir de um arranque limpo
- Selecionar diferentes elementos na lista principal
- Confirmar que a vista de detalhe apresentada corresponde ao elemento selecionado
- Verificar o carregamento das imagens
- Testar o comportamento da interface em navegação repetida

Limitações conhecidas:
- Os testes focaram-se sobretudo na validação funcional/manual
- Não foi adicionada uma suite de testes automatizados nesta versão
- O comportamento pode depender da disponibilidade de internet, caso sejam necessários dados remotos

# 6. Instruções de Utilização

Para executar o projeto, devem estar reunidos os seguintes requisitos:
- Android Studio instalado
- Android SDK configurado
- Suporte para Kotlin ativo
- Ligação à internet, caso a aplicação dependa de dados remotos

Passos para execução:
1. Abrir o Android Studio
2. Selecionar a pasta do projeto
3. Permitir que o Gradle sincronize todas as dependências
4. Compilar o projeto
5. Executar a aplicação num emulador ou dispositivo Android

Notas de configuração:
- Confirmar que todas as dependências em `build.gradle` estão instaladas corretamente
- Verificar se o emulador/dispositivo utiliza uma versão Android compatível
- Caso a aplicação consuma uma API, confirmar que as permissões, como acesso à internet, estão corretamente declaradas

# 7. Estratégia de Prompting

As ferramentas de IA foram utilizadas para apoiar o processo de desenvolvimento, especialmente na estruturação de ideias, clarificação de passos de implementação e apoio à correção de código.

A principal estratégia de prompting consistiu em:
- Pedir explicações passo a passo para tarefas no Android Studio
- Solicitar ajuda na organização da estrutura do projeto
- Gerar sugestões para a organização do README/relatório
- Esclarecer erros relacionados com código, layout, navegação ou configuração do manifest
- Melhorar o texto da documentação para apresentação no GitHub

Os prompts foram maioritariamente focados em:
- Apoio à implementação em Kotlin
- Organização da interface em XML
- Lógica de navegação
- Diagnóstico de erros
- Melhoria da documentação

# 8. Fluxo de Trabalho com Agente Autónomo

O apoio da IA contribuiu para um fluxo de trabalho assistido, no qual as sugestões foram analisadas e depois adaptadas ao projeto real.

Áreas de contribuição:
- Planeamento dos passos de implementação
- Explicação de como estruturar activities/fragments
- Apoio no debugging de problemas específicos do Android
- Sugestões para melhor organização do README e das secções do relatório
- Ajuda na reformulação de descrições técnicas e funcionais

As decisões finais, correções e validações mantiveram-se sob controlo humano, sendo a IA utilizada como ferramenta de apoio e não como substituição da responsabilidade de desenvolvimento.

# 9. Verificação de Artefactos Gerados por IA

Todos os conteúdos apoiados por IA foram revistos antes de serem considerados válidos para a versão final do projeto.

Métodos de verificação:
- Revisão manual do código
- Comparação com o comportamento esperado da aplicação
- Execução no Android Studio
- Inspeção estática da organização dos ficheiros e da lógica
- Correção de inconsistências antes da aceitação

Este processo garantiu que as sugestões geradas fossem adaptadas aos requisitos do projeto e que saídas incorretas ou demasiado genéricas não fossem aceites sem confirmação.

# 10. Contribuição Humana vs IA

Contribuição humana:
- Definição dos objetivos do projeto
- Escolha do conceito da aplicação
- Utilização do Android Studio e execução do projeto
- Correção manual de erros
- Validação final do código e da interface
- Tomada de decisões sobre estrutura e apresentação

Contribuição da IA:
- Apoio na escrita e reorganização da documentação
- Suporte na explicação de etapas de implementação em Kotlin/XML
- Ajuda na identificação de possíveis causas de erros de compilação ou execução
- Sugestões para estruturar componentes e secções do relatório

O resultado final foi orientado e validado principalmente pelo estudante, tendo a IA funcionado como apoio complementar.

# 11. Uso Ético e Responsável

As ferramentas de IA foram utilizadas de forma responsável enquanto ferramentas de apoio ao desenvolvimento. As suas respostas não foram aceites de forma automática e foram sempre revistas antes de serem incluídas no projeto.

Considerações:
- As sugestões da IA podem conter imprecisões ou soluções incompletas
- A revisão humana é necessária para garantir a correção
- A responsabilidade final pelo conteúdo submetido pertence ao estudante
- A IA foi utilizada para acelerar a compreensão e a organização, não para contornar o processo de aprendizagem

Esta abordagem ajuda a manter a integridade académica e a responsabilidade técnica.

# 12. Controlo de Versões e Histórico de Commits

O controlo de versões é essencial para gerir a evolução do software e acompanhar o progresso do desenvolvimento. O Git e o GitHub podem ser utilizados para guardar o projeto e manter um histórico das alterações.

Boas práticas recomendadas:
- Criar commits com mensagens significativas
- Separar commits por funcionalidade/correção sempre que possível
- Utilizar o GitHub para publicar e documentar o projeto
- Manter o repositório organizado com um `README.md` completo

Exemplos de mensagens de commit úteis:
- `Configuração inicial do projeto Android`
- `Adicionado layout do ecrã principal`
- `Implementado ecrã de detalhe`
- `Integrado Retrofit para pedidos à API`
- `Atualizada documentação no README`

# 13. Dificuldades e Lições Aprendidas

Durante o desenvolvimento, podem surgir várias dificuldades práticas, especialmente para estudantes que ainda estão a consolidar os conceitos do desenvolvimento Android.

Principais dificuldades:
- Compreender a estrutura de um projeto Android Studio
- Gerir a configuração dos layouts em XML
- Configurar corretamente a navegação
- Resolver erros no manifest ou na compilação
- Lidar com dependências e sincronização do Gradle
- Ligar os dados aos componentes visuais

Lições aprendidas:
- A importância de organizar o código por responsabilidades
- O valor de testar frequentemente durante o desenvolvimento
- A necessidade de validar todas as alterações de forma incremental
- A utilidade da documentação para explicar o projeto com clareza
- A importância de rever criticamente o material gerado por IA

# 14. Melhorias Futuras

A versão atual da aplicação fornece uma base funcional, mas existem várias melhorias que podem ser adicionadas em futuras iterações.

Possíveis melhorias futuras:
- Adicionar funcionalidade de pesquisa e filtragem
- Melhorar o design visual da interface
- Adicionar favoritos ou elementos guardados
- Melhorar o tratamento de erros e o comportamento offline
- Adicionar testes automatizados
- Aumentar a quantidade de dados apresentados
- Melhorar a adaptação a diferentes tamanhos de ecrã e orientações

Estas melhorias aumentariam tanto a usabilidade como a maturidade técnica do projeto.

# 15. Declaração de Utilização de IA (Obrigatório)

Foram utilizadas ferramentas de IA durante este projeto como instrumentos de apoio para:
- esclarecer etapas de desenvolvimento,
- melhorar a documentação,
- compreender detalhes de implementação em Android/Kotlin,
- e apoiar o debugging e a organização do projeto.

Todo o conteúdo gerado com apoio de IA foi revisto, adaptado e validado antes de ser incluído. A responsabilidade final pelo trabalho submetido, incluindo correção, estrutura e integridade académica, é inteiramente do estudante.
