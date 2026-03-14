# 📱 Projetos de Computação Móvel – Kotlin / Android

Este repositório reúne vários projetos desenvolvidos no âmbito da unidade curricular de **Computação Móvel**, utilizando **Kotlin** e **Android Studio**.

Os projetos incluem aplicações Android simples, exploração da linguagem Kotlin e desenvolvimento de aplicações mais completas com integração de APIs e arquitetura moderna.

---

# 📂 Estrutura do Repositório

```
.
├── HelloWorld
├── HelloWorldOptional
├── BikeBuddy
└── TP1
```

Cada pasta corresponde a um projeto desenvolvido ao longo das aulas.

---

# 🚀 Projetos Incluídos

---

# 1️⃣ Hello World – Android App

## 📌 Descrição

Este projeto consiste numa aplicação Android simples desenvolvida em **Kotlin** no **Android Studio**.

A aplicação demonstra a criação da primeira aplicação Android e permite compreender a estrutura básica de um projeto Android e o funcionamento de uma **Activity**.

---

## 🎯 Objetivos

* Compreender a estrutura de um projeto Android
* Criar uma aplicação simples em Kotlin
* Explorar o funcionamento de uma Activity
* Executar uma aplicação Android num emulador ou dispositivo
* Utilizar recursos do Android como layouts e strings

---

## ⚙️ Tecnologias Utilizadas

* Kotlin
* Android Studio
* Android SDK
* Gradle
* JVM

---

## 📁 Estrutura do Projeto

```
HelloWorld
├── app
│   ├── src
│   │   ├── main
│   │   │   ├── java/cm_a15033/helloworld
│   │   │   │      MainActivity.kt
│   │   │   ├── res
│   │   │   │   ├── layout/activity_main.xml
│   │   │   │   ├── values/strings.xml
│   │   │   │   └── mipmap/ic_launcher
│   │   │   └── AndroidManifest.xml
```

---

## 🧠 Funcionamento

A aplicação possui apenas uma **Activity principal** chamada `MainActivity`.

Esta Activity:

* inicia a aplicação
* carrega o layout da interface
* executa código quando a aplicação é aberta

Exemplo de funcionamento:

```kotlin
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        println("MainActivity iniciada")
    }
}
```

---

# 2️⃣ HelloWorld Optional – Android Application

## 📌 Descrição

Este projeto consiste numa aplicação Android criada em **Kotlin** que apresenta **informações sobre o dispositivo Android** onde está a ser executada.

A aplicação recolhe dados do sistema através da classe **Build** do Android.

---

## 🎯 Objetivos

* Criar uma aplicação Android funcional em Kotlin
* Explorar a estrutura básica de um projeto Android
* Utilizar Activities
* Trabalhar com componentes de interface gráfica
* Obter informações do sistema Android

---

## ⚙️ Tecnologias Utilizadas

* Kotlin
* Android Studio
* Android SDK
* ConstraintLayout

---

## 🖥 Interface da Aplicação

A interface contém dois elementos principais:

### TextView

Mostra o título da aplicação.

### EditText (Multiline)

Apresenta as informações do dispositivo.

---

## 🧠 Funcionamento

A lógica encontra-se na classe `MainActivity.kt`.

A aplicação obtém dados como:

* Manufacturer
* Model
* Brand
* SDK
* Version

Exemplo de código:

```kotlin
val informações =
    "Manufacturer: " + Build.MANUFACTURER + "\n" +
    "Model: " + Build.MODEL + "\n" +
    "Brand: " + Build.BRAND + "\n" +
    "Type: " + Build.TYPE + "\n" +
    "User: " + Build.USER + "\n" +
    "SDK: " + Build.VERSION.SDK_INT + "\n" +
    "Version: " + Build.VERSION.RELEASE + "\n"
```

---

# 3️⃣ BikeBuddy – Android App

## 📌 Descrição

O projeto **BikeBuddy** consiste numa aplicação Android mais avançada que permite localizar estações de bicicletas partilhadas.

A aplicação centra-se na rede **GIRA em Lisboa** e mostra a disponibilidade de bicicletas e docas em tempo real.

---

## 🎯 Objetivos

* Desenvolver uma aplicação Android moderna
* Consumir uma API pública
* Mostrar dados em mapas
* Utilizar arquitetura **MVVM**
* Trabalhar com comunicação web

---

## ⚙️ Tecnologias Utilizadas

* Kotlin
* Android Studio
* Android SDK
* Gradle
* MVVM
* Retrofit
* Gson
* OkHttp
* osmdroid

---

## 📁 Estrutura do Projeto

```
BikeBuddy
├── data
│   ├── BikeRepository.kt
│   ├── CityBikesApi.kt
│   └── Models.kt
├── ui
│   ├── MapViewModel.kt
│   └── ViewModelFactory.kt
└── MainActivity.kt
```

---

## 🧠 Funcionamento

A aplicação utiliza:

* **ViewModel** para gerir os dados
* **Retrofit** para comunicação com APIs
* **osmdroid** para mostrar o mapa

A `MainActivity` é responsável por:

* iniciar a aplicação
* carregar o mapa
* mostrar estações disponíveis

---

## 📊 Resultados

A aplicação demonstra:

* consumo de APIs REST
* utilização de arquitetura MVVM
* representação de dados em mapas

---

# 4️⃣ TP1 – Kotlin Programming Exercises

## 📌 Descrição

Este projeto corresponde ao **Trabalho Prático 1 (TP1)** da unidade curricular.

O objetivo foi explorar conceitos fundamentais da linguagem **Kotlin**, incluindo programação orientada a objetos.

---

## 🧠 Objetivos

* Compreender a sintaxe de Kotlin
* Trabalhar com arrays e coleções
* Implementar funções
* Aplicar conceitos de POO
* Criar um sistema simples de biblioteca

---

## 📁 Estrutura do Projeto

```
TP1
├── exer_1
│   └── exer_1.kt
├── exer_2
│   └── exer_2.kt
├── exer_3
│   └── exer_3.kt
└── virtual_library
    ├── Book.kt
    ├── DigitalBook.kt
    ├── PhysicalBook.kt
    ├── Library.kt
    ├── LibraryManager.kt
    └── Main.kt
```

---

## 📚 Virtual Library

O sistema implementa uma pequena biblioteca virtual utilizando **Programação Orientada a Objetos**.

Classes principais:

* `Book` (superclasse)
* `DigitalBook`
* `PhysicalBook`
* `Library`
* `LibraryManager`

---

## 🚀 Execução

1️⃣ Clonar o repositório

```bash
git clone https://github.com/username/TP1.git
```

2️⃣ Abrir no **IntelliJ IDEA**

3️⃣ Executar o ficheiro:

```
Main.kt
```

---

# 📚 Conhecimentos Adquiridos

Durante o desenvolvimento destes projetos foram adquiridos conhecimentos em:

* Kotlin
* Desenvolvimento Android
* Android Studio
* Consumo de APIs
* Arquitetura MVVM
* Programação Orientada a Objetos

---

# 👨‍💻 Autor

**Bernardo Rocha – 15033**

Estudante de Engenharia Informática
Unidade Curricular: Computação Móvel

---

# 📄 Licença

Projetos desenvolvidos para **fins académicos**.
