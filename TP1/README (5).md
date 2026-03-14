# TP1 – Kotlin Programming Exercises

## 📌 Descrição do Projeto

Este repositório contém a resolução do **Trabalho Prático 1 (TP1)** da unidade curricular de **Computação Móvel**.
O objetivo do trabalho é explorar conceitos fundamentais da linguagem **Kotlin**, incluindo:

* Estruturas básicas da linguagem
* Manipulação de arrays
* Funções e controlo de fluxo
* Programação orientada a objetos
* Herança e subclasses
* Organização de código em packages

O projeto foi desenvolvido no **IntelliJ IDEA** utilizando **Kotlin** e estrutura de projeto baseada em **Maven**.

---

# 🧠 Objetivos do Trabalho

O trabalho teve como principais objetivos:

* Compreender a sintaxe básica de Kotlin
* Aplicar estruturas de controlo e coleções
* Desenvolver pequenos programas de consola
* Implementar conceitos de **Programação Orientada a Objetos**
* Criar um pequeno sistema de gestão de biblioteca virtual

---

# 🗂 Estrutura do Projeto

A estrutura principal do projeto é a seguinte:

```
TP1
│
├── src
│   ├── main
│   │   └── kotlin
│   │        └── cm
│   │             ├── exer_1
│   │             │      exer_1.kt
│   │             │
│   │             ├── exer_2
│   │             │      exer_2.kt
│   │             │
│   │             ├── exer_3
│   │             │      exer_3.kt
│   │             │
│   │             └── virtual_library
│   │                    Book.kt
│   │                    DigitalBook.kt
│   │                    PhysicalBook.kt
│   │                    Library.kt
│   │                    LibraryManager.kt
│   │                    Main.kt
│
└── pom.xml
```

Cada package contém exercícios específicos do trabalho.

---

# ⚙️ Tecnologias Utilizadas

* **Kotlin**
* **IntelliJ IDEA**
* **Maven**
* **JVM**

---

# 🧪 Exercícios Implementados

## 1️⃣ Exercise 1

Este exercício explora conceitos básicos da linguagem Kotlin, incluindo:

* Declaração de variáveis
* Utilização de arrays
* Manipulação de valores numéricos
* Impressão de resultados no terminal

Exemplo de funcionalidade:

* Criação de um array de números
* Cálculo de quadrados dos números
* Impressão dos resultados

---

## 2️⃣ Exercise 2

Neste exercício foram exploradas funcionalidades adicionais da linguagem, incluindo:

* Manipulação de listas
* Iterações com ciclos
* Funções
* Processamento de dados

Este exercício permite praticar estruturas de programação essenciais utilizadas no desenvolvimento em Kotlin.

---

## 3️⃣ Exercise 3

Este exercício aprofunda conceitos de:

* Estruturas de controlo
* Manipulação de dados
* Organização de código

O objetivo principal foi consolidar os conhecimentos adquiridos nos exercícios anteriores.

---

# 📚 Virtual Library

A parte mais importante do projeto consiste na implementação de um pequeno sistema chamado **Virtual Library**, que simula a gestão de livros numa biblioteca.

O sistema utiliza **Programação Orientada a Objetos** e inclui:

* Classes
* Herança
* Polimorfismo
* Encapsulamento

---

# 🧱 Classes Implementadas

## 📖 Book

Classe base que representa um livro.

Contém atributos como:

* título
* autor
* ano de publicação

Serve como **superclasse** para outros tipos de livros.

---

## 💻 DigitalBook

Subclasse de **Book** que representa um livro digital.

Pode incluir propriedades adicionais como:

* formato do ficheiro
* tamanho do ficheiro

Esta classe demonstra o conceito de **herança**.

---

## 📕 PhysicalBook

Subclasse de **Book** que representa um livro físico.

Pode incluir atributos como:

* número de páginas
* localização na biblioteca

---

## 🏛 Library

Classe responsável pela gestão da biblioteca.

Principais funcionalidades:

* adicionar livros
* remover livros
* listar livros
* gerir a coleção da biblioteca

Esta classe funciona como o **gestor principal do sistema**.

---

## 👤 LibraryManager

Classe responsável por gerir a interação com a biblioteca.

Pode incluir funcionalidades como:

* controlo das operações
* organização da lógica da aplicação

---

## 🚀 Main

Classe principal do programa.

Contém a função:

```
fun main()
```

Responsável por:

* iniciar a aplicação
* criar objetos
* testar o sistema da biblioteca

---

# ▶️ Como Executar o Projeto

1. Clonar o repositório:

```
git clone https://github.com/username/TP1.git
```

2. Abrir o projeto no **IntelliJ IDEA**

3. Compilar o projeto

4. Executar o ficheiro:

```
Main.kt
```

---

# 📊 Resultados

O projeto demonstra com sucesso:

* utilização da linguagem Kotlin
* organização de código em packages
* implementação de conceitos de POO
* criação de um pequeno sistema funcional em consola

---

# 🔧 Possíveis Melhorias Futuras

Algumas melhorias que podem ser implementadas no futuro incluem:

* Interface gráfica
* Persistência de dados (ficheiros ou base de dados)
* Sistema de utilizadores
* Sistema de empréstimo de livros
* Melhor organização da arquitetura do sistema

---

# 👨‍💻 Autor

Projeto desenvolvido por:

**Bernardo Rocha - 15033**

Estudante de Engenharia Informática
Unidade Curricular: Computação Móvel

---

# 📄 Licença

Este projeto foi desenvolvido para fins académicos.
