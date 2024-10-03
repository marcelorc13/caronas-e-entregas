public class Entrega extends Pedido {
    private int nDePessoas;

    public Entrega(String codigoPedido, Cliente cliente, Motorista motorista, Endereco enderecoInicial, Endereco enderecoFinal, int nDePessoas) {
        super(codigoPedido, cliente, motorista, enderecoInicial, enderecoFinal);
        this.nDePessoas = nDePessoas;
    }

    public int getNDePessoas() {
        return nDePessoas;
    }

    public void setNDePessoas(int nDePessoas) {
        this.nDePessoas = nDePessoas;
    }
}
