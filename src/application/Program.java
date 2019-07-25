package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) throws DomainExceptions {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Informe os dados da conta : ");
			System.out.println("Número da conta : ");
			int numConta = sc.nextInt();
			System.out.println("Titular : ");
			sc.nextLine();
			String titular = sc.nextLine();
			System.out.println("Saldo inicial : ");
			double saldo = sc.nextDouble();
			System.out.println("Limite do saque: ");
			double limiteSaque = sc.nextDouble();
			Conta conta = new Conta(numConta, titular, saldo, limiteSaque);
			System.out.println(" ");
			System.out.println("------------------------------------------ ");
			System.out.println("Informe o valor do saque : ");
			double valor = sc.nextDouble();
			conta.saque(valor);
			System.out.println(conta);
		} catch (DomainExceptions e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
