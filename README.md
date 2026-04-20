# 🧮 Calculadora Interativa em Java

Projeto de calculadora desenvolvido em Java com interface via terminal. Permite realizar operações matemáticas básicas de forma interativa, com validação de entradas.

---

## 📋 Funcionalidades

- ➕ Soma
- ➖ Subtração
- ✖️ Multiplicação
- ➗ Divisão (com tratamento de erro para divisão por zero)
- 🔄 Menu interativo com loop até o usuário sair
- ✅ Validação de entradas — aceita números decimais e rejeita letras/caracteres inválidos

---

## 🗂️ Estrutura do Projeto

```
calculadorajava/
├── Main.java          # Classe principal com menu interativo
├── Calculadora.java   # Classe com os métodos de cálculo
└── Entrada.java       # Classe responsável pela validação de entradas
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
javac Main.java Calculadora.java Entrada.java
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

Escolha uma opção:
1
Insira o primeiro valor: 10.5
Insira o segundo valor: 4

Resultado:
10.5 + 4.0 = 14.5
-------------------
```

---

## 🛠️ Tecnologias Utilizadas

- Java
- Orientação a Objetos
- Tratamento de exceções (`ArithmeticException`)
- Validação de entradas (`hasNextInt`, `hasNextDouble`)

---

## 👤 Autor

Feito por **[carlosthz](https://github.com/carlosthz)** — sinta-se à vontade para contribuir ou dar uma ⭐ no repositório!
