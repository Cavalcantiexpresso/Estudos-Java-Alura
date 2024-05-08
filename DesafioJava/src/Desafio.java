import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Luciano Paiva";
        String tipoConta = "Corrente";
        double saldo =  2500.00;
        int opcao = 0;

        System.out.println("********************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n********************************");

        String menu = """
                ** Digite uma das opções**
                1 - Consultar saldo
                2 - tranferir valor
                3 - Receber saldo
                4- Sair
                               
                """;

        Scanner leitura = new Scanner(System.in);

        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("Saldo atual é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que sedeja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("não há saldo ");
                }else {
                    saldo -=  valor;
                    System.out.println("Saldo Atual " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atual é: " + saldo);
            }else if (opcao != 4){
                System.out.println("Opção inválida");
            }
        }
    }
}
