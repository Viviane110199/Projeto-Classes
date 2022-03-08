package br.com.generation.poo;

import java.util.Scanner;

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com agência: ");
		int agencia = entrada.nextInt();		
		
		System.out.println("Entre com o número da conta sem o dígito: ");
		int numConta = entrada.nextInt();
		
		System.out.println("Entre com o dígito da conta: ");
		int digito = entrada.nextInt();

		ContaBancaria c1 = new ContaBancaria();  
		
		c1.setAgencia(agencia);
		c1.setNumConta(numConta);
		c1.setDigito(digito);
		
		System.out.println();
		
		System.out.println("Agência: " + c1.getAgencia());
		System.out.println("Número da conta sem o dígito: " + c1.getNumConta());
		System.out.println("Dígito da conta: " + c1.getDigito());
	}

}
