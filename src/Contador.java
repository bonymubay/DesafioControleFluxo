import java.text.DecimalFormat;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        DecimalFormat df = new DecimalFormat("#.#");




        try{
            System.out.println("Informe o seu sado atual");
            double saldoAtual = scanner.nextDouble();
            double numeroArredondado = Math.round(saldoAtual * 10.0) / 10.0;

            System.out.println("Digite o valor a depositar: ");
            double valorDeposito = scanner.nextDouble();
            saldoAtual= saldoAtual+valorDeposito;

            System.out.println("Quanto deseja retirar da sua conta: ");
            double valorRetirada = scanner.nextDouble();
            saldoAtual= saldoAtual-valorRetirada;


            System.out.println("Seu sado: "+ df.format(saldoAtual));

        }catch(Exception e){

            System.out.println("Dados Ivalidos");
        }

        //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.

        //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
    }
}