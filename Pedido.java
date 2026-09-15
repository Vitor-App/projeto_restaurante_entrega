public class Pedido {
    private final String nomeCliente;
    private final double valorCompra;

    public Pedido(String nomeCliente, double valorCompra) {
        this.nomeCliente = nomeCliente;
        this.valorCompra = valorCompra;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }
}
