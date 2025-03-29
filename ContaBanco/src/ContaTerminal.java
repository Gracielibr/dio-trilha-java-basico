import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Por favor, digite o número da sua agência ");
        String agencia = scanner.next();

        System.out.printf("Agora digite o número da sua conta ");
        int numero = scanner.nextInt();

        System.out.printf("Digite seu nome ");
        String nome = scanner.next();

        System.out.printf("Digite o valor do saldo ");
        double saldo = scanner.nextDouble();

        System.out.printf(" Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", com a conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
        


    }
    
}

