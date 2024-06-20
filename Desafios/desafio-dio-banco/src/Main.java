import com.bancoDigital.model.*;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        // Iniciando objetos para testes
        Banco banco1 = new Banco("Itau", "Itau.com");
        Agencia agencia1 = new Agencia(1212, "1234", "Rua Luiz 2");
        Agencia agencia2 = new Agencia(1213, "1232", "Rua Juan 3");
        Agencia agencia3 = new Agencia(1214, "1245", "Rua Carlos 4");
        Agencia agencia4 = new Agencia(1215, "2345", "Rua Alfredo 5");
        Cliente cliente1 = new Cliente("João", "1209", "joao.com", "1234");
        Cliente cliente2 = new Cliente("Pedro", "1209", "pedo.com", "1235");
        Cliente cliente3 = new Cliente("Tiago", "1209", "james.com", "1236");
        Cliente cliente4 = new Cliente("Toni", "1209", "tonhao.com", "1237");
        Cliente cliente5 = new Cliente("Jorge", "1209", "jorginho.com", "1238");

        // Associando agências
        banco1.associarAgencia(agencia1);
        banco1.associarAgencia(agencia2);
        banco1.associarAgencia(agencia3);
        banco1.associarAgencia(agencia4);

        // Criando contas
        Conta conta1 = banco1.abrirConta(agencia1, cliente1, "Corrente");
        Conta conta2 = agencia1.abrirConta(cliente1, "Poupança");
        Conta conta3 = agencia2.abrirConta(cliente2, "Corrente");
        Conta conta4 = banco1.abrirConta(agencia3, cliente3, "Corrente");
        Conta conta5 = banco1.abrirConta(agencia4, cliente4, "Poupança");
        Conta conta6 = agencia3.abrirConta(cliente5, "Poupança");

        // Exibindo as contas de cada agência
        System.out.println(agencia1.getContas());
        System.out.println(agencia2.getContas());
        System.out.println(agencia3.getContas());
        System.out.println(agencia4.getContas());

        // Adicionando saldo para operações nas contas
        conta1.depositar(100.0);
        conta2.depositar(100.0);
        banco1.pesquisarAgenciaPorNumero(1213).pesquisarContaPorNumero(10003).depositar(100.0);
        banco1.pesquisarAgenciaPorNumero(1214).pesquisarContaPorNumero(10004).depositar(100.0);
        conta5.depositar(100.0);
        conta6.depositar(100.0);

        // Exibindo o extrato das contas
        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
        conta3.imprimirExtrato();
        conta4.imprimirExtrato();
        conta5.imprimirExtrato();
        conta6.imprimirExtrato();

        // Realizando operações nas contas
        double saqueAtual = 0;
        conta1.transferir(50.0, conta2);
        conta3.depositar(300.0);
        conta4.sacar(800.0);
        saqueAtual = conta5.sacar(80.0);
        conta6.depositar(saqueAtual);

        // Exibindo o extrado das contas utilizando stream
        banco1.getAgencias()
                .forEach(a -> a.getContas()
                        .forEach(IConta::imprimirExtrato));

        // Exibindo as contas de cada agência utilizando stream
        banco1.getAgencias()
                .forEach(a -> System.out.println(a.getContas()));
    }
}
