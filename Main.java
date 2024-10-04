
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Cliente cadastrarCliente() {
        System.out.println("Cadastre o Cliente");
        System.out.println("Insira os seguintes dados: ");

        System.out.println("Nome:");
        Scanner scanNome = new Scanner(System.in);
        String nome = scanNome.nextLine();

        System.out.println("Sobrenome");
        Scanner scanSobrenome = new Scanner(System.in);
        String sobrenome = scanSobrenome.nextLine();
        System.out.println("CPF: ");
        Scanner scanCpf = new Scanner(System.in);
        String cpf = scanCpf.nextLine();

        System.out.println("Email: ");
        Scanner scanEmail = new Scanner(System.in);
        String email = scanEmail.nextLine();

        System.out.println("Telefone: ");
        Scanner scanTelefone = new Scanner(System.in);
        String telefone = scanTelefone.nextLine();

        System.out.println("Data de Nascimento: ");
        Scanner scanDataDeNascimento = new Scanner(System.in);
        String dataDeNascimentoString = scanDataDeNascimento.nextLine();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDeNascimento = LocalDate.parse(dataDeNascimentoString, fmt);

        System.out.println("Numero do Cartao de Credito: ");
        Scanner scanNCartaoDeCredito = new Scanner(System.in);
        String nCartaoDeCredito = scanNCartaoDeCredito.nextLine();

        Cliente cliente = new Cliente(nome, sobrenome, cpf, email, telefone, dataDeNascimento, nCartaoDeCredito);

        // System.out.println("Nome: " + cliente.getNome());
        // System.out.println("Sobrenome: " + cliente.getSobrenome());
        // System.out.println("CPF: " + cliente.getCpf());
        // System.out.println("Email: " + cliente.getEmail());
        // System.out.println("Telefone: " + cliente.getTelefone());
        // System.out.println("Data de Nascimento: " + cliente.getDataDeNascimento());
        // System.out.println("Numero do Cartao de Credito: " + cliente.getnCartaoDeCredito());
        return cliente;
    }

    static Motorista cadastrarMotorista() {
        System.out.println("Cadastre o Motorista");
        System.out.println("Insira os seguintes dados: ");

        System.out.println("Nome:");
        Scanner scanNome = new Scanner(System.in);
        String nome = scanNome.nextLine();

        System.out.println("Sobrenome");
        Scanner scanSobrenome = new Scanner(System.in);
        String sobrenome = scanSobrenome.nextLine();
        System.out.println("CPF: ");
        Scanner scanCpf = new Scanner(System.in);
        String cpf = scanCpf.nextLine();

        System.out.println("Email: ");
        Scanner scanEmail = new Scanner(System.in);
        String email = scanEmail.nextLine();

        System.out.println("Telefone: ");
        Scanner scanTelefone = new Scanner(System.in);
        String telefone = scanTelefone.nextLine();

        System.out.println("Data de Nascimento: ");
        Scanner scanDataDeNascimento = new Scanner(System.in);
        String dataDeNascimentoString = scanDataDeNascimento.nextLine();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDeNascimento = LocalDate.parse(dataDeNascimentoString, fmt);

        System.out.println("Numero da CNH: ");
        Scanner scanNumeroCnh = new Scanner(System.in);
        String numeroCnh = scanNumeroCnh.nextLine();

        System.out.println("Possui Atividade Remunerada na CNH? Se sim digite (1), se nao digite (2): ");
        Scanner scanAtividadeRemunerada = new Scanner(System.in);

        boolean possuiAtividadeRemunerada = false;
        int atividadeRemunerada;
        try {
            atividadeRemunerada = scanAtividadeRemunerada.nextInt();
            switch (atividadeRemunerada) {
                case 1 -> {
                    possuiAtividadeRemunerada = true;
                }
                case 2 -> {
                    possuiAtividadeRemunerada = false;
                }

                default -> {
                    System.out.println("Valor inválido. Digite 1 ou 2.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido. Digite um número inteiro (1 ou 2).");
        }

        Motorista motorista = new Motorista(nome, sobrenome, cpf, email, telefone, dataDeNascimento, numeroCnh, possuiAtividadeRemunerada);
        return motorista;
    }

    public static void main(String args[]) {
        Cliente cliente = cadastrarCliente();
        if (!cliente.verificarIdade()) {
            throw new ArithmeticException("O cliente eh menor de idade, nao pode ser cadastrado");
        }
        Motorista motorista = cadastrarMotorista();
        if (!motorista.verificarIdade()) {
            throw new ArithmeticException("O motorista eh menor de idade, nao pode ser cadastrado");
        }
        if (!motorista.verificarMotorista()) {
            throw new ArithmeticException("O motorista não possui carteira com atividade remunerada, nao pode ser cadastrado");
        }
    }

}
