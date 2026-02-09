# 💱 Conversor de Moedas em Java
 Projeto desenvolvido como desafio do projeto ONE Oracle Next Education G9 (Alura) da formação java orientado a objetos.
 
 O propósito do projeto é desenvolver um sistema de conversão de moedas, utilizando uma API externa em tempo real para obter as cotações atualizadas.

# 📌 Descrição do programa

- Escolha entre diferentes opções de conversão de moedas
- Informe o valor que deseja converter
- Veja o resultado convertido com base na cotação atual

- Consulte a cotação atual de uma moeda específica
- Navegue pelo menu até decidir encerrar o programa

* As cotações são obtidas em tempo real através da API:

## 👉 https://www.exchangerate-api.com/

# 🚀 Funcionalidades

✔ Conversão de:

- Dólar → Peso Argentino

- Peso Argentino → Dólar

- Dólar → Real Brasileiro

- Real Brasileiro → Dólar

- Dólar → Euro

- Euro → Dólar

✔ O usuário pode realizar a Consulta de cotação atual por código internacional (BRL, USD, ARS, EUR, etc.) da moeda de sua escolha

✔ Tratamento de erros:

Entrada inválida de caracteres

Código de moeda inválido

Tentativa automática novamente caso a API não retorne dados

# 🛠 Tecnologias utilizadas

Java 25

HTTP Client

Gson (desserialização de JSON)

API ExchangeRate

Bibliotecas internas Java

# 📚 Estrutura do projeto
```
src
│
├── Classes
│ ├── CodigoInternacional.java
│ ├── ConversionRates.java
│ └── ConexaoAPI.java
│
├── Interacao
│ ├── Escolhas.java
│ └── Interface.java
│
└── Principal.java
```
# 💵 Moedas suportadas para conversão
| Código | Moeda |
|--------|-------|
| USD | Dólar Americano |
| ARS | Peso Argentino |
| BRL | Real Brasileiro |
| EUR | Euro |

# ⚙️ Como executar o projeto

Clone o repositório:
```
git clone https://github.com/Felpsz-Brucciamolino/ConversorDeMoedas.git

```

Gere sua chave gratuita em:

https://www.exchangerate-api.com/

No arquivo ConexaoAPI.java, substitua:
```
"COLOQUE_SUA_CHAVE_API"
```

pela sua chave pessoal da API.

```java
    private final String endereco = "https://v6.exchangerate-api.com/v6/" +
    "COLOQUE_SUA_CHAVE_API" + "/latest/";

    public String Endereco(String valor) {
        return endereco + valor;
    }

    public CodigoInternacional BuscarJson(String valor) {

        try {
            String endereco = "https://v6.exchangerate-api.com/v6/" +
            "COLOQUE_SUA_CHAVE_API" + "/latest/" + valor;
```

Adicione a dependência Gson no projeto

E por fim execute a classe Principal.

# 👨‍💻 Autor

Desenvolvido por Felipe Brusamolin
