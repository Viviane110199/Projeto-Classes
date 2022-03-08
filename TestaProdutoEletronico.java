package br.com.generation.poo;

public class TestaProdutoEletronico {

	public static void main(String[] args) {

		ProdutoEletronico p1 = new ProdutoEletronico();
		ProdutoEletronico p2 = new ProdutoEletronico();
		
		p1.tipoAparelho = "Celular";
		p1.marca = "Motorola";
		p1.valor = "R$ 1.499,99";
		
		System.out.println(p1.tipoAparelho);
		System.out.println(p1.marca);
		System.out.println(p1.valor);
		
		p1.ligar(0);
		
		System.out.println();
		
		p2.tipoAparelho = "Notebook";
		p2.marca = "HP";
		p2.valor = "R$ 3.599,99";
		
		System.out.println(p2.tipoAparelho);
		System.out.println(p2.marca);
		System.out.println(p2.valor);
		
		p2.pesquisar(0);
		
	}

}
