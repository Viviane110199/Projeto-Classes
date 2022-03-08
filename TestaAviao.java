package br.com.generation.poo;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao a1 = new Aviao();
		Aviao a2 = new Aviao();
		
		a1.numPoltrona = "Poltrona 11";
		a1.janela = "Assento da janela";
		
		System.out.println(a1.numPoltrona);
		System.out.println(a1.janela);
		
		a1.sentar(0); 
		a1.colocarCinto(0);
		
		System.out.println();
		
		a2.numPoltrona = "Poltrona 28";
		a2.corredor = "Assento do corredor";
		
		System.out.println(a2.numPoltrona);
		System.out.println(a2.corredor);
		
		a2.sentar(0);
		a2.colocarCinto(0);
	}

}
