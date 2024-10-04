public class Pedido {
    private String codigoPedido;
    private Cliente cliente;
    private Motorista motorista;
    private Endereco enderecoInicial;
    private Endereco enderecoFinal;

    public Pedido(String codigoPedido, Cliente cliente, Motorista motorista, Endereco enderecoInicial, Endereco enderecoFinal) {
        this.codigoPedido = codigoPedido;
        this.cliente = cliente;
        this.motorista = motorista;
        this.enderecoInicial = enderecoInicial;
        this.enderecoFinal = enderecoFinal;
    }



    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Endereco getEnderecoInicial() {
        return enderecoInicial;
    }

    public void setEnderecoInicial(Endereco enderecoInicial) {
        this.enderecoInicial = enderecoInicial;
    }

    public Endereco getEnderecoFinal() {
        return enderecoFinal;
    }

    public void setEnderecoFinal(Endereco enderecoFinal) {
        this.enderecoFinal = enderecoFinal;
    }
}
