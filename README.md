<p align="center">
  <img src="assets/banner.png" alt="SomaInt — Java" width="100%">
</p>

<p align="center">
  Utilitário console em Java para captura de dois números inteiros via entrada padrão e exibição imediata da soma aritmética.
</p>

<p align="center">
  <img alt="Java" src="https://img.shields.io/badge/Java-Console_I%2FO-C52E36?style=for-the-badge&logo=openjdk&logoColor=white">
  <img alt="Scanner" src="https://img.shields.io/badge/Input-java.util.Scanner-11120F?style=for-the-badge">
  <img alt="Algoritmo" src="https://img.shields.io/badge/Opera%C3%A7%C3%A3o-A_%2B_B-18181B?style=for-the-badge">
</p>

## Sobre o projeto

**SomaInt** é um programa direto em **Java** que exercita os blocos essenciais de qualquer aplicação de console: importação da biblioteca padrão java.util.Scanner, leitura sequencial de inteiros a partir de System.in, armazenamento do resultado em variável local e escrita formatada na saída padrão (System.out.println).

## Principais recursos

| Recurso | Como funciona |
|---|---|
| Leitura interativa | Captura dois valores inteiros (A e B) informados pelo usuário no terminal. |
| Processamento direto | Calcula SOMA = A + B em tipo primitivo int. |
| Saída legível | Imprime SOMA É DE: <resultado> e encerra o leitor Scanner com segurança. |

## Tecnologias

<p>
  <img alt="Java" src="https://img.shields.io/badge/Java-C52E36?style=flat-square&logo=openjdk&logoColor=white">
  <img alt="CLI" src="https://img.shields.io/badge/Terminal-11120F?style=flat-square">
</p>

## Arquitetura

`mermaid
flowchart LR
    A[System.in · 2 Inteiros] --> B[Scanner.nextInt : A, B]
    B --> C[Cálculo : SOMA = A + B]
    C --> D[System.out · SOMA É DE: valor]
`

## Estrutura do repositório

`	ext
SomaInt/
├── assets/
│   ├── banner.png                  Banner principal SomaInt
│   └── project-animal.png          Símbolo do coelho
├── SomaInt.java                    Código-fonte da classe Main
└── README.md
`

## Executando o código

1. Clone o repositório:
   `ash
   git clone https://github.com/arthurlynow098/SomaInt.git
   cd SomaInt
   `
2. Copie SomaInt.java para Main.java, compile e execute:
   `ash
   cp SomaInt.java Main.java
   javac Main.java
   java Main
   `
3. Digite dois inteiros (ex.: 10 25) para visualizar SOMA É DE: 35.

---

<p align="center"><sub>Estudo · construção · evolução</sub><br><a href="https://github.com/arthurlynow098">Perfil</a> · <a href="https://arthurentsev.vercel.app/">Portfólio</a> · <a href="https://www.linkedin.com/in/entsevarthur/">LinkedIn</a></p>
