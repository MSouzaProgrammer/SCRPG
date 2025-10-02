# SCRPG - Sistema de Cartas para RPG de Mesa

Um sistema em Java para simular cartas de baralho em RPG de mesa.
Permite que jogadores puxem cartas, aplique bônus de proficiência e mostre o resultado para o mestre do jogo.

---

## Funcionalidades

* Criação de um baralho completo com 52 cartas.
* Embaralhamento automático do baralho.
* Puxar cartas com cálculo automático de bônus baseado no naipe do jogador.
* Aviso quando o baralho acabar.
* Possibilidade de resetar o baralho para reiniciar o jogo.

---

## Tecnologias

* Java 21
* Console (sem frameworks adicionais)

---

## Como rodar

1. Clone o repositório:

   ```bash
   git clone https://github.com/MSouzaProgrammer/SCRPG.git
   ```

2. Entre na pasta do projeto:

   ```bash
   cd SCRPG
   ```

3. Compile os arquivos Java:

   ```bash
   javac src/*.java
   ```

4. Execute o teste:

   ```bash
   java src.TesteSistemaRPG
   ```

> Obs.: Ajuste os caminhos se estiver usando pacotes.

---

## Exemplos de uso

```
Carta puxada: 7 de Copas
Valor final (com bônus): 9

Carta puxada: 5 de Espadas
Nenhum bônus aplicado. Valor final: 5

O baralho acabou!
```

---

## Estrutura do projeto

```
SCRPG/
├── src/
│   ├── Baralho.java
│   ├── Carta.java
│   ├── SistemaRPG.java
│   └── TesteSistemaRPG.java
└── README.md
```

---

## Próximos passos / melhorias

* Criar interface gráfica usando JavaFX.
* Permitir múltiplos jogadores no sistema.
* Adicionar efeitos especiais por naipe.
* Implementar testes automatizados com JUnit.
