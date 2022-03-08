package br.com.generation.poo;

public class Cliente {

	String nome;
	String telefone;
	String email;

	void comprar(double comprou) {
		System.out.println("Cliente comprou: R$ " + comprou + " reais");
	}
	
	void pagar(double pagou) {
		System.out.println("Cliente pagou: R$ " + pagou + " reais");
	}
	
}
