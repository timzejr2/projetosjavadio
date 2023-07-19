import java.util.Scanner;
import java.text.DecimalFormat;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.print("Por favor, digite o número da conta: ");
        contaTerminal.numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        contaTerminal.agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        contaTerminal.nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        contaTerminal.saldo = scanner.nextDouble();

        System.out.println("Olá " + contaTerminal.nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("Sua agência é " + contaTerminal.agencia + ", conta " + contaTerminal.numero + " e seu saldo R$" + decimalFormat.format(contaTerminal.saldo) + " já está disponível para saque.");

        scanner.close();

    }
}
