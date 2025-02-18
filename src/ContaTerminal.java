import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite seu saldo!");
        double saldo = scanner.nextDouble();
        System.out.println("Olá "+  nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+
                agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque.");



    }
}