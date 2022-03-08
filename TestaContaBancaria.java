package br.com.generation.poo;

import java.util.Scanner;

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com ag�ncia: ");
		int agencia = entrada.nextInt();		
		
		System.out.println("Entre com o n�mero da conta sem o d�gito: ");
		int numConta = entrada.nextInt();
		
		System.out.println("Entre com o d�gito da conta: ");
		int digito = entrada.nextInt();

		ContaBancaria c1 = new ContaBancaria();  
		
		c1.setAgencia(agencia);
		c1.setNumConta(numConta);
		c1.setDigito(digito);
		
		System.out.println();
		
		System.out.println("Ag�ncia: " + c1.getAgencia());
		System.out.println("N�mero da conta sem o d�gito: " + c1.getNumConta());
		System.out.println("D�gito da conta: " + c1.getDigito());
	}

}
