# 🧮 Calculadora Interativa em Java

Projeto de calculadora desenvolvido em Java com interface via terminal. Permite realizar operações matemáticas básicas de forma interativa.

---

## 📋 Funcionalidades

- ➕ Soma
- ➖ Subtração
- ✖️ Multiplicação
- ➗ Divisão (com tratamento de erro para divisão por zero)
- 🔄 Menu interativo com loop até o usuário sair

---

## 🗂️ Estrutura do Projeto

```
calculadorajava/
├── Main.java          # Classe principal com menu interativo
└── Calculadora.java   # Classe com os métodos de cálculo
```

---

## ▶️ Como Executar

### Pré-requisitos
- [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado (versão 8 ou superior)

### Passos

1. Clone o repositório:
```bash
git clone https://github.com/carlosthz/Calculadora-Java.git
```

2. Acesse a pasta do projeto:
```bash
cd Calculadora-Java
```

3. Compile os arquivos:
```bash
javac Main.java Calculadora.java
```

4. Execute:
```bash
java calculadorajava.Main
```

---

## 💻 Exemplo de Uso

```
=== Calculadora Interativa ===
1 = Soma
2 = Subtração
3 = Multiplicação
4 = Divisão
0 = Sair
Escolha: 1

Digite dois números:
10
5

Resultado:
10.0 + 5.0 = 15.0
-------------------
```

---

## 🛠️ Tecnologias Utilizadas

- Java
- Orientação a Objetos
- Tratamento de exceções (`ArithmeticException`)

---

## 👤 Autor

Feito por **[Carlos Souza](https://github.com/carlosthz)** — sinta-se à vontade para contribuir ou dar uma ⭐ no repositório!
