
public class Carro extends Veiculo {

    private String combustivel;
    private int capacidade;

    public Carro(String placa, String modelo, String cor, String combustivel, int capacidade) {
        super(placa, modelo, cor);
        this.combustivel = combustivel;
        this.capacidade = capacidade;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
