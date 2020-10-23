package loja.comparadores;

import java.util.Comparator;

import loja.entidades.Produto;

public class ComparadorProdutosPorPrecoAsc implements Comparator<Produto> {
	/**
	 * - O que significa o retorno do comparator?
	 * - Significa o ordem dos objetos.
	 * - Como assim?
	 * - Se estivermos comparando dois objetos o1 e o2, os possíveis valores são:
	 *   < 0 se o1 vier antes de o2
	 *   > 0 se o1 vier depois de o2
	 *   = 0 se tanto faz
	 */
	@Override
	public int compare(Produto p1, Produto p2) {
		if (p1.getPreco() < p2.getPreco()) {
			return -1;
		} else if (p1.getPreco() > p2.getPreco()) {
			return +1;
		}
		
		return 0;
	}
}
