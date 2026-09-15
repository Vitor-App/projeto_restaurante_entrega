import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {
            int quantidadePedidos = 0;
            double valorTotal = 0.0;
            double maiorCompra = 0.0;
            double menorCompra = 0.0;
            int continuar = 1;

            System.out.println("=== SISTEMA DE PEDIDOS ===");

            while (continuar == 1) {
                System.out.print("\nNome do cliente: ");
                String nomeCliente = scanner.nextLine().trim();

                while (nomeCliente.isEmpty()) {
                    System.out.print("O nome não pode ficar vazio. Informe novamente: ");
                    nomeCliente = scanner.nextLine().trim();
                }

                double valorCompra = lerValorCompra(scanner);

                Pedido pedido = new Pedido(nomeCliente, valorCompra);
                quantidadePedidos++;
                valorTotal += pedido.getValorCompra();

                if (quantidadePedidos == 1) {
                    maiorCompra = pedido.getValorCompra();
                    menorCompra = pedido.getValorCompra();
                } else {
                    if (pedido.getValorCompra() > maiorCompra) {
                        maiorCompra = pedido.getValorCompra();
                    }
                    if (pedido.getValorCompra() < menorCompra) {
                        menorCompra = pedido.getValorCompra();
                    }
                }

                System.out.println("\nCadastrar novo pedido?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                continuar = scanner.nextInt();
                scanner.nextLine();
            }

            exibirRelatorio(quantidadePedidos, valorTotal, maiorCompra, menorCompra);
        }
    }

    private static void exibirRelatorio(int quantidadePedidos, double valorTotal,
                                        double maiorCompra, double menorCompra) {
        System.out.println("\n===== RELATÓRIO FINAL =====");
        System.out.printf("Quantidade de pedidos: %d%n", quantidadePedidos);
        System.out.printf("Valor total vendido: R$ %.2f%n", valorTotal);

        if (quantidadePedidos > 0) {
            double ticketMedio = valorTotal / quantidadePedidos;
            System.out.printf("Ticket médio: R$ %.2f%n", ticketMedio);
            System.out.printf("Maior compra: R$ %.2f%n", maiorCompra);
            System.out.printf("Menor compra: R$ %.2f%n", menorCompra);
        }
    }

    private static double lerValorCompra(Scanner scanner) {
        while (true) {
            System.out.print("Valor da compra: ");
            String entrada = scanner.nextLine().trim().replace(',', '.');

            try {
                double valor = Double.parseDouble(entrada);
                if (valor > 0) {
                    return valor;
                }
            } catch (NumberFormatException ignored) {
                // A mensagem abaixo orienta o usuário a informar um número válido.
            }

            System.out.println("O valor deve ser um número maior que zero.");
        }
    }
}
