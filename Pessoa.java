
import java.time.LocalDate;

public class Pessoa {

    protected String nome;
    protected String sobrenome;
    protected String cpf;
    protected String email;
    protected String telefone;
    protected LocalDate dataDeNascimento;

    public Pessoa(String nome, String sobrenome, String cpf, String email, String telefone, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    //Retorna true se for de maior, e false se não for, caso seja de menor, é proibido cadastrar essas pessoa
    public boolean verificarIdade() {
        LocalDate diaHoje = LocalDate.now();

        int idade = dataDeNascimento.until(diaHoje).getYears();

        return idade >= 18;
    }
}
