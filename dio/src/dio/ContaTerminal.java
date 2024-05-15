package dio;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String args[]) throws Exception {
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		Scanner in = new Scanner(System.in);
		System.out.println("Por favor, insira seu nome: ");
		nomeCliente = in.nextLine();
		System.out.println("Por favor, insira o numero da sua conta: ");
		while(!in.hasNextInt()) {
			System.out.println("Por favor, insira um número válido.");
			in.next();
		}
		numero = in.nextInt();
		in.nextLine();
		System.out.println("Por favor, insira o seu numero de agência: ");
		agencia = in.nextLine();
		System.out.println("Por favor, insira seu saldo: ");
		while(!in.hasNextDouble()) {
			System.out.println("Por favor, insira um saldo válido.");
			in.next();
		}
		saldo = in.nextDouble();
		System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque.");
	}

}
