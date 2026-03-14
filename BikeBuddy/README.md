# Bike Buddy – Android App (Kotlin)

## 📌 Descrição do Projeto

Este projeto consiste numa aplicação Android avançada desenvolvida em **Kotlin** no **Android Studio**.
A aplicação tem como objetivo localizar estações de partilha de bicicletas nas redondezas (centrando geograficamente na rede *Gira*, em Lisboa), mostrando, em tempo real, a disponibilidade de veículos físicos e as respetivas docas/estacionamentos vazios do sistema.

O projeto foi desenvolvido no contexto da unidade curricular de **Computação Móvel**, servindo como introdução ao design avançado de arquiteturas (**MVVM**) e integração de chamadas à internet (APIs REST) para o sistema operativo **Android**.

---

## 🎯 Objetivos

Os principais objetivos deste trabalho foram:

- Compreender a estrutura de um projeto Android moderno
- Criar uma aplicação baseada na linguagem **Kotlin**
- Explorar o funcionamento de uma **Activity** com navegação contextual
- Consumir uma API pública mundial de bicicletas (`api.citybik.es`)
- Apresentar dinamicamente pinos de mapas baseados em código *Open Source* (**osmdroid**)
- Utilizar recursos do Android como **layouts**, estilos Material Design e imagens vetoriais SVG
- Executar e testar a aplicação Android num emulador ou dispositivo físico

---

## ⚙️ Tecnologias Utilizadas

O desenvolvimento da aplicação utilizou as seguintes tecnologias e bibliotecas:

- **Kotlin**
- **Android Studio**
- **Android SDK**
- **Gradle**
- Sistema **MVVM** (Model-View-ViewModel) e **Coroutines** (Concorrência e Assincronia)
- **Retrofit2**, **Gson** e **OkHttp3** (Comunicações Web e Parsing de JSON)
- **osmdroid** (Motor de representação visual de Mapas Livres)

---

## 📁 Estrutura do Projeto

A estrutura principal do projeto, devidamente focada na separação MVVM, é a seguinte:

```text
BikeBuddy/app/src/main
├── java/com/example/bikebuddy
│   ├── data
│   │   ├── BikeRepository.kt    (Repositório da API)
│   │   ├── CityBikesApi.kt      (Conexão ao servidor)
│   │   └── Models.kt            (Classes de Dados: Stations, Networks, etc.)
│   ├── ui
│   │   ├── MapViewModel.kt      (Lógica Assíncrona e Gestão de Estado)
│   │   └── ViewModelFactory.kt  (Injeção do repositório)
│   └── MainActivity.kt          (Atividade Principal da Interface)
├── res
│   ├── drawable                 (Vetores como: marker_available, ic_bike, bg_cards)
│   ├── layout
│   │   ├── activity_main.xml
│   │   └── bottom_sheet_station_details.xml
│   ├── values
│   │   └── colors.xml, strings.xml, themes.xml
│   └── xml
│       └── network_security_config.xml
└── AndroidManifest.xml
```

---

## 🧠 Funcionamento da Aplicação

A aplicação possui a sua entrada gráfica principal através de uma Atividade chamada:

```text
MainActivity
```

Esta activity é responsável por:
- iniciar a aplicação e o mapa (org.osmdroid)
- carregar o layout da interface principal
- observar ativamente os dados passados pelo **ViewModel** sem bloquear o ecrã
- desenhar marcadores e interagir no clique para abrir detalhes flutuantes

### 📱 Lógica e ViewModel
Enquanto a `MainActivity` reage aos cliques, toda a gestão técnica do servidor passa pela `MapViewModel`. Ela assegura a extração sem problemas através dos *Coroutines* numa *Background Thread* paralela, salvaguardando a aplicação de bloqueios. 

Exemplo simplificado do funcionamento interno base:

```kotlin
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        // 1. Inicializa interface do ecrã e Mapa
        map = findViewById(R.id.mapview)
        
        // 2. Escuta as chamadas vindas da internet (via Retrofit/ViewModel)
        observeViewModel()
    }
}
```

---

## 💻 Interface Gráfica

A interface principal da aplicação é definida no ficheiro:

```text
activity_main.xml
```

Este ficheiro, conjugado com o suporte do componente secundário `bottom_sheet_station_details.xml`, define os elementos visuais apresentados ao utilizador:

- **Layout principal** focado totalmente na experiência imersiva através do Mapa (Full-Screen)
- **Componentes visuais** flutuantes de Material Design 3 (Botões Flutuantes e Bottom Sheets com bordas redondas)
- **Painéis coloridos (Cards)** que destacam perfeitamente na leitura as bicicletas e as docas.

---

## 🚀 Execução da Aplicação

Para executar o projeto é necessário:

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/USERNAME/bikebuddy-android.git
```

### 2️⃣ Abrir o projeto
Abrir a pasta-raiz da aplicação gerada no **Android Studio**.

### 3️⃣ Sincronizar o Gradle
O Android Studio irá analisar a base de código e iniciar autonomamente o download das bibliotecas Retrofit/osmdroid no processo *Sync Project with Gradle Files*.

### 4️⃣ Executar a aplicação
Selecionar a opção principal visível no painel superior:

```text
Run ▶
```

E escolher:
- um **emulador Android** virtualizado
- ou um **dispositivo físico** rodando via Cabo/Wireless e com opções de Programador ativas.

---

## 📊 Resultados

A aplicação executa corretamente (a partir do nível API 24 Nougat em diante) e demonstra os seguintes pontos:

- criação rigorosa de uma aplicação moderna suportada em Kotlin
- separação total entre elementos gráficos (**View**) e modelos lógicos baseados na Localização e RestAPIs
- utilização rigorosa de elementos UI (Botões, Cartões Modais), bem como o tráfego seguro e fidedigno do Android System (+13)
- consumo dinâmico e representativo de JSON em formato de Pinos Verdes (Livres) e Vermelhos (Ocupados) no ecrã geográfico principal.

Este projeto serve como demonstração de interações de UI/UX, arquiteturas padrão MVVM e mapas open-source em Mobile Computing.

---

## 🔧 Possíveis Melhorias Futuras

Algumas melhorias futuras a ponderar ou aplicar futuramente no projeto incluem:

- integração visual com o Modo Noturno (Dark Mode nativo do smartphone)
- adicionar navegação (criar rotas e traçar percursos) desde uma localização central para as estações escolhidas
- melhorar a robustez ou implementar alertas em ambientes completamente *offline*
- utilizar integração de bases de dados móvel (RoomDB) para permitir guardar as redes/estações frequentemente utilizadas (marcadores de Favoritos).
- aplicar e pesquisar localizações além da atual perspetiva de Lisboa (GIRA).

---

## 👨‍💻 Autor

Projeto desenvolvido por:

**Bernardo Rocha - 15033**

Estudante de Engenharia Informática  
Unidade Curricular: Computação Móvel  

---

## 📄 Licença

Projeto desenvolvido para fins académicos.
