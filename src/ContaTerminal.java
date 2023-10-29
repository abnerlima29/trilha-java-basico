import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declarando variaveis e seus tipos
        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 237.48;

        //Saída e entrada de dados
        System.out.println("***Banco do Desenvolvedor***");
        System.out.println("Por favor, digite o numero da sua agencia!");
        agencia = sc.next();

        //Saída e entrada de dados
        System.out.println("Por favor, digite o numero da conta!");
        numeroConta = sc.nextInt();

        //Saída e entrada de dados
        System.out.println("Por favor, agora digite o seu nome!");
        nomeCliente = sc.next();

        //Resultado final
        System.out.println("Olá," + " " + nomeCliente + "!" + " " + "Obrigado por criar uma conta em nosso banco, sua agência é:" + " " + agencia + " " + "e o número da sua conta é:" + " " + numeroConta + "!" + " " + "Verifique o saldo disponivel para saque:" + " " + "R$"+saldo);
        System.out.println("***Agradecemos a preferencia***");


        }
    }
