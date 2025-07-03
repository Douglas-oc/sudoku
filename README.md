# Sudoku em Java 🧩

Este projeto é um jogo de **Sudoku 9x9** desenvolvido em Java, com duas opções de interface para o jogador: **modo terminal (CLI)** e **interface gráfica (GUI)**.  

Seja você fã do terminal ou adepto dos cliques rápidos, o jogo está preparado para ambos os mundos.

---

## 🔧 Funcionalidades

### 🎮 Modo Terminal

Se você gosta de interações mais diretas, o modo CLI oferece um menu completo com várias ações:

- Iniciar um novo jogo
- Colocar um novo número (passando a coluna e linha que deseja adicionar)
- Remover um número (passando a coluna e linha que deseja remover)
- Visualizar o estado atual da grade
- Verificar se o jogo está correto
- Limpar o jogo
- Finalizar o jogo
- Sair

📸 Exemplo:

<img src="https://github.com/user-attachments/assets/4dfdcfe3-b37d-4551-b61e-ff61e6e949cf" alt="Execução pelo Terminal" >
<img src="https://github.com/user-attachments/assets/c872d49d-814a-4719-b741-06df797fdb58" alt="Execução pelo Terminal" width="333" height="202">

---

### 🖱️ Interface Gráfica

Se preferir uma abordagem mais visual, temos uma interface amigável e intuitiva construída com Swing.

Você pode:

- Clicar em uma célula vazia
- Inserir o número desejado
- Clicar em **"Verificar Jogo"** para validar os números já inseridos
- Ao finalizar, clicar em **"Concluir Jogo"** para saber se você venceu

📸 Exemplo:

<img src="https://github.com/user-attachments/assets/38327e0c-23b5-493b-a120-4945ebed7cce" alt="Execução pela Interface Gráfica">

---

## ⚙️ Como Executar

1. Certifique-se de ter o **Java JDK 21** (ou superior) instalado.
2. Clone o repositório:
   ```bash
   git clone https://github.com/Douglas-oc/sudoku.git
   ```
3. Navegue até o diretório do projeto:
   ```bash
   cd sudoku/src
   ```
4. Compile os arquivos Java
   ```bash
   javac br.com.doug.UIMain 
   ```
   ou
   ```bash
   javac br.com.doug.Main 
   ```
6. Execute através da interface gráfica:
   ```bash
   java br.com.doug.UIMain
   ```
7. Ou através do terminal:
   ```bash
   java br.com.doug.Main
   ```
   
---

## 🎯 Objetivo do Projeto

Este projeto tem fins **educacionais**, visando o aprimoramento das habilidades em:

- Programação orientada a objetos em Java
- Manipulação de interfaces gráficas (Swing)
- Lógica de validação e resolução de jogos
- Estruturação de aplicações em Java com múltiplas formas de execução


