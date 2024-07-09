import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nome = "Geová";
        String tipoConta = "Corrente";
        double saldo = 10000.00;
        int opcao = 0;


        String menu = """
                ******************************************
                DADOS INCIAIS DO CLIENTE 
                                
                1 - Nome: Geová
                2 - Tipo de Conta: Corrente                
                3 - Saldo Inicial: R$ 10.0000,00  
                             
                ******************************************
                """;
        System.out.println(menu);
        String operacoes = """
                                
                Operações
                                
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                                
                Digite a opção desejada:
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(operacoes);
            opcao = leitura.nextInt();


            if (opcao == 1) {
                System.out.println("Seu saldo atual é de R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor para transferência: ");
                double valor = leitura.nextDouble();
                if (saldo >= valor) {
                    saldo -= valor;
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor para ser recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
            } else if(opcao != 4){
                System.out.println("Opção inexistente! Tente novamente.");
            }

        }
    }
}
