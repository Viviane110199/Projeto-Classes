package br.com.generation.poo;

public class TestaPatinete {

	public static void main(String[] args) {
		
		Patinete p1 = new Patinete();
		Patinete p2 = new Patinete();
		
		p1.capacete = "Vem com capacete!";
		p1.qntRodas = "Com três rodas!";
		p1.valor = "R$ 189.90";
		
		System.out.println(p1.capacete);
		System.out.println(p1.qntRodas);
		System.out.println(p1.valor);
		
		p1.aprender(0);
		
		System.out.println();
		
		p2.capacete = "Vem com capacete!";
		p2.qntRodas = "Com duas rodas!";
		p2.valor = "R$ 179.90";
		
		System.out.println(p2.capacete);
		System.out.println(p2.qntRodas);
		System.out.println(p2.valor);
		
		p2.brincar(0);

	}

}
