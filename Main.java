
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

    static Endereco cadastrarEnderecoInicial() {
        try {
            System.out.println("Insira o endereco incial");

            System.out.println("Logradouro: ");
            Scanner scanLogradouro = new Scanner(System.in);
            String logradouro = scanLogradouro.nextLine();

            System.out.println("Numero: ");
            Scanner scanNumero = new Scanner(System.in);
            int numero = scanNumero.nextInt();
            scanNumero.nextLine();

            System.out.println("Complemento: ");
            Scanner scanComplemento = new Scanner(System.in);
            String complemento = scanComplemento.nextLine();

            Endereco enderecoInicial = new Endereco(logradouro, numero, complemento);

            return enderecoInicial;
        } catch (InputMismatchException e) {
            System.out.println("Erro: Número do endereço inválido. Por favor, insira um número inteiro.");
            throw e;
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao cadastrar o endereço: " + e.getMessage());
            throw e;
        }

    }

    static Endereco cadastrarEnderecoFinal() {
        try {
            System.out.println("Insira o endereco final");

            System.out.println("Logradouro: ");
            Scanner scanLogradouro = new Scanner(System.in);
            String logradouro = scanLogradouro.nextLine();

            System.out.println("Numero: ");
            Scanner scanNumero = new Scanner(System.in);
            int numero = scanNumero.nextInt();
            scanNumero.nextLine();

            System.out.println("Complemento: ");
            Scanner scanComplemento = new Scanner(System.in);
            String complemento = scanComplemento.nextLine();

            Endereco enderecoFinal = new Endereco(logradouro, numero, complemento);
            return enderecoFinal;
        } catch (InputMismatchException e) {
            System.out.println("Erro: Número do endereço inválido. Por favor, insira um número inteiro.");
            throw e;
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao cadastrar o endereço: " + e.getMessage());
            throw e;
        }

    }

    static Veiculo cadastrarVeiculo(){
        System.out.println("Cadastre o veiculo do motorista");
        System.out.println("Placa: ");
        Scanner scanPlaca = new Scanner(System.in);
        String placa = scanPlaca.nextLine();

        System.out.println("Modelo: ");
        Scanner scanModelo = new Scanner(System.in);
        String modelo = scanModelo.nextLine();

        System.out.println("Cor: ");
        Scanner scanCor = new Scanner(System.in);
        String cor = scanCor.nextLine();

        Veiculo veiculo = new Veiculo(placa, modelo, cor);
        return veiculo;
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
        Veiculo veiculo = cadastrarVeiculo();

        motorista.setVeiculo((veiculo));

        Endereco enderecoInicial = cadastrarEnderecoInicial();
        Endereco enderecoFinal = cadastrarEnderecoFinal();

        try (Scanner scanDecisao = new Scanner(System.in)) {
            int decisao;
            boolean decisaoValida = false;
            
            while (!decisaoValida) {
                try {
                    System.out.println("Para pedir uma Carona digite (1) ou Para pedir uma Entrega digite (2):");
                    decisao = scanDecisao.nextInt();
                    scanDecisao.nextLine();
                    
                    double nDePedidoAleatorio = Math.random() * 1000000;
                    String nDoPedido = Double.toString(Math.round(nDePedidoAleatorio));
                    
                    switch (decisao) {
                        case 1 -> {
                            System.out.println("Insira o numero de passageiros");
                            Scanner scanNDePassageiros = new Scanner(System.in);
                            int nDePassageiros = scanNDePassageiros.nextInt();
                            scanNDePassageiros.nextLine();
                            
                            Carona carona = new Carona(nDoPedido, cliente, motorista, enderecoInicial, enderecoFinal, nDePassageiros);
                            carona.fazerPedido();
                            
                            System.out.println("Status do pedido: ");
                            System.out.println("Tipo: Carona");
                            System.out.println("Numero do Pedido: " + nDoPedido);
                            System.out.println("Feito por: " + cliente.getNome());
                            System.out.println("Motorista: " + motorista.getNome());
                            System.out.println("Placa: " + motorista.getVeiculo().getPlaca());
                            System.out.println("Cor: " + motorista.getVeiculo().getCor());
                            System.out.println("Endereco Inicial: " + enderecoInicial.getLogradouro() + ", " + enderecoInicial.getNumero() + ", "+ enderecoInicial.getComplemento());
                            System.out.println("Endereco Final: " + enderecoFinal.getLogradouro() + ", " + enderecoFinal.getNumero() + ", "+ enderecoFinal.getComplemento());
                            
                            decisaoValida = true;
                        }
                        case 2 -> {
                            System.out.println("Insira o conteudo da entrega");
                            Scanner scanConteudo = new Scanner(System.in);
                            String conteudo = scanConteudo.nextLine();
                            
                            Entrega entrega = new Entrega(nDoPedido, cliente, motorista, enderecoInicial, enderecoFinal, conteudo);
                            entrega.fazerPedido();
                            
                            
                            System.out.println("Status do pedido: ");
                            System.out.println("Tipo: Entrega");
                            System.out.println("Numero do Pedido: " + nDoPedido);
                            System.out.println("Conteudo: " + conteudo);
                            System.out.println("Feito por: " + cliente.getNome());
                            System.out.println("Motorista: " + motorista.getNome());
                            System.out.println("Placa: " + motorista.getVeiculo().getPlaca());
                            System.out.println("Cor: " + motorista.getVeiculo().getCor());
                            System.out.println("Endereco Inicial: " + enderecoInicial.getLogradouro() + ", " + enderecoInicial.getNumero() + ", "+ enderecoInicial.getComplemento());
                            System.out.println("Endereco Final: " + enderecoFinal.getLogradouro() + ", " + enderecoFinal.getNumero() + ", "+ enderecoFinal.getComplemento());
                            
                            decisaoValida = true;
                        }
                        default ->
                            System.out.println("Opcao invalida. Por favor, insira 1 ou 2.");
                    }
                } catch (InputMismatchException e) {
                    
                    System.out.println("Valor inválido. Por favor, insira um número inteiro (1 ou 2).");
                    scanDecisao.nextLine();
                }
            }
        }
    }

}
