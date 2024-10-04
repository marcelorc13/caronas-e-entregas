
import java.time.LocalDate;

public class Motorista extends Pessoa {

    private Veiculo veiculo;
    private String numeroCnh;
    private boolean possuiAtividadeRemunerada;

    public Motorista(String nome, String sobrenome, String cpf, String email, String telefone, LocalDate dataDeNascimento, String numeroCnh, boolean possuiAtividadeRemunerada) {
        super(nome, sobrenome, cpf, email, telefone, dataDeNascimento);
        this.numeroCnh = numeroCnh;
        this.possuiAtividadeRemunerada = possuiAtividadeRemunerada;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getNumeroCnh() {
        return numeroCnh;
    }

    public void setNumeroCnh(String numeroCnh) {
        this.numeroCnh = numeroCnh;
    }

    public boolean isPossuiAtividadeRemunerada() {
        return possuiAtividadeRemunerada;
    }

    public void setPossuiAtividadeRemunerada(boolean possuiAtividadeRemunerada) {
        this.possuiAtividadeRemunerada = possuiAtividadeRemunerada;
    }

    public boolean verificarMotorista(){
        return this.possuiAtividadeRemunerada;
    }
}
