import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o seu nome?");
            String nome = scanner.next();
        System.out.println("Qual a sua agência?");
            String agencia = scanner.next();
        System.out.println("Qual a sua conta?");
            int conta =scanner.nextInt();
        System.out.println("Qual seu saldo?");
            double saldo = scanner.nextDouble();

        System.out.print("Olá ,"+ nome +"!" + " Obrigado por criar uma conta em nosso banco, sua agencia é " +
        agencia + ", conta " + conta + " e seu saldo: " + saldo + " já disponível para saque.");
    }
}