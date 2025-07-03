import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Entre com o número da agência");
        var agencia = scanner.next();
        System.out.println("Entre com o número da conta");
        var numero = scanner.nextInt();
        System.out.println("Entre com o nome do cliente");
        var nome = scanner.next();
        System.out.println("Entre com o saldo");
        var saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %6.2f já está disponível para saque",
          nome, agencia, numero, saldo);
    }
}
