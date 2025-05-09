# 🧙‍♂️ Desafio POO em Java – Mini Mundo de Harry Potter

Neste desafio, vamos criar um programa simples em Java inspirado no universo de Harry Potter, onde você praticará os conceitos de Programação Orientada a Objetos (POO).

---

## 🧩 Requisitos

### 📌 Classe Base: `Bruxo`

**Atributos (privados):**
- `nome` (String)
- `casa` (String)

**Métodos:**
- Construtor para definir o nome e a casa
- `mostrarInformacoes()` – imprime o nome e a casa do bruxo

---

### 🧙 Interface: `Magia`

**Método:**
- `lancarFeitico()` – imprime uma mensagem dizendo que o bruxo lançou um feitiço

---

### 🧬 Classes Filhas

As classes abaixo devem **herdar** de `Bruxo` e **implementar** a interface `Magia`:

#### 🦁 `BruxoGrifinoria`

- `lancarFeitico()` imprime:
  ```
  Expelliarmus! - O bruxo da Grifinória lançou seu feitiço!
  ```

#### 🐍 `BruxoSonserina`

- `lancarFeitico()` imprime:
  ```
  Serpensortia! - O bruxo da Sonserina lançou seu feitiço!
  ```

---

## 🧪 Instruções

1. Crie a classe `Bruxo` com atributos privados e um método que exibe nome e casa.
2. Crie a interface `Magia` com o método `lancarFeitico()`.
3. Crie as classes `BruxoGrifinoria` e `BruxoSonserina` que herdam de `Bruxo` e implementam `Magia`.
4. No método `main`, crie um objeto de cada classe e chame os métodos para exibir as mensagens no console.

---
