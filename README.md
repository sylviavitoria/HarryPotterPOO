
# 🧙‍♂️ Desafio POO em Java Atualizado - Mini Mundo de Harry Potter

Neste desafio, vamos criar um programa em Java inspirado no universo de Harry Potter, implementando conceitos de **POO** e arquitetura em camadas com **DTOs**.

---

## 🧩 Requisitos

### 📚 Organização em Camadas

- **Pacote `model`**: Classes de domínio  
- **Pacote `dto`**: Objetos de transferência de dados

---

## 📌 Classe Base: `Bruxo` (pacote `model`)

### Atributos (privados):
- `nome` (String)
- `casa` (String)

### Métodos:
- Construtor para definir o nome e a casa  
- `mostrarInformacoes()` – imprime o nome e a casa do bruxo  
- Getters e Setters para encapsulamento

---

## 🧙 Interface: `Magia` (pacote `model`)

### Método:
- `lancarFeitico()` – imprime uma mensagem dizendo que o bruxo lançou um feitiço

---

## 🧬 Classes Filhas (pacote `model`)

As classes abaixo devem **herdar de `Bruxo`** e implementar a interface `Magia`:

### 🦁 `BruxoGrifinoria`
- Construtor que recebe nome e casa  
- `lancarFeitico()` imprime:  
  ```
  Expelliarmus! - O bruxo da Grifinória lançou seu feitiço!
  ```

### 🐍 `BruxoSonserina`
- Construtor que recebe nome e casa  
- `lancarFeitico()` imprime:  
  ```
  Serpensortia! - O bruxo da Sonserina lançou seu feitiço!
  ```

---

## 📊 Padrão DTO (Data Transfer Object)

### `BruxoRequestDTO` (pacote `dto`)
- Atributos privados: `nome` e `casa`  
- Construtores (vazio e com parâmetros)  
- Getters e Setters  

### `BruxoResponseDTO` (pacote `dto`)
- Atributos privados: `nome`, `casa` e `tipoMagia`  
- Construtores (vazio e com parâmetros)  
- Getters e Setters  

---

## 🧪 Instruções

### Parte 1 – Conceitos básicos de POO:
1. Crie a classe abstrata `Bruxo` com atributos privados (`nome` e `casa`) e um método `mostrarInformacoes()` que exibe o nome e a casa.
2. Crie a interface `Magia` com o método `lancarFeitico()`.
3. Crie as classes `BruxoGrifinoria` e `BruxoSonserina` que herdam de `Bruxo` e implementam `Magia`.

### Parte 2 – Organização do projeto:
4. Crie a estrutura de pacotes: `model` para as classes de domínio e `dto` para os objetos de transferência de dados.
5. Mova as classes `Bruxo`, `Magia`, `BruxoGrifinoria` e `BruxoSonserina` para o pacote `model`.
6. Crie os DTOs `BruxoRequestDTO` e `BruxoResponseDTO` no pacote `dto`, com atributos, construtores, getters e setters.

### No método `main`:
- Crie DTOs de request para simular dados de entrada  
- Converta os DTOs para objetos do domínio (`model`)  
- Execute as ações dos objetos (`mostrarInformacoes` e `lancarFeitico`)  
- Converta os resultados para DTOs de response  
- Exiba as informações dos DTOs de response  

---

## 📋 Fluxo do Programa (`main`)

1. **Entrada**: Crie DTOs de request com dados simulados  
2. **Conversão para domínio**: Transforme os DTOs em objetos das classes de modelo  
3. **Processamento**: Execute os métodos que implementam comportamentos  
4. **Conversão para saída**: Transforme os objetos de domínio em DTOs de response  
5. **Saída**: Exiba as informações contidas nos DTOs de response  
