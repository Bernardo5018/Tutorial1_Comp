# Hello World – Android App (Kotlin)

## 📌 Descrição do Projeto

Este projeto consiste numa aplicação Android simples desenvolvida em **Kotlin** no **Android Studio**.  
A aplicação tem como objetivo demonstrar a criação de uma primeira aplicação Android ("Hello World"), explorando a estrutura básica de um projeto Android e o funcionamento de uma **Activity**.

O projeto foi desenvolvido no contexto da unidade curricular de **Computação Móvel**, servindo como introdução ao desenvolvimento de aplicações móveis para o sistema operativo **Android**.

---

# 🎯 Objetivos

Os principais objetivos deste trabalho foram:

- Compreender a estrutura de um projeto Android
- Criar uma aplicação simples em Kotlin
- Explorar o funcionamento de uma **Activity**
- Executar uma aplicação Android num emulador ou dispositivo
- Utilizar recursos do Android como **layouts e strings**

---

# ⚙️ Tecnologias Utilizadas

O desenvolvimento da aplicação utilizou as seguintes tecnologias:

- **Kotlin**
- **Android Studio**
- **Android SDK**
- **Gradle**
- **JVM**

---

# 📁 Estrutura do Projeto

A estrutura principal do projeto é a seguinte:

```
HelloWorld
│
├── app
│   ├── src
│   │   ├── androidTest
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── cm_a15033
│   │   │   │        └── helloworld
│   │   │   │             └── MainActivity.kt
│   │   │   │
│   │   │   ├── res
│   │   │   │   ├── layout
│   │   │   │   │     activity_main.xml
│   │   │   │   ├── values
│   │   │   │   │     strings.xml
│   │   │   │   │
│   │   │   │   └── mipmap
│   │   │   │         ic_launcher
│   │   │   │
│   │   │   └── AndroidManifest.xml
│   │   │
│   │   └── test
│   │
│   └── build.gradle.kts
│
└── build.gradle
```

---

# 🧠 Funcionamento da Aplicação

A aplicação possui apenas uma **Activity principal** chamada:

```
MainActivity
```

Esta activity é responsável por:

- iniciar a aplicação
- carregar o layout da interface
- executar código quando a aplicação é aberta

---

# 📱 MainActivity

A classe principal da aplicação é `MainActivity.kt`.

Esta classe herda de:

```
AppCompatActivity
```

O método principal utilizado é:

```
onCreate()
```

Este método é executado quando a Activity é criada.

Principais operações realizadas:

1. Inicialização da Activity
2. Definição do layout da aplicação
3. Ajuste de margens para barras do sistema
4. Impressão de uma mensagem no log

Exemplo simplificado do funcionamento:

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

# 🖥 Interface Gráfica

A interface da aplicação é definida no ficheiro:

```
activity_main.xml
```

Este ficheiro define os elementos visuais apresentados ao utilizador, como:

- layout principal
- componentes visuais
- estrutura da interface

---

# 🚀 Execução da Aplicação

Para executar o projeto é necessário:

### 1️⃣ Clonar o repositório

```
git clone https://github.com/username/helloworld-android.git
```

### 2️⃣ Abrir o projeto

Abrir o projeto no **Android Studio**.

### 3️⃣ Sincronizar o Gradle

O Android Studio irá sincronizar automaticamente as dependências do projeto.

### 4️⃣ Executar a aplicação

Selecionar:

```
Run ▶
```

E escolher:

- um **emulador Android**
- ou um **dispositivo físico**

---

# 📊 Resultados

A aplicação executa corretamente e demonstra:

- criação de uma aplicação Android
- utilização de Kotlin
- estrutura básica de um projeto Android
- funcionamento de uma Activity

Este projeto serve como base para o desenvolvimento de aplicações Android mais complexas.

---

# 🔧 Possíveis Melhorias Futuras

Algumas melhorias possíveis incluem:

- adicionar novos ecrãs (Activities)
- melhorar a interface gráfica
- adicionar navegação entre páginas
- integrar bases de dados
- adicionar funcionalidades interativas

---

# 👨‍💻 Autor

Projeto desenvolvido por:

**Bernardo Rocha - 15033**

Estudante de Engenharia Informática  
Unidade Curricular: Computação Móvel

---

# 📄 Licença

Projeto desenvolvido para fins académicos.
