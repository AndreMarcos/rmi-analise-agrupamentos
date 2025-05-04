# 💻 Projeto RMI - Cálculo de Distância entre Objetos (Flor)

Este projeto é uma aplicação Java que utiliza **Remote Method Invocation (RMI)** para calcular a **distância Euclidiana** ou **City Block** entre objetos com base em seus atributos. Foi desenvolvido como parte da atividade da disciplina *Sistemas Distribuídos - XRSC09* da UNIFEI.


## 📦 Estrutura do Projeto

```
├── common/
│ └── DistanciaService.java
├── server/
│ ├── DistanciaServiceImpl.java
│ └── Server.java
└── client/
└── Client.java
```

## 🚧 Pré-requisitos
- **Java JDK** instalado (versão 8 ou superior)  
- **VS Code ou outro IDE compatível com Java**
- Terminal com acesso ao comando `rmiregistry` (ver instruções abaixo)

## 🛠️ Instalação e Execução
### 1. Instale o JDK
Se ainda não tiver, baixe o JDK em:  
👉 https://www.oracle.com/java/technologies/javase-downloads.html

Após instalar, adicione o caminho do JDK (por exemplo, `C:\Program Files\Java\jdk-21\bin`) à variável de ambiente `PATH`.

### 2. Compile o projeto
No terminal, dentro da pasta `rmi-analise-agrupamentos/`, execute:

```bash
javac -d . common/*.java server/*.java client/*.java
```

### 3. Inicie o servidor

Em um terminal execute:

```
java server.Server
``` 

### 4. Execute o cliente
⚠️ Altere o endereço IP se estiver em outra máquina!

No arquivo Client.java, altere esta linha:
```
Registry registry = LocateRegistry.getRegistry("localhost");
``` 
Para o IP/URL da máquina que você está executando o servidor

Posteriormente, em um terminal execute:
```
java client.Client
``` 
Digite os dados das flores quando solicitado e o tipo de distância:
```
Digite as características da flor A:
largura da pétala: 5,1
altura da pétala: 3,5
largura da sépala: 1,4
altura da sépala: 0,2

Digite as características da flor B:
largura da pétala: 5,9
altura da pétala: 3,0
largura da sépala: 5,1
altura da sépala: 1,8

Digite as características da flor C:
largura da pétala: 4,9
altura da pétala: 3,1
largura da sépala: 1,5
altura da sépala: 0,1


Informe o tipo de distância (euclidiana/cityblock):
euclidiana

Distâncias calculadas:
A-B: 4.1400483088968905
A-C: 0.4690415759823426
B-C: 4.106093033529562
Par mais similar: A-C

``` 


## 🧑‍💻 Autor
Atividade prática da disciplina XRSC09 – Sistemas Distribuídos

Professor: Rafael Frinhani

Aluno: André Marcos Ferreira