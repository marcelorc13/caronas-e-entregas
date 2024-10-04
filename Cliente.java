
import java.time.LocalDate;

public class Cliente extends Pessoa {

    private String nCartaoDeCredito;

    public Cliente(String nome, String sobrenome, String cpf, String email, String telefone, LocalDate dataDeNascimento, String nCartaoDeCredito) {
        super(nome, sobrenome, cpf, email, telefone, dataDeNascimento);
        this.nCartaoDeCredito = nCartaoDeCredito;
    }

    public String getnCartaoDeCredito() {
        return nCartaoDeCredito;
    }

    public void setnCartaoDeCredito(String nCartaoDeCredito) {
        this.nCartaoDeCredito = nCartaoDeCredito;
    }
}
