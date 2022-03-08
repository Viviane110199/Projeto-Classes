package br.com.generation.poo;

import java.util.Scanner;

public class TestaPaciente {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número da ficha do paciente: ");
		int numFicha = entrada.nextInt();		
		
		System.out.println("Entre com o nome completo do paciente: ");
		String nomeCompleto = entrada.next();
		
		System.out.println("Entre com a data de nascimento do paciente: ");
		String dataNasc = entrada.next();

		Paciente p1 = new Paciente();  
		
		p1.setNumFicha(numFicha);
		p1.setNomeCompleto(nomeCompleto);
		p1.setDataNasc(dataNasc);
		
		System.out.println();
		
		System.out.println("Número da ficha do paciente: " + p1.getNumFicha());
		System.out.println("Nome completo do paciente: " + p1.getNomeCompleto());
		System.out.println("Data de nascimento do paciente: " + p1.getDataNasc());
}	
}
