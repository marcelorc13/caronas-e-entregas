public class Carona extends Pedido implements IPedido {
    private int nDePessoas;

    public Carona(String codigoPedido, Cliente cliente, Motorista motorista, Endereco enderecoInicial, Endereco enderecoFinal, int nDePessoas) {
        super(codigoPedido, cliente, motorista, enderecoInicial, enderecoFinal);
        this.nDePessoas = nDePessoas;
    }

    @Override
    public void fazerPedido() {
        System.out.println("Pedido realizado com sucesso!");
    }

    public int getNDePessoas() {
        return nDePessoas;
    }

    public void setNDePessoas(int nDePessoas) {
        this.nDePessoas = nDePessoas;
    }
}
