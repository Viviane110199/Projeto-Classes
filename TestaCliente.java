package br.com.generation.poo;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.nome = "Viviane";
		c1.telefone = "(11)94931-7283";
		c1.email = "vivianerego22@gmail.com";
		
		System.out.println(c1.nome);
		System.out.println(c1.telefone);
		System.out.println(c1.email);
		
		c1.comprar(35.00);
		c1.pagar(35.00);
		
		System.out.println();
		
		c2.nome = "Igor";
		c2.telefone = "(11)96354-1212";
		c2.email = "ig2009@gmail.com";
		
		System.out.println(c2.nome);
		System.out.println(c2.telefone);
		System.out.println(c2.email);
		
		c2.comprar(22.00);
		c2.pagar(22.00);
		
		}
	}
