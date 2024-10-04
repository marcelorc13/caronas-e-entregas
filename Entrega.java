
public class Entrega extends Pedido implements IPedido {

    private String conteudo;

    public Entrega(String codigoPedido, Cliente cliente, Motorista motorista, Endereco enderecoInicial, Endereco enderecoFinal, String conteudo) {
        super(codigoPedido, cliente, motorista, enderecoInicial, enderecoFinal);
        this.conteudo = conteudo;
    }

    @Override
    public void fazerPedido() {
        System.out.println("Pedido de Entrega com sucesso!");
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
