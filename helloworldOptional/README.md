# HelloWorld Optional – Android Application

## 📌 Descrição do Projeto

Este projeto consiste no desenvolvimento de uma aplicação Android simples criada no **Android Studio**, utilizando a linguagem **Kotlin**.

O objetivo principal da aplicação é apresentar **informações sobre o dispositivo Android** onde a aplicação está a ser executada, tais como:

* Fabricante do dispositivo
* Modelo
* Marca
* Tipo de dispositivo
* Utilizador
* Versão do sistema
* SDK
* Informações do build do Android

Estas informações são obtidas através da classe **`Build`** do Android e apresentadas no ecrã da aplicação através de um campo de texto multilinha.

Este tipo de aplicação é frequentemente utilizado para **testes iniciais, aprendizagem da plataforma Android e exploração da API do sistema operativo**.

---

# 🎯 Objetivos do Projeto

Os principais objetivos deste projeto foram:

* Criar uma aplicação Android funcional utilizando **Kotlin**
* Explorar a estrutura básica de um projeto Android
* Aprender a trabalhar com **Activities**
* Utilizar componentes de interface gráfica (UI)
* Obter informações do sistema Android através da classe **Build**
* Apresentar dados dinamicamente na interface da aplicação

---

# 🧱 Estrutura do Projeto

A estrutura principal do projeto segue o modelo padrão de aplicações Android.

```
helloworldOptional
│
├── app
│   ├── src
│   │   ├── main
│   │   │   ├── java/cm_a15033/helloworldoptional
│   │   │   │   └── MainActivity.kt
│   │   │   │
│   │   │   ├── res
│   │   │   │   ├── layout
│   │   │   │   │   └── activity_main.xml
│   │   │   │   ├── values
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   ├── strings.xml
│   │   │   │   │   └── themes.xml
│   │   │   │
│   │   │   └── AndroidManifest.xml
│   │
│   └── build.gradle.kts
│
├── gradle
├── gradlew
└── settings.gradle.kts
```

---

# ⚙️ Tecnologias Utilizadas

O projeto foi desenvolvido utilizando as seguintes tecnologias:

* **Kotlin** – linguagem principal da aplicação
* **Android Studio** – ambiente de desenvolvimento
* **Android SDK** – conjunto de ferramentas para desenvolvimento Android
* **ConstraintLayout** – layout utilizado para organizar os elementos da interface

---

# 🖥️ Interface da Aplicação

A interface gráfica da aplicação foi criada no ficheiro:

```
activity_main.xml
```

A interface contém dois elementos principais:

### 1️⃣ TextView

Mostra um título na parte superior da aplicação.

### 2️⃣ EditText (Multiline)

Área onde são apresentadas as informações do dispositivo Android.

Exemplo de layout utilizado:

```xml
<TextView
    android:id="@+id/textView"
    android:layout_width="0dp"
    android:layout_height="44sp"
    android:text="@string/hello_string"
    android:textColor="@color/white"/>
```

```xml
<EditText
    android:id="@+id/editTextTextMultiLine"
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:inputType="textMultiLine"/>
```

---

# 🧠 Funcionamento da Aplicação

A lógica principal da aplicação encontra-se na classe:

```
MainActivity.kt
```

Esta classe é responsável por:

1. Iniciar a aplicação
2. Carregar o layout da interface
3. Obter informações do dispositivo Android
4. Mostrar essas informações no ecrã

### Código principal

```kotlin
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editTextTextMultiLine)

        val informações =
            "Manufacturer: " + Build.MANUFACTURER + "\n" +
            "Model: " + Build.MODEL + "\n" +
            "Brand: " + Build.BRAND + "\n" +
            "Type: " + Build.TYPE + "\n" +
            "User: " + Build.USER + "\n" +
            "SDK: " + Build.VERSION.SDK_INT + "\n" +
            "Version: " + Build.VERSION.RELEASE + "\n"

        editText.setText(informações)
    }
}
```

---

# 📱 Informações Obtidas do Dispositivo

A aplicação recolhe diversas informações do sistema Android através da classe **Build**.

Alguns exemplos:

| Informação   | Descrição                 |
| ------------ | ------------------------- |
| Manufacturer | Fabricante do dispositivo |
| Model        | Modelo do dispositivo     |
| Brand        | Marca                     |
| Type         | Tipo de build             |
| SDK          | Versão da API Android     |
| Version      | Versão do sistema Android |

Estas informações são automaticamente atualizadas dependendo do dispositivo onde a aplicação é executada.

---

# ▶️ Como Executar o Projeto

Para executar a aplicação é necessário seguir os seguintes passos:

1️⃣ Abrir o **Android Studio**

2️⃣ Selecionar:

```
File → Open
```

3️⃣ Abrir a pasta do projeto.

4️⃣ Executar a aplicação através do botão:

```
Run ▶
```

5️⃣ Escolher um dispositivo:

* Emulador Android
* Dispositivo físico ligado por USB

---

# 🚀 Possíveis Melhorias Futuras

Este projeto pode ser melhorado com várias funcionalidades adicionais, tais como:

* Mostrar mais informações do dispositivo
* Melhorar o design da interface
* Adicionar ícones personalizados
* Criar várias páginas (Activities)
* Guardar informações num ficheiro
* Adicionar botões de atualização de dados

---

# 👤 Autor

Projeto desenvolvido por:

**Bernardo Rocha - 15033**

Estudante de Engenharia Informática  
Unidade Curricular: Computação Móvel


---

# 📄 Licença

Este projeto foi desenvolvido para fins **educacionais** no contexto académico.
