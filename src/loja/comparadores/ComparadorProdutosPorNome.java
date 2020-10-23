package loja.comparadores;

import java.util.Comparator;

import loja.entidades.Produto;

public class ComparadorProdutosPorNome implements Comparator<Produto> {
	@Override
	public int compare(Produto p1, Produto p2) {
		return p1.getNome().compareTo(p2.getNome());
	}
}
