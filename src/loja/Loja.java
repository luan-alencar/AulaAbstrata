package loja;

import java.util.Collections;
import java.util.List;

import loja.bancodedados.BancoDeDados;
import loja.comparadores.ComparadorProdutosPorNome;
import loja.comparadores.ComparadorProdutosPorPrecoAsc;
import loja.comparadores.ComparadorProdutosPorPrecoDesc;
import loja.entidades.Produto;

public class Loja {
	/**
	 * Esse método retorna os produtos ordenados pelo nome (ordem alfabética).
	 */
	public List<Produto> getProdutosOrdenadosPorNome() {
		List<Produto> produtos = BancoDeDados.getProdutos();
		Collections.sort(produtos, new ComparadorProdutosPorNome());
		return produtos;
	}
	
	/**
	 * Esse método retorna os produtos ordenados por preço, do menor para o 
	 * maior.
	 */
	public List<Produto> getProdutosOrdenadosPorPrecoAsc() {
		List<Produto> produtos = BancoDeDados.getProdutos();
		Collections.sort(produtos, new ComparadorProdutosPorPrecoAsc());
		return produtos;
	}
	
	/**
	 * Esse método retorna os produtos ordenados por preço, do maior para o 
	 * menor.
	 */
	public List<Produto> getProdutosOrdenadosPorPrecoDesc() {
		List<Produto> produtos = BancoDeDados.getProdutos();
		Collections.sort(produtos, new ComparadorProdutosPorPrecoDesc());
		return produtos;
	}
	
	public static void main(String[] args) {
		Loja l = new Loja();
		
		System.out.println("------------------------------------");
		System.out.println("Produtos ordenados por nome: ");
		System.out.println("------------------------------------");
		for (Produto p : l.getProdutosOrdenadosPorNome()) {
			System.out.println(p);
		}
		
		System.out.println("\n------------------------------------");
		System.out.println("Produtos ordenados por preço (ASC): ");
		System.out.println("------------------------------------");
		for (Produto p : l.getProdutosOrdenadosPorPrecoAsc()) {
			System.out.println(p);
		}
		
		System.out.println("\n-------------------------------------");
		System.out.println("Produtos ordenados por preço (DESC): ");
		System.out.println("------------------------------------");
		for (Produto p : l.getProdutosOrdenadosPorPrecoDesc()) {
			System.out.println(p);
		}
	}
}
