# Como executar

## Pré-requisito

É necessário ter o JDK 21 ou uma versão compatível instalada, incluindo o comando `javac`.

## Compilação

Na raiz do projeto, execute:

```bash
mkdir -p out
javac -d out src/*.java
```

## Execução

Depois da compilação, execute:

```bash
java -cp out Main
```

O programa solicitará o nome do cliente, o valor da compra e se deve cadastrar outro pedido. Ao escolher `2 - Não`, o relatório final será exibido.

Para valores monetários, use ponto ou vírgula como separador decimal, por exemplo `35.50` ou `35,50`.
