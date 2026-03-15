# Tutorial 1 - Hello Kotlin, Hello Mobile Android World! (Opcional)

## Course
Computação Móvel

## Student(s)
Preencher

## Date
Preencher

## Repository URL
Preencher

---

## 1. Introdução
Este projeto foi desenvolvido no âmbito do **Tutorial 1 - Hello Kotlin, Hello Mobile Android World!**, com o objetivo de criar uma aplicação Android simples em **Kotlin**, utilizando **XML Views** para a construção da interface gráfica.

A aplicação implementada corresponde a uma versão opcional do exercício, focada na **apresentação de informação do dispositivo Android**. Em vez de mostrar apenas uma mensagem estática, a aplicação recolhe e apresenta automaticamente vários dados do sistema, como fabricante, modelo, marca, versão do Android e SDK.

O principal objetivo deste trabalho foi consolidar os primeiros conceitos de desenvolvimento móvel em Android Studio, incluindo:
- criação de um projeto Android em Kotlin;
- utilização de layouts em XML;
- associação entre interface gráfica e lógica da aplicação;
- acesso a propriedades do sistema através da classe `Build`;
- execução e teste da aplicação em emulador/dispositivo.

---

## 2. Visão Geral do Sistema
A aplicação desenvolvida é uma app Android simples com um único ecrã principal. Nesse ecrã são apresentados:
- um **título no topo**, com destaque visual;
- uma **área de texto multilinha**, onde são mostradas várias informações do dispositivo.

Quando a aplicação é iniciada, a classe principal recolhe automaticamente os dados do sistema Android e escreve essas informações no campo de texto.

### Funcionalidades principais
- Mostrar o fabricante do dispositivo;
- Mostrar o modelo;
- Mostrar a marca;
- Mostrar o tipo de build;
- Mostrar o utilizador associado ao build;
- Mostrar a versão base;
- Mostrar o valor incremental;
- Mostrar a versão do SDK;
- Mostrar a versão do Android;
- Mostrar o identificador de display.

Trata-se de uma aplicação introdutória, mas útil para compreender a ligação entre **interface gráfica**, **lógica Kotlin** e **dados do sistema operativo Android**.

---

## 3. Arquitetura e Design
A aplicação segue uma estrutura simples, adequada a um projeto introdutório.

### Estrutura principal
- **`MainActivity.kt`**: contém a lógica principal da aplicação;
- **`activity_main.xml`**: define a interface gráfica;
- **`AndroidManifest.xml`**: declara a activity principal e configura aspetos base da aplicação;
- **`strings.xml`, `colors.xml` e `themes.xml`**: suportam textos, cores e tema visual.

### Organização da interface
A interface foi construída com **ConstraintLayout**, permitindo posicionar os elementos de forma relativamente flexível.

Os componentes principais usados foram:
- **TextView** para o cabeçalho/título;
- **EditText multilinha** para apresentar a informação do sistema.

### Justificação das escolhas
Foi adotada uma solução simples porque o objetivo do trabalho é introdutório. Assim:
- foi usada **apenas uma activity**, evitando complexidade desnecessária;
- o layout XML permite separar a interface da lógica;
- a classe `Build` foi escolhida por fornecer diretamente os dados do dispositivo sem necessidade de bibliotecas externas;
- o uso de `EditText` multilinha permitiu apresentar facilmente várias linhas de informação de forma rápida e funcional.

---

## 4. Implementação
A implementação foi feita em **Kotlin** no Android Studio.

### Lógica principal
Na `MainActivity`, o método `onCreate()` executa os passos centrais da aplicação:
1. carrega o layout principal com `setContentView()`;
2. obtém a referência ao campo de texto multilinha;
3. recolhe informações do dispositivo através da classe `Build`;
4. concatena essas informações numa única string formatada;
5. apresenta o resultado no ecrã com `setText()`.

### Dados recolhidos
Os dados apresentados pela aplicação incluem:
- `Build.MANUFACTURER`
- `Build.MODEL`
- `Build.BRAND`
- `Build.TYPE`
- `Build.USER`
- `Build.VERSION_CODES.BASE`
- `Build.VERSION.INCREMENTAL`
- `Build.VERSION.SDK_INT`
- `Build.VERSION.RELEASE`
- `Build.DISPLAY`

### Interface gráfica
A interface foi desenhada em XML com dois elementos principais:
- um cabeçalho com fundo colorido e texto branco;
- uma caixa de texto abaixo, ocupando a área principal do ecrã.

Esta organização torna a aplicação clara e funcional, mesmo sendo simples.

---

## 5. Testes e Validação
Os testes realizados tiveram como objetivo confirmar que a aplicação executa corretamente e apresenta os dados esperados.

### Testes efetuados
- execução da aplicação no Android Studio;
- validação da abertura correta da activity principal;
- confirmação de que o título surge no topo do ecrã;
- confirmação de que o campo multilinha é preenchido automaticamente;
- verificação da apresentação dos dados do dispositivo/emulador.

### Cenários verificados
- arranque normal da aplicação;
- carregamento correto do layout;
- visualização das várias linhas de informação;
- compatibilidade com o emulador utilizado durante o desenvolvimento.

### Limitações observadas
- os dados apresentados dependem do dispositivo ou emulador utilizado;
- o campo de texto está preparado para mostrar informação, mas o aspeto visual pode ser melhorado;
- a aplicação não inclui interação adicional com o utilizador.

Mesmo assim, para os objetivos do tutorial, a aplicação cumpre corretamente a sua função.

---

## 6. Instruções de Utilização
Para executar a aplicação, devem ser seguidos os seguintes passos:

1. Abrir o projeto no **Android Studio**;
2. Garantir que o Gradle termina a sincronização sem erros;
3. Selecionar um emulador Android ou ligar um dispositivo físico;
4. Executar a aplicação através da opção **Run**;
5. Após a abertura, observar no ecrã principal as informações do dispositivo.

### Requisitos
- Android Studio instalado;
- SDK Android configurado;
- emulador ou dispositivo Android disponível;
- suporte para projetos Kotlin.

---

## 7. Estratégia de Prompting
Durante o desenvolvimento, foi possível utilizar ferramentas de IA para apoiar tarefas como:
- esclarecimento de dúvidas sobre Kotlin e Android Studio;
- interpretação dos requisitos do tutorial;
- apoio na estruturação da interface XML;
- apoio na redação do relatório final.

A estratégia de prompting consistiu em fazer pedidos diretos e objetivos, tais como:
- explicar a função de determinado bloco de código;
- sugerir a estrutura de um relatório técnico;
- indicar como ligar a interface XML ao código Kotlin;
- ajudar a descrever o funcionamento da aplicação em linguagem formal.

Desta forma, a IA funcionou como apoio ao desenvolvimento, sem substituir a compreensão do trabalho realizado.

---

## 8. Fluxo de Trabalho com Ferramentas de IA
As ferramentas de IA foram usadas como suporte em diferentes momentos do trabalho, nomeadamente para:
- planear a estrutura do relatório;
- rever descrições técnicas;
- esclarecer erros simples ou dúvidas de implementação;
- melhorar a organização textual e a apresentação do projeto para GitHub.

Em termos práticos, a utilização da IA ajudou a:
- acelerar a escrita de documentação;
- reduzir dúvidas iniciais;
- tornar a explicação do projeto mais clara e organizada.

---

## 9. Verificação de Artefactos Gerados por IA
Todo o conteúdo sugerido por IA deve ser sempre revisto manualmente antes de ser incluído no projeto final.

Neste trabalho, a verificação incidiu sobre:
- correção dos conceitos técnicos;
- adequação da descrição ao projeto realmente implementado;
- consistência entre o código desenvolvido e o texto do relatório;
- clareza e formalidade da redação em português.

Foi feita validação manual para garantir que o resultado final corresponde ao trabalho efetivamente realizado.

---

## 10. Contributo Humano vs. Contributo da IA
### Contributo humano
A componente humana foi essencial em:
- criação e configuração do projeto;
- implementação e adaptação do código;
- execução, teste e validação da aplicação;
- decisões sobre estrutura, organização e apresentação final;
- confirmação do funcionamento real da app no ambiente de desenvolvimento.

### Contributo da IA
A IA teve um papel de apoio em:
- explicação de conceitos;
- reformulação de texto;
- organização do relatório;
- auxílio pontual em dúvidas de implementação.

Assim, a autoria principal do trabalho e a responsabilidade pelo conteúdo final mantêm-se do lado do estudante.

---

## 11. Avaliação Crítica e Responsável
A utilização de IA deve ser feita com cuidado, sobretudo em contexto académico. Entre os principais riscos encontram-se:
- aceitação de respostas incorretas sem validação;
- dependência excessiva da ferramenta;
- produção de texto tecnicamente correto, mas não alinhado com o projeto real;
- possibilidade de omitir detalhes importantes do trabalho efetivamente desenvolvido.

Por isso, neste trabalho, a IA foi utilizada apenas como ferramenta de apoio, sendo necessária revisão crítica em todas as sugestões recebidas.

---

## Desenvolvimento do Projeto
O desenvolvimento seguiu uma lógica progressiva:
1. criação do projeto base em Android Studio;
2. definição do layout principal em XML;
3. implementação da lógica em Kotlin;
4. ligação entre componentes da interface e código;
5. testes em emulador;
6. preparação da documentação para GitHub.

Este processo permitiu consolidar conhecimentos básicos de desenvolvimento Android com Kotlin.

---

## 12. Histórico de Versões / Controlo de Versões
O projeto foi pensado para ser acompanhado através de controlo de versões com **Git** e publicação no **GitHub**.

A utilização do Git permite:
- guardar diferentes versões do trabalho;
- registar alterações ao longo do desenvolvimento;
- facilitar a organização do projeto;
- publicar o trabalho de forma estruturada.

Para um projeto deste tipo, é recomendável realizar commits frequentes, por exemplo:
- criação do projeto inicial;
- implementação da interface;
- implementação da lógica Kotlin;
- correção de erros;
- adição do relatório/README.

---

## 13. Dificuldades e Lições Aprendidas
Durante o desenvolvimento, as principais dificuldades podem incluir:
- adaptação inicial ao Android Studio;
- compreensão da estrutura de um projeto Android;
- ligação entre XML e Kotlin;
- interpretação de alguns erros do ambiente de desenvolvimento;
- organização do projeto para publicação no GitHub.

### Principais aprendizagens
- perceber a estrutura base de uma aplicação Android;
- usar uma `Activity` para controlar o comportamento do ecrã;
- construir interfaces com XML;
- aceder a informação do sistema Android com Kotlin;
- documentar um projeto técnico de forma organizada.

---

## 14. Melhorias Futuras
Como evolução deste projeto, poderiam ser adicionadas várias melhorias, tais como:
- substituir o `EditText` por um componente mais apropriado apenas para visualização;
- melhorar o design visual da interface;
- adicionar ícones e elementos gráficos;
- tornar a informação apresentada mais organizada por secções;
- criar suporte para orientação horizontal e diferentes tamanhos de ecrã;
- incluir mais dados do sistema, como resolução, idioma ou versão de segurança;
- adicionar botão para atualizar a informação.

---

## 15. Divulgação do Uso de IA (Obrigatório)
Durante a realização deste trabalho, foram utilizadas ferramentas de inteligência artificial como apoio à aprendizagem, esclarecimento de dúvidas e organização do relatório.

Essas ferramentas foram usadas para:
- ajudar a estruturar a documentação;
- reformular descrições em português;
- apoiar a interpretação de partes do projeto;
- auxiliar na apresentação final para GitHub.

Todo o conteúdo gerado com apoio de IA foi revisto, validado e adaptado manualmente antes da versão final. A responsabilidade pelo trabalho entregue permanece integralmente do estudante.

---

## Conclusão
Este projeto permitiu desenvolver uma primeira aplicação Android em Kotlin, aplicando conceitos fundamentais de interface gráfica, programação orientada a eventos e acesso a informação do sistema.

Embora simples, a aplicação cumpre os objetivos do tutorial e representa uma base importante para trabalhos futuros mais completos. Além disso, a preparação deste relatório para GitHub contribui para uma melhor organização, apresentação e documentação do projeto.
