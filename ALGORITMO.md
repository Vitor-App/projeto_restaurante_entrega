# Algoritmo do sistema de pedidos

1. Inicializar o contador de pedidos, o acumulador do total vendido e os valores de maior e menor compra.
2. Repetir enquanto o operador desejar cadastrar pedidos:
   - solicitar o nome do cliente;
   - solicitar o valor da compra;
   - enquanto o valor for menor ou igual a zero, solicitar novamente um valor válido;
   - incrementar a quantidade de pedidos;
   - somar o valor ao total vendido;
   - atualizar o maior e o menor valor de compra;
   - perguntar se deseja cadastrar outro pedido.
3. Calcular o ticket médio dividindo o total vendido pela quantidade de pedidos.
4. Exibir o relatório final com a quantidade de pedidos, o total vendido, o ticket médio, a maior compra e a menor compra.

## Dados utilizados

- **Contador:** quantidade total de pedidos.
- **Acumulador:** valor total vendido.
- **Variáveis de controle:** maior e menor compra.
- **Entrada:** nome do cliente, valor da compra e opção de continuar.
- **Decisões:** validação do valor e controle da repetição.
