<p align="center">
  <img src="assets/banner-v2.png" alt="SomaInt" width="100%">
</p>

<p align="center">Leitura de dois números inteiros e exibição da soma no console.</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-C52E36?style=flat-square" alt="Java">
  <img src="https://img.shields.io/badge/Console-24272E?style=flat-square" alt="Console">
  <img src="https://img.shields.io/badge/L%C3%B3gica-24272E?style=flat-square" alt="Lógica">
</p>

<p align="center"><a href="#visão-geral">Visão geral</a> &nbsp;·&nbsp; <a href="#recursos">Recursos</a> &nbsp;·&nbsp; <a href="#como-executar">Como executar</a></p>

---

## Visão geral

**SomaInt** é um programa direto em **Java** que exercita os blocos essenciais de qualquer aplicação de console: importação da biblioteca padrão java.util.Scanner, leitura sequencial de inteiros a partir de System.in, armazenamento do resultado em variável local e escrita formatada na saída padrão (System.out.println).

## Recursos

| Recurso | Como funciona |
|---|---|
| Leitura interativa | Captura dois valores inteiros (A e B) informados pelo usuário no terminal. |
| Processamento direto | Calcula SOMA = A + B em tipo primitivo int. |
| Saída legível | Imprime SOMA É DE: <resultado> e encerra o leitor Scanner com segurança. |

<details>
<summary>Arquitetura</summary>

```mermaid
flowchart LR
    A["System.in · 2 Inteiros"] --> B["Scanner.nextInt : A, B"]
    B --> C["Cálculo : SOMA = A + B"]
    C --> D["System.out · SOMA É DE: valor"]
```

</details>

<details>
<summary>Estrutura do repositório</summary>

```text
SomaInt/
├── assets/
│   └── project-animal.png          Emblema do projeto
├── SomaInt.java                    Código-fonte da classe Main
└── README.md
```

</details>

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/arthurlynow098/SomaInt.git
   cd SomaInt
   ```
2. Copie SomaInt.java para Main.java, compile e execute:
   ```bash
   cp SomaInt.java Main.java
   javac Main.java
   java Main
   ```
3. Digite dois inteiros (ex.: 10 25) para visualizar SOMA É DE: 35.

---

<p align="center">
  <a href="https://github.com/arthurlynow098">GitHub</a> &nbsp;·&nbsp;
  <a href="https://arthurentsev.vercel.app/">Portfólio</a> &nbsp;·&nbsp;
  <a href="https://www.linkedin.com/in/entsevarthur/">LinkedIn</a>
</p>
