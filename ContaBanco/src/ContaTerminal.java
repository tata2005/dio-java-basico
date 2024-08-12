import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.nextLine(); 
        System.out.println("Digite o numero da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a agencia: ");       
        String agencia = sc.nextLine();
        System.out.println("Digite o saldo: ");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque.");
    }
}
